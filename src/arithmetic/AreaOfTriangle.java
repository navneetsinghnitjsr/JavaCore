//find out the area of triangle given only 2 inputs
package arithmetic;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, height, area;
        System.out.println("Enter the Base of Triangle in cm :: ");
        base = sc.nextDouble();
        System.out.println("Enter the Height of Triangle in cm ::");
        height = sc.nextDouble();
        area = (base*height)/2;
        System.out.println("Area of Triangle is :: "+ area);
    }
}
