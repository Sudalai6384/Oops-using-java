import java.io.*;
import java.util.Scanner;
class PattC{
public static void main(String args[]){
int n,i,j;
Scanner s= new Scanner(System.in);
System.out.println("Enter the n value:");
n=s.nextInt();


for(i=0;i<=n;i++){
	for(j=0;j<n;j++){
	if (((i==0)||(i==11)) && ((j>3)||(j<8))){
	System.out.printf("# ");}
	
	else{
	System.out.printf("  ");}
	
}System.out.println();}

}}	