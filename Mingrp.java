import java.io.*;
import java.util.Scanner;
public class Mingrp{
public static void main(String arg[]){
int n;


Scanner s=new Scanner(System.in);

System.out.println("enter the n:");
n=s.nextInt();
int a[]=new int[n];

System.out.println("enter the values:");
for(int i=0;i<n;i++){
a[i]=s.nextInt();}

int min=a[0];
for(int i=0;i<n;i++){
if(a[i]<min){
min=a[i];}
}
System.out.print(min);

}}



