import java.util.Scanner;
public class ReverseNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете стойност за a1");
        int tripleDigitNumber = sc.nextInt();
        int revNumber = 0;

        while (tripleDigitNumber != 0) {
            int remainder = tripleDigitNumber % 10;
            revNumber = revNumber * 10 + remainder;
            tripleDigitNumber /= 10;
        }

        System.out.println(revNumber);
    }
}
