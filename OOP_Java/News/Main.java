package OOP_Java.News;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    /**
     *
     * Created by Adil Myktybek
     * on 21.11.2020, 00:37  >> 01:40
     * --> CONTINUED 16:45 >> 22:10
     * 95 line(Later!)
     */
    // Java is WORA.
    /* Later!!!
    One of the first questions that greeted Pep Guardiola after the announcement of his new two-year Manchester City contract last week was whether it increased the chances of Lionel Messi joining from Barcelona.
"What I want is that he finishes his career there," was Guardiola's response, appearing to pour cold water on the idea.
But whatever the manager says in public, there is no doubt whatsoever that City want the Barca captain and will do all they can to sign him now he knows Guardiola is staying.
In that respect, the new contract could be a game-changer in their pursuit of one of football's greatest players.
Messi will be all ears.
Guardiola and the club's hierarchy accepted as early as April there was a need for a squad overhaul at Etihad Stadium, a view supported this season by the fact they are in the bottom half of the Premier League table after eight games, having won only three times.
Their manager's new contract is likely to make that process significantly simpler.
Last summer City began negotiations with a world-class player they would have loved to bring to the club. The feeling was mutual. "Just one thing before I sign," the player said. "Will Pep be staying at the club?" Guardiola had not committed at that stage.
The message he received was that Guardiola was staying at City until at least July 2021 - the end of his then-current deal - but after that nothing was confirmed, although the likelihood was that he would stay.
The Catalan manager could have said to the player that, indeed, he would be extending his stay and the deal could have been done. He chose not to as he still had not thought deeply about it and as a consequence the player said thanks, but no thanks.
Having made up his mind to stay, it is not surprising Guardiola wanted the news announced as early as possible. Players and officials within the club, as well as many outside it, needed to know, and quickly.
He is staying because he knows this is a squad where, with the exception of five or six players, they will listen to offers for everybody because the group needs to go through a recycling process. More importantly he has a clear idea that Manchester City will allow him to do it, and do it his way. There is nowhere better for him to work.
     */
    // Pubg gogogo.
    public static final Scanner sc = new Scanner(System.in);
    public static ArrayList<StringBuilder> sb_ArrayList = new ArrayList<>();
    public static ArrayList<ArrayList<StringBuilder>> array_of_arraylist = new ArrayList<>();
    // public static TreeMap<Integer, List<String>> treeMap = new TreeMap<>();

    static void admin_user_main(interface_main interface_main0, int count) {
        System.out.println("\n------------------------------------------------------\n");
        switch (select_admin_user()) {
            case 1:
                System.out.println("\n------------------------------------------------------\n");
                Scanner scanner3 = new Scanner(System.in);     // 'cause Exception in thread "main" java.util.InputMismatchException
                System.out.printf("%S%n%-12s%-12s   %-12s    ", "Admin! What do you want to do?", "[1]-Add", "[2]-Remove", "[3]-Edit");
                int choice_admin = scanner3.nextInt();
                switch (choice_admin) {
                    case 1:   // sport_news, political_news, ...  with if
                        System.out.print("Enter: ");
                        scanner3.nextLine();   // 'cause buffer
                        String sb_temp_str = scanner3.nextLine();

                        StringBuilder sb_temp = new StringBuilder();

                        sb_temp.append(sb_temp_str);
                        String temp_topic = sb_temp_str.substring(0, 3) + "...";
                        String date_str = get_date_format();

                        interface_main0.addNews(new sport_news(date_str, temp_topic));
                        /*System.out.println("+++++++++++++++++++++++++++++");
                        System.out.println(get_date_format());
                        System.out.println("\n" + temp_topic);
                        System.out.println("+++++++++++++++++++++++++++++");*/
                        sb_ArrayList.add(sb_temp);
                        System.out.println("DONE!");
                        break;

                    case 2:
                        interface_main0.print_all_news(count);
                        System.out.print("\nRemove element: ");
                        int temp_remove = scanner3.nextInt() - 1;
                        sb_ArrayList.remove(temp_remove);
                        interface_main0.remove(temp_remove);
                        System.out.println("\nAfter: ------------------------------------");
                        interface_main0.print_all_news(count);
                        break;

                    case 3:
                        interface_main0.print_all_news(count);
                        System.out.print("\nEdit element: ");
                        int temp_edit_element = scanner3.nextInt() - 1;
                        StringBuilder sb_temp_edit = new StringBuilder();
                        StringBuilder sb_temp_edit_new = new StringBuilder();
                        sb_temp_edit = sb_ArrayList.get(temp_edit_element);
                        System.out.printf("%s%n%-10s  %s", "\nWhat do you want to do? ", "[1]-Replace word", "[2]-new 'News'    ");
                        int temp_edit = scanner3.nextInt();
                        if (temp_edit == 1) {
                            System.out.print("\nWord_1: ");
                            // scanner3.nextLine();
                            String temp_word_1 = scanner3.next();
                            System.out.print("\nWord_2: ");
                            String temp_word_2 = scanner3.next();
                            sb_temp_edit_new = replace_word(sb_temp_edit, temp_word_1, temp_word_2);
                            // sb_ArrayList.add(sb_temp_edit_new);
                            System.out.println("\nDONE! -replace_word");
                        } else if (temp_edit == 2) {
                            sb_temp_edit_new.append(sc.nextLine());
                            sb_ArrayList.set(temp_edit_element, sb_temp_edit_new);
                            System.out.println("\nDONE! -replace_sb");
                        } else {
                            System.out.println("Not Correct!");
                        }
                        break;

                    default:
                        System.out.println("Error (Admin)");
                        System.exit(-1);
                }
                System.out.println("\nadmin...");
                break;
            case 2:
                System.out.println("\n------------------------------------------------------\n");    // LATER...
                System.out.println("Read news...");
                Scanner scanner4 = new Scanner(System.in);
                interface_main0.print_all_news(count);
                System.out.print("\n\nSelect 'news': ");
                int select_news = scanner4.nextInt() - 1;
                System.out.println("\nOpening...");
                System.out.println(sb_ArrayList.get(select_news));

                boolean bool_isEmpty = array_of_arraylist.isEmpty();
                if (!bool_isEmpty){
                    int size_of_array_of_arraylist = array_of_arraylist.size();
                    boolean if_isNot_empty_but_no_such = false;
                    if (size_of_array_of_arraylist >= select_news){
                        if_isNot_empty_but_no_such = true;
                    }

                    if (if_isNot_empty_but_no_such){
                        int temp_select = select_news + 1;
                        System.out.println("\nComments: [" + temp_select + "]");
                        for (int j = 0; j < array_of_arraylist.get(select_news).size(); j++) {
                            System.out.print(array_of_arraylist.get(select_news).get(j) + ";\n");
                        }
                    }
                }

                System.out.printf("%s%n%s     %s     ", "\nWrite comment?", "[1]-YES", "[2]-NO");
                int user_choice_yesORno = scanner4.nextInt();
                if (user_choice_yesORno == 1) {
                    System.out.println("\nText: ... ");
                    StringBuilder sb_add_comment = new StringBuilder();
                    ArrayList<StringBuilder> arrayList_to_comment = new ArrayList<>();
                    scanner4.nextLine(); // buffer
                    sb_add_comment.append(scanner4.nextLine());
                    arrayList_to_comment.add(sb_add_comment);

                    System.out.printf("%s%n%s     %s     ", "\nDONE! Discard?", "[1]-YES", "[2]-NO");
                    int choice_choice_discard = scanner4.nextInt();
                    if (choice_choice_discard == 1){
                        System.out.println("\nDiscard --- Done!");
                        arrayList_to_comment.remove(0);
                    } else if (choice_choice_discard == 2){
                        array_of_arraylist.add(select_news, arrayList_to_comment);
                    } else {
                        System.out.println("Error");
                        System.exit(-1);
                    }
                } else if (user_choice_yesORno == 2) {
                    System.out.println("\nContinue...");
                } else {
                    System.out.println("\nError");
                    System.exit(-1);
                }

                System.out.println("\nuser...");
                break;
            case 3:
                System.out.println("\n---------------\n" + sb_ArrayList.toString());
                break;
            case 4:
                System.out.println("\nExit...");
                System.exit(-1);
            default:
                System.out.println("\nError");
                System.exit(-1);
        }

        admin_user_main(interface_main0, count);
    }

    public static void main(String[] args){
        interface_main interface_main0 = new do_it_interface_news();
        interface_main0.addNews(new music_news("2020/11/21", "Mus..."));
        StringBuilder main_sb = new StringBuilder();
        main_sb.append("Music news, artist interviews, album reviews, and music industry news from NPR.");
        sb_ArrayList.add(main_sb);
        int count = 1;
        admin_user_main(interface_main0, count);
    }

    static int select_admin_user() throws InputMismatchException {
        Scanner scanner2 = new Scanner(System.in);
        System.out.printf("%s%n%s    %s    %s    %s       ", "Hello, Admin or User?", "[1]-Admin", "[2]-User", "[3]-History", "[4]-Exit");
        int select_admin_user_temp = scanner2.nextInt();    // 'cause Exception in thread "main" java.util.InputMismatchException
        return select_admin_user_temp;
    }

    static String get_date_format(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        // calendar.add(Calendar.DATE, 1);  // +one day
        return dateFormat.format(calendar.getTime());
    }

    static StringBuilder replace_word (StringBuilder sb, String word1, String word2){ // Java is WORA.
        int index = sb.indexOf(word1);
        if (index == -1) {
            System.out.println("Error replace_word");
            System.exit(-1);
        }
        int index_end = index;
        for (int i = index; i < sb.length(); i++){  // if in centre
            if (sb.charAt(i) == ' '){
                index_end = i;
                sb.replace(index, index_end, word2);
                return sb;
            }
            index_end++;
        }
        sb.replace(index, index_end, word2);
        return sb;
    }
}