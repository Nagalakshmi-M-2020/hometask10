package hometask10;
import java.util.Arrays;
import java.util.Scanner;

public class average {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of array : ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter array : ");
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println(Arrays.stream(arr).average().getAsDouble());
}
}