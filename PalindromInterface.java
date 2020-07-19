package hometask10;
import java.util.Arrays;
public class PalindromInterface {
	 static Object[] findPalindrom(String[] arr) {
	        return Arrays.stream(arr)
	                .filter(i -> new StringBuilder(i).reverse().toString().equals(i))
	                .toArray();
	    }
}
