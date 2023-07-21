import java.io.*;
import java.util.Scanner;

class Mul{
public static void main(String...args){
int a=1;
Scanner s=new Scanner(System.in);
System.out.printf("Enter the number :");
int num=s.nextInt();

while(a<=10){
int ans=a*num;
a++;
System.out.printf("%d x %d = %d",num,a,ans);
System.out.println();
}
}}