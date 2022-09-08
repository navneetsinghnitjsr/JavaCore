package arithmetic;

public class Arithmetic {
    public static void main(String[] args) {
        //int a = 14 , b= 5;
        float a = 14.3f, b= 3.2f;
                // int c = a/b; //divide
                float c = (float)a/b; //typecast with float value
                //int r = a%b; // mode or remainder
                float r = a%b;
        System.out.println(c);
        System.out.println(r);
    }
}
