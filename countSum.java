import java.io.*;
import java.util.*;
class countSum
{
public static void main(String args[])
{
int i,j,k,count=0;
Scanner sc=new Scanner(System.in);

int n = sc.nextInt();

for(i=0;i<=n;i++)
{
	for(j=0;j<=n;j++)
	{
		for(k=0;k<=n;k++)
		{
			if((i+j+k)==n){
			System.out.printf("%d%d%d\n",i,j,k);
			count++;
			}
		}
	}
}

System.out.println(count);


}}