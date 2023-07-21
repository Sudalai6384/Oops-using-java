import java.util.*;
import java.util.Scanner;

class MaxRow{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,m,i,j,max=0;

n=sc.nextInt();
m=sc.nextInt();


int arr[][]=new int[n][m];


for(i=0;i<n;i++)
	{
	for(j=0;j<m;j++)
	{
	arr[i][j]=sc.nextInt();

	}
}
int a=0;
for(j=0;j<m;j++)
{
	max=0;
for(i=0;i<n;i++)
{
	max=max+arr[j][i];
}
if(a<max)
{
	a=max;
}
//max=0;
}
System.out.println(" max is "+a);

}
}