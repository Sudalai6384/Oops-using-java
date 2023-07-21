import java.util.Scanner;

public class Arearectangle{
    public static void main(String[] args) {
        int l,b,area;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length:");
        l =s.nextInt();
        System.out.println("Enter the breadth:");
        b =s.nextInt();
        area=l*b;

        System.out.println("the area of circle is:"+area);
    }
}