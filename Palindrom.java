package hometask10;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Palindrom {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        

	        System.out.println("Enter list spaced by a single space : ");
	        String str = sc.nextLine();
	        String[] arr = str.split(" ");

	        Object[] objects = PalindromInterface.findPalindrom(arr);

	        Consumer<Object> consumer = System.out::println;
	        Arrays.stream(objects).forEach(consumer::accept);
	    }
}
