//find out area of triangle with 3 input from the user
package arithmetic;
import java.util.Scanner;

public class AreaOfTriangleSideOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of side 1 :: ");
        double a= sc.nextDouble();
        System.out.println("Enter value of side 2 :: ");
        double b= sc.nextDouble();
        System.out.println("Enter value of side 3 :: ");
        double c= sc.nextDouble();
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is :: "+area);
    }
}
