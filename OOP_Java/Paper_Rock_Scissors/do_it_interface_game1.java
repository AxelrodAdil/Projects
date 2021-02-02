package OOP_Java.Paper_Rock_Scissors;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class do_it_interface_game1 implements Interface_game {

    /**
     * Created by Adil Myktybek
     * on 18.11.2020, 18:05
     */

    private ArrayList<abstract_player_name> names = new ArrayList<>();

    @Override
    public void addPlayer(abstract_player_name name_player) {
        names.add(name_player);
    }

    @Override
    public String winner_is() {
        HashMap<Integer, String> choiceOfGame = new HashMap<>();
        choiceOfGame.put(0, "paper");
        choiceOfGame.put(1, "rock");
        choiceOfGame.put(2, "scissors");

        int line = 0;
        int column = 0;
        String name1 = "";
        String name2 = "";

        for (abstract_player_name apn : names) {
            if (apn instanceof PVP) {
                String temp1 = ((PVP) apn).getChoice1();
                String temp2 = ((PVP) apn).getChoice2();
                name1 = apn.get_name();
                name2 = ((PVP) apn).getAnother_player_name();

                for (Map.Entry<Integer, String> entry : choiceOfGame.entrySet()) {
                    if (entry.getValue().equals(temp1)) {
                        column = entry.getKey();
                        break;
                    }
                }
                for (Map.Entry<Integer, String> entry : choiceOfGame.entrySet()) {
                    if (entry.getValue().equals(temp2)) {
                        line = entry.getKey();
                        break;
                    }
                }
            }

            if (apn instanceof PVE) {
                String temp1 = ((PVE) apn).getChoice();
                name1 = apn.get_name();
                name2 = "Computer";

                for (Map.Entry<Integer, String> entry : choiceOfGame.entrySet()) {
                    if (entry.getValue().equals(temp1)) {
                        column = entry.getKey();
                        break;
                    }
                }

                Random random = new Random();
                line = random.nextInt(3);
                System.out.println("here random: " + line);    // bugs
            }
        }

        HashMap<Integer, String> map_main = new HashMap<>();
        map_main.put(0, "Tie");
        map_main.put(1, name2);
        map_main.put(2, name1);
        map_main.put(3, name1);
        map_main.put(4, "Tie");
        map_main.put(5, name2);
        map_main.put(6, name2);
        map_main.put(7, name1);
        map_main.put(8, "Tie");

        int formula = line * 3 + column;
        String str = map_main.get(formula);
        // System.out.println("STR: " + str);
        return str;
    }

}

