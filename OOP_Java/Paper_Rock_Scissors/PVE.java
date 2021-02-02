package OOP_Java.Paper_Rock_Scissors;

public class PVE extends abstract_player_name{

    /**
     * Created by Adil Myktybek
     * on 18.11.2020, 18:05
     */

    private String choice;

    public PVE(){}

    public PVE (String player_name, String choice_main){
        super(player_name);
        this.choice = choice_main;
    }

    @Override
    public String player_name_print() {
        return get_name();
    }

    public String getChoice(){ return choice; }
}
