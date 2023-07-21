import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class CountOfSorting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i,j,c=0,temp,n;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					c++;
				}
			}

	}
		System.out.println("The count is "+ c);

}
}