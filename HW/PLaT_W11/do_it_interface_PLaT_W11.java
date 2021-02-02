package OOP_Java.PLaT_W11;

import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class do_it_interface_PLaT_W11 implements Interface_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 24.11.2020, 11:22
     *
     */
    private ArrayList<abstract_PLaT_W11> arrayList_W11 = new ArrayList<>();

    private static ArrayList<Integer> to_solve1 = new ArrayList<>();
    private static Scanner scanner_solve1 = new Scanner(System.in);   // int double float long
    private int solve_1_N = 0;
    private int solve_1_line = 3;  // to_solve1/^solve_1_N

    private static Scanner scanner_solve2 = new Scanner(System.in);   // String StringBuffer StringBuilder  // 'cause Buffer
    private String solve_2_string = "";

    private int day_ = 0;   // solve_3
    private int month_ = 0;
    private int year_ = 0;
    private String date_ = "";

    private int sec_ = 0;   // solve_4
    private int min_ = 0;
    private int hour_ = 0;
    private String clock_ = "";

    private HashSet<Integer> hashSet_solve_5 = new HashSet<>();  // solve_5

    private int a_solve_6 = 0;  // solve_6
    private int b_solve_6 = 0;
    private int a_simplify = 0;
    private int b_simplify = 0;
    private int save_a1 = 0;
    private int save_b1 = 0;
    private int save_a2 = 0;
    private int save_b2 = 0;

    private int line_solve_7 = 0;  // solve_7
    private int column_solve_7 = 0;
    private int[][] matrix_solve_7 = new int[4][4];

    private int a_x = 0;  // solve_9
    private int a_y = 0;
    private int b_x = 0;
    private int b_y = 0;
    private int c_x = 0;
    private int c_y = 0;

    private int t_a = 0; // solve_10
    private int t_b = 0;

    private ArrayList<Integer> arrayList_problem_11 = new ArrayList<>(); // solve_11
    private String str_solve12 = ""; // solve_12
    private String str_problem13 = ""; // solve_13
    private ArrayList<String> al_problem14 = new ArrayList<>(); // solve_14
    private String[] arr_str_problem14 = new String[5];
    private ArrayList<Integer> qw_15 = new ArrayList<>(); // solve_15



    @Override
    public void add_to_arrayList(abstract_PLaT_W11 abs) {
        arrayList_W11.add(abs);
    }

    // ----------------------------------------------------------------------------------------
    /*
    2 1 -3
    0 -1 1
    1 2 3
    */
    @Override
    public void solve_1_main() {
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_1){
                // ArrayList<Integer> list_solve1 = new ArrayList<>();
                // HashMap<Integer, Integer> hashMap = new HashMap<>();
                int n = ((Problem_1) a).getN();
                solve_1_N = n;
                System.out.println("N = " + n);
                int[][] matrix = new int[3][n];
                for (int j = 0; j < 3; j++){
                    System.out.print("[" + j + "] --- ");
                    for (int i = 0; i < n; i++){                          // if n=2: 6 0    0 4
                        matrix[j][i] = scanner_solve1.nextInt();
                        System.out.print(matrix[j][i] + " ");
                    }
                    System.out.println();
                }

                for (int j = 0; j < 3; j++){
                    for (int i = 0; i < n; i++){
                        to_solve1.add(matrix[j][i]);
                    }
                    // list_solve1.clear();   // After: [[], [], []]
                }
            }
        }
        // System.out.println(to_solve1.get(to_solve1.size()-1));
        System.out.println(to_solve1);
    }

    @Override
    public void solve_1_1() {
        System.out.println("N: " + solve_1_N);
        System.out.print("\nNew elements: ");
        for (int i = 0; i < solve_1_N; i++){
            to_solve1.add(scanner_solve1.nextInt());
        }
        System.out.println("After:\n");
        System.out.println(to_solve1);
        solve_1_line++;
    }

    @Override
    public void solve_1_2() {
        System.out.println("Removing...");
        for (int i = 0; i < solve_1_N; i++){
            to_solve1.remove(to_solve1.size()-1);
        }
        System.out.println("After:\n"+ to_solve1);
        System.out.println("DONE!");
        solve_1_line--;
    }

    @Override
    public void solve_1_3() {
        System.out.println("N: " + solve_1_N);
        int[][] matrix = new int[solve_1_line][solve_1_N];
        int k = 0;
        for (int i = 0; i < solve_1_line; i++) {
            for (int j = 0; j < solve_1_N; j++) {
                matrix[i][j] = to_solve1.get(k);
                k++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        int[] arr = new int[solve_1_N];
        for (int i = 0; i < solve_1_N; i++) {
            for (int j = 0; j < solve_1_line; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Sum[" + i + "] " + sum);
            arr[i] = sum;
            sum = 0;
        }

        System.out.println("................");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_1_4() {
        System.out.println("N: " + solve_1_N);
        int[][] matrix = new int[2][solve_1_N];
        int k = 0;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < solve_1_N; j++){
                matrix[i][j] = to_solve1.get(k);
                k++;
            }
        }
        // String[] str_arr = new String[]{"i", "j", "k", "a", "b", "c", "d", "e", "f"};  // ...
        // !(the lengths of two vectors and the angle between them are given, and it is required to find the length of the vector product.)
        int temp1 = 0, temp2 = 0, temp3 = 0;
        temp1 = matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1];
        temp2 = matrix[0][2]*matrix[1][0] - matrix[0][0]*matrix[1][2];
        temp3 = matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];

        System.out.print(temp1 + "*i ");
        if (temp2 < 0){
            System.out.print(temp2 + "*j ");
        } else {
            System.out.print("+ " + temp2 + "*j ");
        }

        if (temp3 < 0){
            System.out.print(temp3 + "*k");
        } else {
            System.out.print("+ " + temp3 + "*k");
        }
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_1_5() {
        System.out.println("N: " + solve_1_N);
        int[][] matrix = new int[solve_1_line][solve_1_N];
        int k = 0;
        for (int i = 0; i < solve_1_line; i++) {
            for (int j = 0; j < solve_1_N; j++) {
                matrix[i][j] = to_solve1.get(k);
                k++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] arr = new int[solve_1_N];
        int for_minus = 0;
        for (int i = 0; i < solve_1_N; i++) {
            int sum = matrix[0][for_minus];
            for (int j = 1; j < solve_1_line; j++) {
                sum = sum - matrix[j][i];
            }
            System.out.println("Sum[" + i + "] " + sum);
            arr[i] = sum;
            for_minus++;
        }

        System.out.println("................");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_1_6() {
        System.out.println("N: " + solve_1_N);   //  скалярное произведение вектора
        int[][] matrix = new int[2][solve_1_N];
        int k = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < solve_1_N; j++) {
                matrix[i][j] = to_solve1.get(k);
                k++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int ans = 0;
        for (int j = 0; j < solve_1_N; j++) {
            int temp1 = matrix[0][j];
            int temp2 = matrix[1][j];
            int mult = temp1*temp2;
            ans += mult;
        }

        System.out.println("Answer: " + ans);
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_1_7() {
        int[][] matrix = new int[solve_1_line][solve_1_N];
        int k = 0;
        for (int i = 0; i < solve_1_line; i++) {
            System.out.print("[" + i + "] --- ");
            for (int j = 0; j < solve_1_N; j++) {
                matrix[i][j] = to_solve1.get(k);
                k++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nChoice(vector): ");
        int temp = scanner_solve1.nextInt();
        int sum = 0;
        for (int i = 0; i < solve_1_N; i++){
            sum = sum + (matrix[temp][i] * matrix[temp][i]);
        }
        int ans = (int)(Math.sqrt(sum));
        System.out.println("Answer(Length): " + ans);
        System.out.println("\nDONE!");
    }

    // ----------------------------------------------------------------------------------------
    /*
    Java is WORA
    */
    @Override
    public void solve_2_main(){
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_2){
                solve_2_string = ((Problem_2) a).getString();
            }
        }
    }

    @Override
    public void solve_2_1() {
        System.out.print("\nString2: ");
        String str2 = scanner_solve2.nextLine();
        String temp = solve_2_string + str2;
        System.out.println("\nConcatena* " + temp);
        System.out.println("DONE!");
    }

    @Override
    public void solve_2_2() {
        System.out.println("\nSubstring...");
        System.out.println("Size: " + solve_2_string.length());
        System.out.println("Start, End");
        int temp1 = scanner_solve1.nextInt();
        int temp2 = scanner_solve1.nextInt();
        String temp_str = solve_2_string.substring(temp1, temp2);
        System.out.println(temp_str);
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_2_3() {
        System.out.print("\nString 2: ");
        String str2 = scanner_solve2.nextLine();
        if (str2.equals(solve_2_string)){
            System.out.println("Equal==");
        } else {
            System.out.println("not Equal");
        }
        System.out.println("DONE!");
    }

    @Override
    public void solve_2_4() {
        System.out.print("\nString 2: ");
        String str2 = scanner_solve2.nextLine();
        if (str2.equals(solve_2_string)){
            System.out.println("Equal==");
        } else {
            System.out.println("not Equal");
        }
        System.out.println("DONE!");
    }

    @Override
    public void solve_2_5() {  // -like solve_2_4
        System.out.print("\nString 2: ");
        String str2 = scanner_solve2.nextLine();
        if (str2.equals(solve_2_string)){
            System.out.println("Equal==");
        } else {
            System.out.println("not Equal");
        }
        System.out.println("DONE!");
    }

    @Override
    public void solve_2_6() {
        System.out.print("\nString 2: ");
        String str2 = scanner_solve2.nextLine();
        int length2 = str2.length();
        int length1 = solve_2_string.length();
        if (length1 == length2){
            System.out.println("Equal==");
        } else if (length1 > length2){
            System.out.println("Length_1");
        } else {
            System.out.println("Length_2");
        }
        System.out.println("DONE!");
    }

    // ----------------------------------------------------------------------------------------
    /*
    24 // 11 // 2020
    */
    @Override
    public void solve_3_main(){
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_3){
                day_ = ((Problem_3) a).getDay();
                month_ = ((Problem_3) a).getMonth();
                year_ = ((Problem_3) a).getYear();

                date_ = "" + day_ + "/" + month_ + "/" + year_;
            }
        }
    }

    @Override
    public void solve_3_1() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date firstDate = sdf.parse(date_);
            System.out.println("First Date: " + firstDate);

            System.out.print("Second Date: ");
            String date2 = scanner_solve2.nextLine();  // 26/11/2020  -->  24/11/2020
            Date secondDate = sdf.parse(date2);
            System.out.println(" --------->>\nSecond Date: " + secondDate);

            long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            System.out.println("Diff: " + diff);
            System.out.println("\nDONE!");
        } catch (ParseException e) {
            System.out.println("\nError!");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    @Override
    public void solve_3_2() {
        // Date firstDate = sdf.parse(date_);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();

        System.out.print("\nDays: ");
        int temp_date = scanner_solve1.nextInt();
        calendar.add(Calendar.DATE, temp_date);
        System.out.println("Answer: " + sdf.format(calendar.getTime()));
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_3_3() {
        try {
            System.out.print("\nDate: ");
            String date1 = scanner_solve2.nextLine();
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            Date date = sdf.parse(date1);
            cal.setTime(date);
            int temp_week = cal.get(Calendar.DAY_OF_WEEK);

            System.out.print("Answer: ");
            switch (temp_week){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("\nError!");
                    System.exit(-1);
                    break;
            }
            System.out.println("\nDONE!");
        } catch (ParseException e) {
            System.out.println("\nError!");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    // ----------------------------------------------------------------------------------------
    /*
    19:02:41  -->  19:23:24
    */
    @Override
    public void solve_4_main() {
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_4){
                sec_ = ((Problem_4) a).getSec();
                min_ = ((Problem_4) a).getMin();
                hour_ = ((Problem_4) a).getHour();

                clock_ = "" + hour_ + ":" + min_ + ":" + sec_;
            }
        }
    }

    @Override
    public void solve_4_1() {
        try {
            System.out.println("First: " + clock_);
            int all_1 = 60*60*hour_ + 60*min_ + sec_;
            System.out.print("Seconds_[1]: " + all_1 + "\nSecond: ");
            String temp_main = scanner_solve2.nextLine();    // 19:23:24


            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
            Calendar cal = Calendar.getInstance();
            Date date = sdf.parse(temp_main);
            cal.setTime(date);

            int hours2 = cal.get(Calendar.HOUR_OF_DAY);
            int minutes2 = cal.get(Calendar.MINUTE);
            int seconds2 = cal.get(Calendar.SECOND);
            int all_2 = 60*60*hours2 + 60*minutes2 + seconds2;
            System.out.println("Seconds_[2]: " + all_2 + "\nDiff: " + Math.abs(all_1-all_2));
            System.out.println("\nDONE!");
        } catch (ParseException e) {
            System.out.println("\nError!");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    @Override
    public void solve_4_2() {
        System.out.println("\n[1]-ADD   [2]-SUBTRACT    ");
        int temp_solve4 = scanner_solve1.nextInt();
        if (temp_solve4 == 1){
            try {
                System.out.print("\nSeconds_subtract: ");
                int temp_date_subtract = scanner_solve1.nextInt();

                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                Calendar calendar = Calendar.getInstance();
                Date date = sdf.parse(clock_);
                calendar.setTime(date);

                calendar.add(Calendar.SECOND, temp_date_subtract);
                Date afterDate = calendar.getTime();

                System.out.println("Answer: " + sdf.format(afterDate));
                System.out.println("\nDONE!");
            } catch (ParseException e) {
                System.out.println("\nError!");
                e.printStackTrace();
                System.exit(-1);
            }
        } else if (temp_solve4 == 2){
            try {
                System.out.print("\nSeconds_subtract: ");
                int temp_date_subtract = scanner_solve1.nextInt();

                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                Calendar calendar = Calendar.getInstance();
                Date date = sdf.parse(clock_);
                calendar.setTime(date);

                calendar.add(Calendar.SECOND, -temp_date_subtract);
                Date afterDate = calendar.getTime();

                System.out.println("Answer: " + sdf.format(afterDate));
                System.out.println("\nDONE!");
            } catch (ParseException e) {
                System.out.println("\nError!");
                e.printStackTrace();
                System.exit(-1);
            }
        } else {
            System.out.println("ERROR_4.2");
            System.exit(-1);
        }
    }

    // ----------------------------------------------------------------------------------------
    /*
    [20, 37, 73, 10]
    */
    @Override
    public void solve_5_main(){
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_5){
                hashSet_solve_5 = ((Problem_5) a).getHashSet();
                System.out.println(((Problem_5) a).getStringHashSet());
            }
        }
    }

    @Override
    public void solve_5_1() {
        System.out.println(hashSet_solve_5.toString());
        System.out.print("\nElement: ");
        int temp_hs = scanner_solve1.nextInt();
        if (hashSet_solve_5.contains(temp_hs)){
            System.out.println("\nYes!");
        } else {
            System.out.println("\nNO!");
        }

        /*Iterator iterator = hashSet_solve_5.iterator();
        while (iterator.hasNext()){
            // code...
        }*/
        System.out.println("DONE!");
    }

    @Override
    public void solve_5_2() {
        System.out.printf("%s%n%s  ", hashSet_solve_5.toString(), "\nAdd: ");
        int temp_hs = scanner_solve1.nextInt();
        hashSet_solve_5.add(temp_hs);
        System.out.print("\nAfter: " + hashSet_solve_5.toString());
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_5_3() {
        System.out.printf("%s%n%s  ", hashSet_solve_5.toString(), "\nRemove: ");
        int temp_hs = scanner_solve1.nextInt();
        hashSet_solve_5.remove(temp_hs);
        System.out.print("\nAfter: " + hashSet_solve_5.toString());
        System.out.println("\nDONE!");
    }

    public int check_it (int arr){  // --> solve_5_4()  591-Line
        int result = 0;
        for (Object entry : hashSet_solve_5) {
            if (entry.equals(arr)) return result;
            result++;
        }
        return -5;
    }
    @Override
    public void solve_5_4() {
        System.out.printf("%s%n%s  ", hashSet_solve_5.toString(), "\nSize, Elements: ");
        int temp_hs = scanner_solve1.nextInt();
        int[] arr = new int[temp_hs];
        for (int i = 0; i < arr.length; i++){ arr[i] = scanner_solve1.nextInt(); }

        ArrayList<Integer> arrayFOR = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){ arrayFOR.add(check_it(arr[i])); }
        System.out.println("ArrayList: " + arrayFOR.toString());
        boolean true_false = true;
        for (int i = 1; i < arrayFOR.size(); i++){
            if (arrayFOR.get(i-1) + 1 != arrayFOR.get(i)){ true_false = false; }
        }

        if (true_false){ System.out.println("\nYes!"); }
        else { System.out.println("\nNo!"); }
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_5_5() {
        System.out.println(hashSet_solve_5.toString());
        HashSet<Integer> newHS = new HashSet<>();
        System.out.print("\nnew HashSet(size): ");
        int temp_sizeHS = scanner_solve1.nextInt();
        for (int i = 0; i < temp_sizeHS; i++){
            newHS.add(scanner_solve1.nextInt());
        }

        boolean value = hashSet_solve_5.equals(newHS);
        System.out.println("if: [true - YES], [false - NO] : " + value);
    }

    public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {  // --> solve_5_6()
        Set<T> mergedSet = new HashSet<T>();
        mergedSet.addAll(a);
        mergedSet.addAll(b);
        return mergedSet;
    }
    @Override
    public void solve_5_6() {
        System.out.println(hashSet_solve_5.toString());
        HashSet<Integer> newHS = new HashSet<>();
        System.out.print("\nnew HashSet(size): ");
        int temp_sizeHS = scanner_solve1.nextInt();
        for (int i = 0; i < temp_sizeHS; i++){
            newHS.add(scanner_solve1.nextInt());
        }

        System.out.println("Merged Set: " + mergeSet(hashSet_solve_5, newHS));
    }

    @Override
    public void solve_5_7() {
        System.out.println(hashSet_solve_5.toString());
        HashSet<Integer> newHS = new HashSet<>();
        System.out.print("\nnew HashSet(size): ");
        int temp_sizeHS = scanner_solve1.nextInt();
        for (int i = 0; i < temp_sizeHS; i++){
            newHS.add(scanner_solve1.nextInt());
        }
        newHS.retainAll(hashSet_solve_5);
        System.out.println("\nAnswer: " + newHS.toString());
    }

    @Override
    public void solve_5_8() {
        System.out.println(hashSet_solve_5.toString());
        HashSet<Integer> newHS = new HashSet<>();
        System.out.print("\nnew HashSet(size): ");
        int temp_sizeHS = scanner_solve1.nextInt();
        for (int i = 0; i < temp_sizeHS; i++){
            newHS.add(scanner_solve1.nextInt());
        }

        newHS.retainAll(symmetricDifference(hashSet_solve_5, newHS));
        System.out.println("\nAnswer: " +  newHS);
    }

    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) { // >> solve_5_8() >> solve_5_9()
        Set<T> symmetricDiff = new HashSet<T>(set1);
        symmetricDiff.addAll(set2);
        Set<T> tmp = new HashSet<T>(set1);
        tmp.retainAll(set2);
        symmetricDiff.removeAll(tmp);
        return symmetricDiff;
    }
    @Override
    public void solve_5_9() {
        System.out.println(hashSet_solve_5.toString());
        HashSet<Integer> newHS = new HashSet<>();
        System.out.print("\nnew HashSet(size): ");
        int temp_sizeHS = scanner_solve1.nextInt();
        for (int i = 0; i < temp_sizeHS; i++){
            newHS.add(scanner_solve1.nextInt());
        }

        System.out.println("\nAnswer: " + symmetricDifference(hashSet_solve_5, newHS));
    }

    // ----------------------------------------------------------------------------------------
    /*
    12/4 + 4/12 = 20/6 -> 10/3
    12/4 + 5/6 = 46/12 -> 23/6
    */
    @Override
    public void solve_6_main() {
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_6){
                a_solve_6 = ((Problem_6) a).getA();
                b_solve_6 = ((Problem_6) a).getB();
                System.out.print("Problem_6: " + a_solve_6 + "/" + b_solve_6);
            }
        }
    }

    public void simplify (int a, int b, String sign){
        if(a%b == 0){
            System.out.println("Answer: " + sign + a/b);
            System.out.println("DONE!1");
            return;
        }

        if (a == a_simplify && b == b_simplify){
            System.out.println("Answer: " + sign + a + "/" + b);
            System.out.println("DONE!2");
            return;
        } else {
            a_simplify = a;
            b_simplify = b;
        }

        long limit = Math.min(a, b);
        for (long i = 2; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        // System.out.println("Answer: " + a + "/" + b);
        simplify(a, b, sign);
    }
    @Override
    public void solve_6_1() {
        System.out.println("\nMain_a and Main_b: " + a_solve_6 + "/" + b_solve_6);

        if (a_solve_6 < 0){
            simplify(Math.abs(a_solve_6), b_solve_6, "-");
        } else {
            simplify(a_solve_6, b_solve_6, "");
        }

        a_simplify = 0;
        b_simplify = 0;
    }

    @Override
    public void solve_6_2() {   // 12/4 + 4/12 = 160/48 -> 20/6 -> 10/3
        System.out.println("\nMain_a and Main_b: " + a_solve_6 + "/" + b_solve_6);
        System.out.print("A/B: ");
        int a1 = scanner_solve1.nextInt(), b1 = scanner_solve1.nextInt();
        int temp_a = a_solve_6, temp_b = b_solve_6;
        temp_a = temp_a*b1;
        a1 = a1*temp_b;
        b1 = temp_b * b1;
        int ans = temp_a + a1;

        if (ans < 0){
            simplify(Math.abs(ans), b1 , "-");
        } else {
            simplify(ans, b1, "");
        }

        a_simplify = 0;
        b_simplify = 0;
    }

    @Override
    public void solve_6_3() {  // 12/4 - 4/12 = 144-16/48 --> 128/48 -> 32/12 --> 8/3
        System.out.println("\nMain_a and Main_b: " + a_solve_6 + "/" + b_solve_6);
        System.out.print("A/B: ");
        int a1 = scanner_solve1.nextInt(), b1 = scanner_solve1.nextInt();
        int temp_a = a_solve_6, temp_b = b_solve_6;
        temp_a = temp_a*b1;
        a1 = a1*temp_b;
        b1 = temp_b * b1;
        int ans = temp_a - a1;

        if (ans < 0){
            simplify(Math.abs(ans), b1, "-");
        } else {
            simplify(ans, b1, "");
        }

        a_simplify = 0;
        b_simplify = 0;
    }

    @Override
    public void solve_6_4() {  // 12/4 * 4/12 = 48/48 --> 1
        System.out.println("\nMain_a and Main_b: " + a_solve_6 + "/" + b_solve_6);
        System.out.print("A/B: ");
        int a1 = scanner_solve1.nextInt(), b1 = scanner_solve1.nextInt();
        int temp_a = a_solve_6, temp_b = b_solve_6;
        a1 = a1*temp_a;
        b1 = temp_b * b1;

        if (a1 < 0){
            simplify(Math.abs(a1), b1, "-");
        } else {
            simplify(a1, b1, "");
        }

        a_simplify = 0;
        b_simplify = 0;
    }

    public void simplify_true_false_1 (int a, int b){
        if(a%b == 0){
            save_a1 = a;
            save_b1 = b;
            return;
        }

        if (a == a_simplify && b == b_simplify){
            save_a1 = a;
            save_b1 = b;
            return;
        } else {
            a_simplify = a;
            b_simplify = b;
        }

        long limit = Math.min(a, b);
        for (long i = 2; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        // System.out.println("Answer: " + a + "/" + b);
        simplify_true_false_1(a, b);
    }
    public void simplify_true_false_2 (int a, int b){
        if(a%b == 0){
            save_a2 = a;
            save_b2 = b;
            return;
        }

        if (a == a_simplify && b == b_simplify){
            save_a2 = a;
            save_b2 = b;
            return;
        } else {
            a_simplify = a;
            b_simplify = b;
        }

        long limit = Math.min(a, b);
        for (long i = 2; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        // System.out.println("Answer: " + a + "/" + b);
        simplify_true_false_2(a, b);
    }
    @Override
    public void solve_6_5() { // 12/4 ?= 4/12 = false
        System.out.println("\nMain_a and Main_b: " + a_solve_6 + "/" + b_solve_6);
        System.out.print("A/B: ");
        int a1 = scanner_solve1.nextInt(), b1 = scanner_solve1.nextInt();
        int temp_a = a_solve_6, temp_b = b_solve_6;

        if (a1 < 0 && temp_a < 0 || a1 >= 0 && temp_a >= 0){
            simplify_true_false_1(a1, b1);
            simplify_true_false_2(temp_a, temp_b);
            double check_a_solve_6 = ( ((double) save_a1) / ((double) save_b1) );
            double check_b_solve_6 = ( ((double) save_a2) / ((double) save_b2) );
            if (check_a_solve_6 == check_b_solve_6){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }

        a_simplify = 0;
        b_simplify = 0;
    }

    @Override
    public void solve_6_6() {  // 12/4 / 4/12 = 144/16 --> 9
        System.out.println("\nMain_a and Main_b: " + a_solve_6 + "/" + b_solve_6);
        System.out.print("A/B: ");
        int a1 = scanner_solve1.nextInt(), b1 = scanner_solve1.nextInt();
        int temp_a = a_solve_6, temp_b = b_solve_6;
        a1 = a1*temp_b;
        b1 = temp_a * b1;

        if (b1 < 0){
            simplify(Math.abs(b1), a1, "-");
        } else {
            simplify(b1, a1, "");
        }

        a_simplify = 0;
        b_simplify = 0;
    }

    @Override
    public void solve_6_7() {  // 12/4 --> No
        System.out.println("\nMain_a and Main_b: " + a_solve_6 + "/" + b_solve_6);
        if (a_solve_6 >= b_solve_6){
            System.out.println("NO!\nDONE!");
        } else {
            System.out.println("YES!\nDONE!");
        }
    }

    // ----------------------------------------------------------------------------------------
    /*
    4*4:
    1 3 5 7
    2 5 8 11
    3 7 11 15
    4 9 14 19

    4*4
    1 2 3 4
    5 6 7 8
    9 10 11 12
    13 14 15 16
    */
    @Override
    public void solve_7_main() {
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_7){
                line_solve_7 = ((Problem_7) a).getLine();
                column_solve_7 = ((Problem_7) a).getColumn();
                System.out.print("Problem_7: " + line_solve_7 + "*" + column_solve_7);
            }
        }

        int[][] temp_matrix = new int[line_solve_7][column_solve_7];
        for (int i = 0; i < line_solve_7; i++){
            for (int j = 0; j < column_solve_7; j++){
                temp_matrix[i][j] = (i+1)*(j+1) + j;
            }
        }

        for (int i = 0; i < line_solve_7; i++){
            for (int j = 0; j < column_solve_7; j++){
                matrix_solve_7[i][j] = temp_matrix[i][j];
            }
        }
    }

    public void print_matrix_solve_7(int[][] matrix_temp, int size_1, int size_2){
        System.out.println("\nMatrix: ");
        for (int i = 0; i < size_1; i++){
            for (int j = 0; j < size_2; j++){
                System.out.print(matrix_temp[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void solve_7_1() {
        print_matrix_solve_7(matrix_solve_7, line_solve_7, column_solve_7);
        System.out.println("\nSecond Matrix[4*4]: ");
        int[][] b_matrix = new int[line_solve_7][column_solve_7];

        for (int i = 0; i < line_solve_7; i++) {
            for (int j = 0; j < column_solve_7; j++) {
                b_matrix[i][j] = scanner_solve1.nextInt();
            }
        }

        int i, j;
        int[][] c_matrix = new int[line_solve_7][column_solve_7];
        for (i = 0; i < line_solve_7; i++) {
            for (j = 0; j < column_solve_7; j++) {
                c_matrix[i][j] = matrix_solve_7[i][j] + b_matrix[i][j];
            }
        }
        print_matrix_solve_7(c_matrix, line_solve_7, column_solve_7);
        System.out.println("DONE!");
    }

    @Override
    public void solve_7_2() {
        print_matrix_solve_7(matrix_solve_7, line_solve_7, column_solve_7);
        System.out.println("\nSecond Matrix[4*4]: ");
        int[][] b_matrix = new int[line_solve_7][column_solve_7];

        for (int i = 0; i < line_solve_7; i++) {
            for (int j = 0; j < column_solve_7; j++) {
                b_matrix[i][j] = scanner_solve1.nextInt();
            }
        }

        int i, j;
        int[][] c_matrix = new int[line_solve_7][column_solve_7];
        for (i = 0; i < line_solve_7; i++) {
            for (j = 0; j < column_solve_7; j++) {
                c_matrix[i][j] = matrix_solve_7[i][j] - b_matrix[i][j];
            }
        }
        print_matrix_solve_7(c_matrix, line_solve_7, column_solve_7);
        System.out.println("DONE!");
    }

    @Override
    public void solve_7_3() {
        print_matrix_solve_7(matrix_solve_7, line_solve_7, column_solve_7);
        System.out.println("\nSecond Matrix[4*4]: ");
        int[][] b_matrix = new int[line_solve_7][column_solve_7];

        for (int i = 0; i < line_solve_7; i++) {
            for (int j = 0; j < column_solve_7; j++) {
                b_matrix[i][j] = scanner_solve1.nextInt();
            }
        }

        int i, j, k;
        int[][] c_matrix = new int[line_solve_7][column_solve_7];
        for (i = 0; i < line_solve_7; i++) {
            for (j = 0; j < column_solve_7; j++) {
                for (k = 0; k < line_solve_7; k++) {
                    c_matrix[i][j] = matrix_solve_7[i][k] * b_matrix[k][j];
                }
            }
        }
        print_matrix_solve_7(c_matrix, line_solve_7, column_solve_7);
        System.out.println("DONE!");
    }

    @Override
    public void solve_7_4() {
        print_matrix_solve_7(matrix_solve_7, line_solve_7, column_solve_7);
        System.out.print("\nSkalyar: ");
        int temp_skalyar = scanner_solve1.nextInt();
        int i, j;
        int[][] c_matrix = new int[line_solve_7][column_solve_7];
        for (i = 0; i < line_solve_7; i++) {
            for (j = 0; j < column_solve_7; j++) {
                c_matrix[i][j] = matrix_solve_7[i][j] * temp_skalyar;
            }
        }
        print_matrix_solve_7(c_matrix, line_solve_7, column_solve_7);
        System.out.println("DONE!");
    }

    @Override
    public void solve_7_5() {
        print_matrix_solve_7(matrix_solve_7, line_solve_7, column_solve_7);
        int i, j;
        int[][] c_matrix = new int[line_solve_7][column_solve_7];
        for (i = 0; i < line_solve_7; i++) {
            for (j = 0; j < column_solve_7; j++) {
                c_matrix[i][j] = matrix_solve_7[i][j];
            }
        }

        System.out.println("\nTransp...");
        for (i = 0; i < line_solve_7; i++) {
            for (j = i+1; j < column_solve_7; j++) {
                int temp = c_matrix[i][j];
                c_matrix[i][j] = c_matrix[j][i];
                c_matrix[j][i] = temp;
            }
        }
        print_matrix_solve_7(c_matrix, line_solve_7, column_solve_7);
        System.out.println("DONE!");
    }

    @Override
    public void solve_7_6() {
        print_matrix_solve_7(matrix_solve_7, line_solve_7, column_solve_7);
        System.out.println("\nSecond Matrix[4*4]: ");
        int[][] b_matrix = new int[line_solve_7][column_solve_7];

        for (int i = 0; i < line_solve_7; i++) {
            for (int j = 0; j < column_solve_7; j++) {
                b_matrix[i][j] = scanner_solve1.nextInt();
            }
        }

        int i, j;
        boolean true_false = true;
        for (i = 0; i < line_solve_7; i++) {
            for (j = 0; j < column_solve_7; j++) {
                if (matrix_solve_7[i][j] != b_matrix[i][j]){
                    true_false = false;
                }
            }
        }

        if(true_false){
            System.out.println("\nYES!\nDONE!");
        } else {
            System.out.println("\nNO!\nDONE!");
        }
    }

    @Override
    public void solve_7_7() {
        print_matrix_solve_7(matrix_solve_7, line_solve_7, column_solve_7);
        if(line_solve_7 == column_solve_7){
            System.out.println("\nYES!\nDONE!");
        } else {
            System.out.println("\nNO!\nDONE!");
        }
    }

    @Override
    public void solve_7_8() {
        // http://www.wolframalpha-ru.com/2013/08/wolframalpha.html
        print_matrix_solve_7(matrix_solve_7, line_solve_7, column_solve_7);
        if(line_solve_7 == column_solve_7) {
            int i, j;
            int[][] c_matrix = new int[line_solve_7][column_solve_7];
            for (i = 0; i < line_solve_7; i++) {
                for (j = 0; j < column_solve_7; j++) {
                    c_matrix[i][j] = matrix_solve_7[i][j];
                }
            }

            System.out.println("\nTransp...");
            for (i = 0; i < line_solve_7; i++) {
                for (j = i+1; j < column_solve_7; j++) {
                    int temp = c_matrix[i][j];
                    c_matrix[i][j] = c_matrix[j][i];
                    c_matrix[j][i] = temp;
                }
            }

            for (i = 0; i < line_solve_7; i++) {
                for (j = 0; j < column_solve_7; j++) {
                    c_matrix[i][j] = matrix_solve_7[i][j] - c_matrix[i][j];
                }
            }

            boolean true_false = true;
            for (i = 0; i < line_solve_7; i++) {
                for (j = 0; j < column_solve_7; j++) {
                    if (c_matrix[i][j] != 0){
                        true_false = false;
                    }
                }
            }
            print_matrix_solve_7(c_matrix, line_solve_7, column_solve_7);

            if (true_false){
                System.out.println("\nYES!\nDONE!");
            } else {
                System.out.println("\nNO!\nDONE!");
            }
        } else {
            System.out.println("\nError!");
        }
    }

    // ----------------------------------------------------------------------------------------
    /*
    x y: ==>
    0 0
    5 0
    0 7

    1 1 6 1 1 8
    */

    @Override
    public void solve_9_main() {
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_9){
                a_x = ((Problem_9) a).getA_1();
                a_y = ((Problem_9) a).getA_2();
                b_x = ((Problem_9) a).getB_1();
                b_y = ((Problem_9) a).getB_2();
                c_x = ((Problem_9) a).getC_1();
                c_y = ((Problem_9) a).getC_2();

                /*alpha = ;
                beta = ;
                gamma = ;*/
            }
        }
        print_coord();
        ans_type_solve_9();
    }

    public void print_coord(){
        System.out.println("\nA: " + a_x + " " + a_y);
        System.out.println("B: " + b_x + " " + b_y);
        System.out.println("C: " + c_x + " " + c_y);
    }

    static int lengthSquare(int x1, int y1, int x2, int y2) {
        int xDiff = x2 - x1;
        int yDiff = y2 - y1;
        return xDiff*xDiff + yDiff*yDiff;
    }

    public void ans_type_solve_9(){
        int a = lengthSquare(a_x, a_y, b_x, b_y);
        int b = lengthSquare(a_x, a_y, c_x, c_y);
        int c = lengthSquare(b_x, b_y, c_x, c_y);

        float a1 = (float)Math.sqrt((float)a);
        float b1 = (float)Math.sqrt((float)b);
        float c1 = (float)Math.sqrt((float)c);

        System.out.println("\na, b, c: "+a+", "+b+", "+c);
        System.out.println("a1, b1, c1: "+a1+", "+b1+", "+c1+"\n");

        float alpha = (float)Math.acos( ((float) ((b + c - a) / (2*b*c)) ));
        float betta = (float)Math.acos( ((float) ((a + c - b)) / ((2*a*c)) ));
        float gamma = (float)Math.acos( ((float) ((a + b - c)) / ((2*a*b)) ));

        // Converting to degree
        alpha = (float)(alpha * 180 / Math.PI);
        betta = (float)(betta * 180 / Math.PI);
        gamma = (float)(gamma * 180 / Math.PI);

        // printing all the angles
        /*System.out.println("alpha : " + alpha);
        System.out.println("betta : " + betta);
        System.out.println("gamma : " + gamma);
        System.out.println("alpha correct? " + b*Math.tan(alpha));*/
    }

    public double path_triangle(int x1, int y1, int x2, int y2){
        double a = Math.pow(x2-x1, 2);
        double b = Math.pow(y2-y1, 2);
        return Math.sqrt(a + b);
    }

    @Override
    public void solve_9_1() {
        print_coord();
        double a = path_triangle(a_x, a_y, b_x, b_y);
        double b = path_triangle(b_x, b_y, c_x, c_y);
        double c = path_triangle(a_x, a_y, c_x, c_y);

        System.out.print("Second triangle: ");
        int x1 = scanner_solve1.nextInt();
        int y1 = scanner_solve1.nextInt();
        int x2 = scanner_solve1.nextInt();
        int y2 = scanner_solve1.nextInt();
        int x3 = scanner_solve1.nextInt();
        int y3 = scanner_solve1.nextInt();

        double a1 = path_triangle(x1, y1, x2, y2);
        double b1 = path_triangle(x2, y2, x3, y3);
        double c1 = path_triangle(x1, y1, x3, y3);

        if(a==a1 && b==b1 && c==c1){
            System.out.println("YES!\nDONE!");
        } else {
            System.out.println("NO!\nDONE!");
        }
    }

    @Override
    public void solve_9_2() {
        print_coord();
        double a = path_triangle(a_x, a_y, b_x, b_y);
        double b = path_triangle(b_x, b_y, c_x, c_y);
        double c = path_triangle(a_x, a_y, c_x, c_y);

        double square = (a*c)/2;
        System.out.println("Square: " + square);
    }

    @Override
    public void solve_9_3() {
        print_coord();
        double a = path_triangle(a_x, a_y, b_x, b_y);
        double b = path_triangle(b_x, b_y, c_x, c_y);
        double c = path_triangle(a_x, a_y, c_x, c_y);

        double ans = a+b+c;
        System.out.println("Perim: " + ans);
    }

    @Override
    public void solve_9_4() {
        print_coord();
        double a = path_triangle(a_x, a_y, b_x, b_y);
        double b = path_triangle(b_x, b_y, c_x, c_y);
        double c = path_triangle(a_x, a_y, c_x, c_y);

        // 2S/c
        double square = (a*c)/2;
        double ans = (square*2)/c;
        System.out.println("Ans: " + ans);
    }

    @Override
    public void solve_9_5() {
        print_coord();
        double a = path_triangle(a_x, a_y, b_x, b_y);
        double b = path_triangle(b_x, b_y, c_x, c_y);
        double c = path_triangle(a_x, a_y, c_x, c_y);

        // 2S/c
        double square = (a*c)/2;
        double ans = (square*2)/c;
        System.out.println("Ans: " + ans);
    }

    @Override
    public void solve_9_6() {
        print_coord();
        double a = path_triangle(a_x, a_y, b_x, b_y);
        double b = path_triangle(b_x, b_y, c_x, c_y);
        double c = path_triangle(a_x, a_y, c_x, c_y);

        double square = (a*c)/2;
        double ans = (square*2)/c;
        System.out.println("Ans: " + ans);
    }

    @Override
    public void solve_9_7() {
        print_coord();
        double a = path_triangle(a_x, a_y, b_x, b_y);
        double b = path_triangle(b_x, b_y, c_x, c_y);
        double c = path_triangle(a_x, a_y, c_x, c_y);

        double ans = (a+b-c)/2;
        System.out.println("Ans: " + ans);
    }

    @Override
    public void solve_9_8() {
        print_coord();
        double a = path_triangle(a_x, a_y, b_x, b_y);
        double b = path_triangle(b_x, b_y, c_x, c_y);
        double c = path_triangle(a_x, a_y, c_x, c_y);

        double ans = (Math.sqrt(a*a + b*b)) / 2;
        System.out.println("Ans: " + ans);
    }

    @Override
    public void solve_9_9() {
        print_coord();
        double a = path_triangle(a_x, a_y, b_x, b_y);
        double b = path_triangle(b_x, b_y, c_x, c_y);
        double c = path_triangle(a_x, a_y, c_x, c_y);

        System.out.println("Pryamo");
    }

    @Override
    public void solve_9_10() {
        print_coord();
        double a = path_triangle(a_x, a_y, b_x, b_y);
        double b = path_triangle(b_x, b_y, c_x, c_y);
        double c = path_triangle(a_x, a_y, c_x, c_y);

        int temp_x1 = a_x;
        int temp_y1 = a_y;
        int temp_x2 = b_x;
        int temp_y2 = b_y;
        int temp_x3 = c_x;
        int temp_y3 = c_y;
        double angle = Math.toRadians(90);
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        a_x = (int)(temp_x1*cos - temp_y1*sin);
        a_y = (int)(temp_x1*sin + temp_y1*cos);
        b_x = (int)(temp_x2*cos - temp_y2*sin);
        b_y = (int)(temp_x2*sin + temp_y2*cos);
        c_x = (int)(temp_x3*cos - temp_y3*sin);
        c_y = (int)(temp_x3*sin + temp_y3*cos);

        System.out.println("\nDONE!");
        System.out.println("\nA: " + a_x + " " + a_y + "\nB: " + b_x + " " + b_y + "\nC: " + c_x + " " + c_y);
    }

    // ----------------------------------------------------------------------------------------
    /*
    [1, ... ,5]
    [10, ... , 14]
    */

    @Override
    public void solve_10_main() {
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_10){
                t_a = ((Problem_10) a).getA();
                t_b = ((Problem_10) a).getB();
            }
        }
    }

    @Override
    public void solve_10_1() {
        System.out.println(t_a + " " + t_b);
        int count = 0;
        for (int i = t_a; i <= t_b; i++){
            count++;
        }

        System.out.println("Length: " + count);
    }

    @Override
    public void solve_10_2() {
        System.out.println(t_a + " " + t_b);
        System.out.print("move? ");
        int move_to = scanner_solve1.nextInt();
        for (int i = t_a + move_to; i <= t_b + move_to; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_10_3() {
        System.out.println(t_a + " " + t_b);
        System.out.print("edit? ");
        int edit_ = scanner_solve1.nextInt();
        for (int i = t_a; i <= t_b + edit_; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_10_4() {
        System.out.println(t_a + " " + t_b);
        int count = 0;
        int count_2 = 0;
        System.out.print("2nd: ");
        int a_ = scanner_solve1.nextInt();
        int b_ = scanner_solve1.nextInt();
        for (int i = t_a; i <= t_b; i++){
            count++;
        }
        for (int i = a_; i <= b_; i++){
            count_2++;
        }

        if (count == count_2){
            System.out.println("\nYES!");
        } else {
            System.out.println("\nNO!");
        }
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_10_5() {
        System.out.println(t_a + " " + t_b);
        int sum = 0;
        int sum_2 = 0;
        System.out.print("2nd: ");
        int a_ = scanner_solve1.nextInt();
        int b_ = scanner_solve1.nextInt();
        for (int i = t_a; i <= t_b; i++){
            sum += i;
        }
        for (int i = a_; i <= b_; i++){
            sum_2 += i;
        }

        int ans = sum + sum_2;
        System.out.println("Sum: " + ans);

        System.out.println("\nDONE!");
    }

    @Override
    public void solve_10_6() {
        System.out.println(t_a + " " + t_b);
        int sum = 0;
        int sum_2 = 0;
        System.out.print("2nd: ");
        int a_ = scanner_solve1.nextInt();
        int b_ = scanner_solve1.nextInt();
        for (int i = t_a; i <= t_b; i++){
            sum += i;
        }
        for (int i = a_; i <= b_; i++){
            sum_2 += i;
        }

        int ans = sum - sum_2;
        System.out.println("Subt: " + ans);

        System.out.println("\nDONE!");
    }
    // ----------------------------------------------------------------------------------------
    /*
    1 2 3 4 5 6 7
    */

    @Override
    public void solve_11_main() {
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_11){
                arrayList_problem_11 = ((Problem_11) a).getArray_11();
            }
        }

        System.out.println(arrayList_problem_11.toString());
    }

    @Override
    public void solve_11_1() {
        System.out.println("\n" + arrayList_problem_11.toString());
        if (arrayList_problem_11.get(0) > arrayList_problem_11.get(arrayList_problem_11.size()-1)){
            System.out.println("Ubyvau");
        } else {
            System.out.println("Vozrast");
        }

        int aOR = arrayList_problem_11.get(1) - arrayList_problem_11.get(0);
        int count1 = 0;
        int gOR = arrayList_problem_11.get(1) / arrayList_problem_11.get(0);
        int count2 = 0;
        for (int i = 1; i < arrayList_problem_11.size(); i++){
            if (arrayList_problem_11.get(i) - arrayList_problem_11.get(i-1) == aOR){
                count1++;
            }
        }
        if (count1 == arrayList_problem_11.size()-1){
            System.out.println("Ar.");
        }

        for (int i = 1; i < arrayList_problem_11.size(); i++){
            if (arrayList_problem_11.get(i) / arrayList_problem_11.get(i-1) == gOR){
                count2++;
            }
        }
        if (count2 == arrayList_problem_11.size()-1){
            System.out.println("Geo.");
        }

        System.out.println("\nDONE!");
    }

    @Override
    public void solve_11_2() {
        System.out.println("\n" + arrayList_problem_11.toString());
        System.out.print("Find: ");
        int find_ = scanner_solve1.nextInt();
        boolean ans = false;
        for (int i = 0; i < arrayList_problem_11.size(); i++) {
            if (find_ == arrayList_problem_11.get(i)){
                ans = true;
            }
        }

        if (ans) {
            System.out.println("\nYES!\nDONE!");
        } else {
            System.out.println("\nNO!\nDONE!");
        }
    }

    @Override
    public void solve_11_3() {
        System.out.println("\n" + arrayList_problem_11.toString());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrayList_problem_11.size(); i++) {
            if (max < arrayList_problem_11.get(i)){
                max = arrayList_problem_11.get(i);
            }

            if (min > arrayList_problem_11.get(i)){
                min = arrayList_problem_11.get(i);
            }
        }

        System.out.println("MAX: " + max + "\nMIN: " + min + "\nDONE!");
    }
    // ----------------------------------------------------------------------------------------
    /*
    Java is WORA
    */
    @Override
    public void solve_12_main() {
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_12){
                str_solve12 = ((Problem_12) a).getStr_s();
            }
        }
    }

    @Override
    public void solve_12_1() {
        System.out.println("\n" + str_solve12);
        StringBuilder sb = new StringBuilder();
        sb.append(str_solve12);
        System.out.print("Word: ");
        String str_temp = scanner_solve2.nextLine();
        sb.append(" ");
        sb.append(str_temp);
        System.out.println("After: " + sb.toString());
    }

    @Override
    public void solve_12_2() {
        System.out.println("\n" + str_solve12);
        StringBuilder sb = new StringBuilder();
        System.out.print("Word: ");
        String str_temp = scanner_solve2.nextLine();
        String[] array = str_solve12.split(" ");
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(str_temp)){
                continue;
            }
            sb.append(array[i]);
            sb.append(" ");
        }
        System.out.println("After: " + sb.toString());
    }

    @Override
    public void solve_12_3() {
        System.out.println("\n" + str_solve12);
        StringBuilder sb = new StringBuilder();
        System.out.print("Word: ");
        String str_temp = scanner_solve2.nextLine();
        System.out.print("2nd word: ");
        String str_ = scanner_solve2.nextLine();
        String[] array = str_solve12.split(" ");
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(str_temp)){
                array[i] = str_;
            }
            sb.append(array[i]);
            sb.append(" ");
        }
        System.out.println("After: " + sb.toString());
    }

    @Override
    public void solve_12_4() {
        System.out.println("\n" + str_solve12);
        String[] array = str_solve12.split(" ");
        int count = 0;
        for (int i = 0; i < array.length; i++){
            count += array[i].length();
        }

        System.out.println("Count_[char]: " + count);
    }

    @Override
    public void solve_12_5() {
        System.out.println("\n" + str_solve12);
        String[] array = str_solve12.split(" ");
        System.out.println("[count]: " + array.length);
    }

    @Override
    public void solve_12_6() {
        System.out.println("\n" + str_solve12);
        String[] array = str_solve12.split(" ");
        String max = "";
        String min = "";
        int max_count = Integer.MIN_VALUE;
        int min_count = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (max_count < array[i].length()){
                max_count = array[i].length();
                max = array[i];
            }

            if (min_count > array[i].length()){
                min_count = array[i].length();
                min = array[i];
            }
        }
        System.out.println("[max]: " + max);
        System.out.println("[min]: " + min);
    }

    @Override
    public void solve_12_7() {
        System.out.println("\n" + str_solve12);
        String[] array = str_solve12.split(" ");
        System.out.print("Word: ");
        String word_ = scanner_solve2.nextLine();
        boolean t = false;
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(word_)){
                t = true;
            }
        }

        if (t){
            System.out.println("\nYES!\nDONE!");
        } else {
            System.out.println("\nNO!\nDONE!");
        }
    }

    @Override
    public void solve_12_8() {
        System.out.println("\n" + str_solve12);
        String[] array = str_solve12.split(" ");
        System.out.print("Numb: ");
        int numb = scanner_solve1.nextInt();
        System.out.println(array[numb]);
        System.out.println("\nDONE!");
    }

    @Override
    public void solve_12_9() {
        System.out.println("\n" + str_solve12);
        String[] array = str_solve12.split(" ");
        System.out.print("2nd sent.: ");
        String word_ = scanner_solve2.nextLine();
        String[] array2 = word_.split(" ");

        boolean t = false;
        if (array.length != array2.length){
            System.out.println("\nNO!\nDONE!");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(array2[i])) {
                continue;
            } else {
                System.out.println("\nNO!\nDONE!");
                return;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++){
                if (array[i].charAt(j) == array2[i].charAt(j)) {
                    continue;
                } else {
                    System.out.println("\nNO!\nDONE!");
                    return;
                }
            }
        }
        System.out.println("\nYES!\nDONE!");
    }
    // ----------------------------------------------------------------------------------------
    /*
    Happy Birthday to me! I have a feeling this is going to be an amazing day.
    */
    @Override
    public void solve_13_main() {
        for (abstract_PLaT_W11 a : arrayList_W11){
            if (a instanceof Problem_13){
                str_problem13 = ((Problem_13) a).getStr_s();
            }
        }
    }

    @Override
    public void solve_13_1() {
        System.out.println("\n"+str_problem13);
        StringBuilder sb = new StringBuilder();
        System.out.print("Add: ");
        String new_ = scanner_solve2.nextLine();
        sb.append(str_problem13);
        sb.append(" ");
        sb.append(new_);
        System.out.println("After: " + sb.toString());
    }

    @Override
    public void solve_13_2() {
        System.out.println("\n"+str_problem13);
        StringBuilder sb = new StringBuilder();
        System.out.print("Remove: ");
        String new_ = scanner_solve2.nextLine();
        String[] arr1 = str_problem13.split(" ");
        String[] arr2 = new_.split(" ");

        int k = 0;
        int count_ = arr2.length;
        for (int i = 0; i < arr1.length; i++){
            if (count_>0 && arr1[i].equals(arr2[k])){
                k++;
                count_--;
                continue;
            }
            sb.append(arr1[i]);
            sb.append(" ");
        }
        System.out.println("After: " + sb.toString());
    }

    @Override
    public void solve_13_3() {
        System.out.println("\n"+str_problem13);
        StringBuilder sb = new StringBuilder();
        System.out.print("Sent.: ");
        String new_ = scanner_solve2.nextLine();
        System.out.print("2nd Sent.: ");
        String new_ans = scanner_solve2.nextLine();
        String[] arr1 = str_problem13.split(" ");

        ArrayList<String> split_ = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++){
            sb.append(arr1[i]);
            if ( arr1[i].charAt(arr1[i].length()-1) == '.' || arr1[i].charAt(arr1[i].length()-1) == '!'
                    || arr1[i].charAt(arr1[i].length()-1) == '?'){
                split_.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(" ");
            }
        }

        int temp_ = 0;
        for (int i = 0; i < split_.size(); i++){
            System.out.println(split_.get(i));
            String temp_str = split_.get(i);
            if (temp_str.equals(new_)){
                temp_ = i;
            }
        }

        split_.set(temp_, new_ans);
        for (int i = 0; i < split_.size(); i++){
            sb.append(split_.get(i));
            sb.append(" ");
        }

        System.out.println("\nAfter: " + sb.toString());
    }

    @Override
    public void solve_13_4() {
        System.out.println("\n"+str_problem13);
        StringBuilder sb = new StringBuilder();
        String[] arr1 = str_problem13.split(" ");

        int count_ = 0;
        for (int i = 0; i < arr1.length; i++){
            for (int h = 0; h < arr1[i].length(); h++) {
                count_++;
            }
        }
        System.out.println("Char_ " + count_);

        count_ = 0;
        for (int i = 0; i < arr1.length; i++) {
            count_++;
        }
        System.out.println("Word_ " + count_);

        count_ = 0;
        for (int i = 0; i < arr1.length; i++) {
            if ( arr1[i].charAt(arr1[i].length()-1) == '.' || arr1[i].charAt(arr1[i].length()-1) == '!'
                    || arr1[i].charAt(arr1[i].length()-1) == '?'){
                count_++;
            }
        }
        System.out.println("Sent_ " + count_);
    }

    @Override
    public void solve_13_5() {
        System.out.println("\n"+str_problem13);
        StringBuilder sb = new StringBuilder();
        String[] arr1 = str_problem13.split(" ");

        ArrayList<String> split_ = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++){
            sb.append(arr1[i]);
            if ( arr1[i].charAt(arr1[i].length()-1) == '.' || arr1[i].charAt(arr1[i].length()-1) == '!'
                    || arr1[i].charAt(arr1[i].length()-1) == '?'){
                split_.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(" ");
            }
        }

        System.out.print("Numb: ");
        int numb_ = scanner_solve1.nextInt();
        System.out.println("\nANS: " + split_.get(numb_-1));
    }

    @Override
    public void solve_13_6() {
        System.out.println("\n"+str_problem13);
        StringBuilder sb = new StringBuilder();
        String[] arr1 = str_problem13.split(" ");

        ArrayList<String> split_ = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++){
            sb.append(arr1[i]);
            if ( arr1[i].charAt(arr1[i].length()-1) == '.' || arr1[i].charAt(arr1[i].length()-1) == '!'
                    || arr1[i].charAt(arr1[i].length()-1) == '?'){
                split_.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(" ");
            }
        }

        int max_ = 0;
        int min_ = 0;
        for (int i=1; i<split_.size(); i++){
            if (split_.get(i).length() > split_.get(max_).length()){
                max_ = i;
            }

            if (split_.get(i).length() < split_.get(min_).length()){
                min_ = i;
            }
        }

        System.out.println("Max: " + split_.get(max_));
        System.out.println("Min: " + split_.get(min_));
    }
    @Override
    public void solve_13_7() {
        System.out.println("\n"+str_problem13);
        StringBuilder sb = new StringBuilder();
        String[] arr1 = str_problem13.split(" ");

        ArrayList<String> split_ = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++){
            sb.append(arr1[i]);
            if ( arr1[i].charAt(arr1[i].length()-1) == '.' || arr1[i].charAt(arr1[i].length()-1) == '!'
                    || arr1[i].charAt(arr1[i].length()-1) == '?'){
                split_.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(" ");
            }
        }

        System.out.print("Find: ");
        String temp_ = scanner_solve2.nextLine();
        for (int i=0; i<split_.size(); i++){
            if (split_.get(i).equals(temp_)){
                System.out.println("\nYES!\nDONE!");
                return;
            }
        }

        System.out.println("\nNO!\nDONE!");
    }
    @Override
    public void solve_13_8() {
        System.out.println("\n"+str_problem13);
        StringBuilder sb = new StringBuilder();
        String[] arr1 = str_problem13.split(" ");

        ArrayList<String> split_ = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++){
            sb.append(arr1[i]);
            if ( arr1[i].charAt(arr1[i].length()-1) == '.' || arr1[i].charAt(arr1[i].length()-1) == '!'
                    || arr1[i].charAt(arr1[i].length()-1) == '?'){
                split_.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(" ");
            }
        }

        sb.setLength(0);
        System.out.print("Text: ");
        String text_ = scanner_solve2.nextLine();
        String[] arr2 = text_.split(" ");
        ArrayList<String> split_2 = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++){
            sb.append(arr2[i]);
            if ( arr2[i].charAt(arr2[i].length()-1) == '.' || arr2[i].charAt(arr2[i].length()-1) == '!'
                    || arr2[i].charAt(arr2[i].length()-1) == '?'){
                split_2.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(" ");
            }
        }

        if (split_.size() != split_2.size()){
            System.out.println("\nNO!\nDONE!");
            return;
        }

        for (int i=0; i<split_.size(); i++){
            String temp_string = split_2.get(i);
            if (split_.get(i).equals(temp_string)){
                continue;
            } else {
                System.out.println("\nNO!\nDONE!");
                return;
            }
        }
        System.out.println("\nYES!\nDONE!");
    }
    // ----------------------------------------------------------------------------------------
    /*
    09/12/2020, 28/08/2021, Astana, new_gtx1660
    09/12/2020, 05/02/2023, Astana, new_coreI7
    */

    @Override
    public void solve_14_main() {
        for (abstract_PLaT_W11 a:arrayList_W11){
            if (a instanceof Problem_14){
                al_problem14 = ((Problem_14) a).getAl_problem14();
            }
        }

        for (String s:al_problem14){
            System.out.println(s);
        }
    }

    static void get_fromArrayList(){

    }
    @Override
    public void solve_14_1() {
        for (String s:al_problem14){
            System.out.println(s);
        }
        try {
            get_fromArrayList();
            String[] split_ = new String[5];
            int i = 0;
            for (String s:al_problem14){
                split_[i] = s;
                i++;
            }

            String[] array_string = split_[0].split(" ");
            for (i = 0; i < array_string.length; i++){
                array_string = split_[0].split(", ");
            }


            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            // Calendar cal = Calendar.getInstance();
            String dateTime = "04/12/2020";
            String dateTime2 = "04/12/2021";
            Date date = sdf.parse(dateTime);
            Date date1 = sdf.parse(dateTime2);



        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void solve_14_2() {

    }

    @Override
    public void solve_14_3() {

    }

    @Override
    public void solve_14_4() {

    }


    // ----------------------------------------------------------------------------------------
    /*
    2000, 2125, 2500
    */

    @Override
    public void solve_15_main() {
        for (abstract_PLaT_W11 a : arrayList_W11) {
            if (a instanceof Problem_15) {
                qw_15 = ((Problem_15) a).getAll_15();
            }
        }
        System.out.println(qw_15.toString());
    }

    @Override
    public void solve_15_1() {
        System.out.println("\n"+qw_15.toString());
        int[] arr_ = new int[qw_15.size()];
        for (int i=0; i<arr_.length; i++){
            arr_[i] = qw_15.get(i);
        }

        int ans_ = Integer.MIN_VALUE;
        for (int i=0; i<arr_.length; i++){
            if (ans_<arr_[i]){
                ans_ = arr_[i];
            }
        }

        System.out.println("Ans: " + ans_);
    }

    @Override
    public void solve_15_2() {
        System.out.println("\n"+qw_15.toString());
        int[] arr_ = new int[qw_15.size()];
        for (int i=0; i<arr_.length; i++){
            arr_[i] = qw_15.get(i);
        }

        int ans_ = Integer.MAX_VALUE;
        for (int i=0; i<arr_.length; i++){
            if (ans_>arr_[i]){
                ans_ = arr_[i];
            }
        }

        System.out.println("Ans: " + ans_);
    }

    @Override
    public void solve_15_3() {
        System.out.println("\n"+qw_15.toString());
        int[] arr_ = new int[qw_15.size()];
        for (int i=0; i<arr_.length; i++){
            arr_[i] = qw_15.get(i);
        }

        int sum = 0;
        int ans_ = Integer.MIN_VALUE;
        for (int i=0; i<arr_.length; i++){
            sum+=arr_[i];
            if (ans_<arr_[i]){
                ans_ = arr_[i];
            }
        }

        ans_=Math.abs(ans_-sum);
        System.out.println("Ans: " + ans_);
    }

    @Override
    public void solve_15_4() {
        System.out.println("\n"+qw_15.toString());
        int[] arr_ = new int[qw_15.size()];
        for (int i=0; i<arr_.length; i++){
            arr_[i] = qw_15.get(i);
        }

        int sum = 0;
        int count = 0;
        int ans_ = Integer.MIN_VALUE;
        for (int i=0; i<arr_.length; i++){
            sum+=arr_[i];
            count++;
            if (ans_<arr_[i]){
                ans_ = arr_[i];
            }
        }

        ans_=Math.abs(ans_-(sum/count));
        System.out.println("Ans: " + ans_);
    }
}