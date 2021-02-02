package OOP_Java.Paper_Rock_Scissors;

public class PVP extends abstract_player_name{

    /**
     * Created by Adil Myktybek
     * on 18.11.2020, 18:05
     */

    private String choice1;
    private String choice2;
    private String another_player_name;

    public PVP(){}

    public PVP (String player_name, String choice1_main, String choice2_main, String another_player_name_main){
        super(player_name);
        this.choice1 = choice1_main;
        this.choice2 = choice2_main;
        this.another_player_name = another_player_name_main;
    }

    @Override
    public String player_name_print() {
        return get_name();
    }

    public String getChoice1(){ return choice1; }
    public String getChoice2(){ return choice2; }
    public String getAnother_player_name(){ return another_player_name; }
}