import java.util.Scanner;

public class AreaCircle{
    public static void main(String[] args) {
        int rad;
        double pi=3.14;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        rad=s.nextInt();
        double area=pi*rad*rad;

        System.out.println("the area of circle is:"+area);
    }
}