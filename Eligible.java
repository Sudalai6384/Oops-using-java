import java.io.*;
import java.util.Scanner;

public class Eligible{
public static void main(String arg[]){
int M,P,C,Total,MathPhy;
Scanner s= new Scanner(System.in);
System.out.println("enter the mark in Maths :");
M=s.nextInt();
System.out.println("enter the mark in Physics :");
P=s.nextInt();
System.out.println("enter the mark in Chemistry :");
C=s.nextInt();
Total = M+P+C;
MathPhy = M+P;
if(Total>=180|MathPhy>=140){
System.out.println("The candidate is eligible for admission");}
else{
System.out.println("The candidate is not eligible for admission");}


}}