import java.io.*;
import java.util.*;
class countSum2
{
public static void main(String args[])
{
int i,j,k,count=0;
Scanner sc=new Scanner(System.in);

int n = sc.nextInt();
int m = sc.nextInt();

int arr[]=new int[m];

for(i=0;i<m;i++){
arr[i]=sc.nextInt();
}

int a=0;
	for(j=a+1;j<m;j++)
	{
		for(k=j+1;k<m;k++)
		{
			if((arr[a]+arr[j]+arr[k]) <= n ){
			System.out.printf("%d%d%d\n",arr[a],arr[j],arr[k]);
			count++;
			}
		}
	}

System.out.println("The count is :"+count);
}}