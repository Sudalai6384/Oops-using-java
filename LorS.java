import java.io.*;
import java.util.Scanner;
class LorS{
public static void main(String args[]){	
int n;
Scanner s = new Scanner(System.in);
System.out.println("Enter num of elements");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of array:");
int larg=a[0],small=a[0];
for(int i=0;i<n;i++){
a[i]=s.nextInt();}



for(int i=0;i<n;i++){
if(a[i]>larg){
larg=a[i];}}
System.out.println("the largest number is:");
System.out.println(larg);

for(int i=0;i<n;i++){
if(a[i]<[small){
small=a[i];}}
System.out.println("the smallest number is:");
System.out.println(small);
}}