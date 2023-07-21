import java.io.*;
import java.util.Scanner;


class PowDigSum{
public static void main(String args[]){
int num;
Scanner s=new Scanner(System.in);
int ans=1;
int sum=0;
int pow=s.nextInt();
for(int i=1;i<=pow;i++){
ans=ans*2;}
System.out.println(ans);

while(ans%10!=0){
sum=sum+ans%10;}
System.out.println(sum);

}}

