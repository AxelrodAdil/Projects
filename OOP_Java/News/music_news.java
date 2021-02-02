package OOP_Java.News;

public class music_news extends abstract_main{
    /**
     *
     * Created by Adil Myktybek
     * on 21.11.2020, 00:37
     *
     */
    private String topic;

    public music_news(){}

    public music_news(String date_main, String topic_main){
        super(date_main);
        this.topic = topic_main;
    }

    @Override
    void topic_of_the_text() {
        System.out.print(getTopicMusic());
    }

    public String getTopicMusic(){ return topic; }
}
