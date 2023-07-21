import java.util.Scanner;

public class Get_value{
    public static void main(String[] args) {
        int a;
        float b;


        Scanner s = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a =s.nextInt();
        System.out.println("Enter the value of b:");
        b =t.nextFloat();


        System.out.println("the value of a is :"+a);
        System.out.println("the value of b is :"+b);
    }
}