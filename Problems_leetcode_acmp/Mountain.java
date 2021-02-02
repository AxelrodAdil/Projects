package Solutions;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {89, 90, 6, 3, 2, 1};
        int N = arr.length;
        int i = 0;
        System.out.println(Mountain.boo(arr, N, i));
    }

    public static boolean boo(int arr[], int N, int i) {
        while (i + 1 < N && arr[i] < arr[i + 1])
            i++;
        if (i == 0 || i == N - 1)
            return false;
        while (i + 1 < N && arr[i] > arr[i + 1])
            i++;
        return i == N - 1;
    }
}