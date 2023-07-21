import java.io.*;
import java.util.Scanner;

class Comp2{
public static void main(String args[]){
int n,k,T;
int ans=1;
int b,c;

Scanner s=new Scanner(System.in);
System.out.println("test case T:");
T=s.nextInt();


for(int i=0;i<T;i++){
System.out.println("no Of computers n:");
n=s.nextInt();
System.out.println("no Of times switch is pressed k:");
k=s.nextInt();

for(i=1;i<=n;i++){
ans=ans*2;}

b=ans-1;
c=k%(b+1);

if(c==b){
System.out.println("Yes");}
else{
System.out.println("No");}
}



}}

