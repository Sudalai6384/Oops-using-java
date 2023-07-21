import java.io.*;
import java.util.Scanner;
class Revmul{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the num");
int num=s.nextInt();
while(a>=1){
int ans=a*num;
a--;
System.out.printf("%d x %d = %d",num,a,ans);
System.out.println();
}
}}