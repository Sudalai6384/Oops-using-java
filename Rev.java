import java.io.*;
import java.util.Scanner;

class Rev{
public static void main(String...args){
Scanner s=new Scanner(System.in);
System.out.printf("Enter the number :");
int num=s.nextInt();
while(num!=0){

System.out.printf("%d",num%10);
num=num/10;}

}}