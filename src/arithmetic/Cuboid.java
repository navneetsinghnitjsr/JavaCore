package arithmetic;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        double length, height, breadth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cuboid' Length");
        length = sc.nextDouble();
        System.out.println("Enter Cuboid' Breadth");
        breadth = sc.nextDouble();
        System.out.println("Enter Cuboid' Height");
        height = sc.nextDouble();
        //let calculate total area
        double totalarea = 2*(length*breadth + breadth*height + height*length);
        double volume = length*breadth*height;
        System.out.println("Cuboid Length is " +length+ " , Breadth "+breadth+" and Height "+height);
        System.out.println("Cuboid Total Area is "+totalarea);
        System.out.println("Volume is "+volume);


    }

}
