package OOP_Java.News;

public abstract class abstract_main {
    /**
     *
     * Created by Adil Myktybek
     * on 21.11.2020, 00:37
     *
     */
    // private String topic_of_the_text;
    private String date;

    public abstract_main(){}

    public abstract_main(String date_main){
        this.date = date_main;
    }

    public String getDate() { return date; }

    abstract void topic_of_the_text();
}
