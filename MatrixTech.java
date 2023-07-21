import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class MatrixTech{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int r,c,i,j;
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];
int m[][]=new int[r][c];

for(i=0;i<r;i++){
	for(j=0;j<c;j++){
	a[i][j]=s.nextInt();
	}
}

for(j=0;j<c;j++){
	for(i=0;i<r;i++){
	System.out.print(a[i][j]);
	b[i][j]=a[j][i];
	}
	System.out.println();
	}
	
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
m[i][j]=0;

for(int k=0;k<r;k++)
{

m[i][j]=a[i][k]*b[k][j];
}

}

}


System.out.println("the multiplied matrix is");


for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(m[i][j]+" ");

}
System.out.println(" ");
}
	
}}