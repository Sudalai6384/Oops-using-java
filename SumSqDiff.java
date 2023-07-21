import java.io.*;
import java.util.Scanner;


class SumSqDiff{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int N=s.nextInt();
int i;
int sumOfSqs=0;
int sqOfSums;
int Sums=0;
for(i=1;i<=N;i++){
sumOfSqs=sumOfSqs+(i*i);}

System.out.println(sumOfSqs);

for(i=1;i<=N;i++){
Sums=Sums+i;}

sqOfSums=Sums*Sums;
System.out.println(sqOfSums);

int Ans=sqOfSums-sumOfSqs;
System.out.println("Answer is:"+Ans);

}}
	