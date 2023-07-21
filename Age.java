import java.io.*;
import java.util.*;
public class Age{
public static void main(String[]args){
int age;
System.out.println("Enter the age");
Scanner s= new Scanner(System.in);
age=s.nextInt();
String E=age>18?"Eligible":"NotEligible";
System.out.println(E);
}

}

