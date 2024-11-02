import java.util.Arrays;
import java.util.Scanner;

public class MiddleCharactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd-length word");
        String text = scanner.next();
        int length = text.length();

        while (length %2 == 0){
            System.out.println("Enter odd length word");
            text = scanner.next();
        }
        int midLength =(((length+1)/2)-1);
        System.out.println("The middle letter is : "+text.charAt(midLength));
    }
}
