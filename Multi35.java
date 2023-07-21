import java.io.*;
import java.util.Scanner;


class Multi35{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int N=s.nextInt();
int i;
int sum=0;
for(i=0;i<N;i++){
if(i%3==0 || i%5==0){
sum=sum+i;}
}
System.out.println(sum);

}}
	