import java.util.Arrays;
import java.util.Scanner;

public class FirstMiddleLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First,Middle and last name sequentially:");
        String fullName = input.next();
        int firstIndex = fullName.indexOf(",");
        int lastIndex = fullName.lastIndexOf(",");
        String firstName = fullName.substring(0,firstIndex);
        String middleName = fullName.substring(firstIndex+1,lastIndex);
        String lastName = fullName.substring(lastIndex+1);
        System.out.println(lastName+ "," +firstName+ "," +middleName.charAt(0) );
    }
}
