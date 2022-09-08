//taking input from user and Print Binary form
package takingInput;

import java.util.Scanner;

public class PrintBinaryFromNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to Binary Conversion :: ");
        int x = sc.nextInt();
        System.out.println("The Binary of Given Number is " + Integer.toBinaryString(x));
    }
}
