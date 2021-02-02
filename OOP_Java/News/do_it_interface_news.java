package OOP_Java.News;

import java.util.ArrayList;

public class do_it_interface_news implements interface_main {
    /**
     * Created by Adil Myktybek
     * on 21.11.2020, 00:37
     */
    private ArrayList<abstract_main> full_news = new ArrayList<>();

    @Override
    public void addNews(abstract_main date) {
        full_news.add(date);
    }

    @Override
    public String print_all_news(int temp_) {
        String print_it = "-";
        for (abstract_main abm : full_news) {
            print_it = "[" + temp_ + "] ";
            System.out.print("\n" + print_it);
            abm.topic_of_the_text();
            temp_++;
            System.out.print(" " + abm.getDate());
        }
        return print_it;
    }

    @Override
    public String remove(int temp_remove) {
        String done = "DONE?";
        full_news.remove(temp_remove);
        return done;
    }
}