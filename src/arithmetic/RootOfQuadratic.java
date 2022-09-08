package arithmetic;

import java.util.Scanner;

public class RootOfQuadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double root1, root2;
        //take input from user
        System.out.println("Enter Value for a,b,c for Quadratic Equation ax2+bx+c :: ");
        System.out.println("a :: ");
        a= sc.nextInt();
        System.out.println("b :: ");
        b= sc.nextInt();
        System.out.println("c :: ");
        c= sc.nextInt();
        //Calculate Discriminant for Check roots are valid or not
        double D = b*b-4*a*c;
        if(D<0){
            System.out.println("Not Real Roots :: Or NaN");

        }
        else{
            root1 = (-b+Math.sqrt(D))/(2*a);
            root2 = (-b-Math.sqrt(D))/(2*a);
            System.out.println("Roots 1 Are -> "+root1);
            System.out.println("Roots 2 Are -> "+root2);
        }

    }
}
