package OOP_Java.Paper_Rock_Scissors;

public abstract class abstract_player_name {

    /**
     * Created by Adil Myktybek
     * on 18.11.2020, 18:05
     */

    private String player_name;

    abstract_player_name(){}

    public abstract_player_name(String player_name_main){
        player_name = player_name_main;
    }

    public String get_name(){ return player_name;}

    abstract public String player_name_print();
}