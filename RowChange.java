import java.util.*;
import java.util.Scanner;

package pack;

import java.util.*;

public class RowChange{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j=0,n;
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(i=0;i<n;i++)
			{a[i]=sc.nextInt();
			}
		sc.close();
		
		Arrays.sort(a);
		
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				b[i]=a[j];
			}
			if(i%2!=0)
			{
				b[i]=a[n-1-j];
				j++;
			}
		}
		
		for(i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		

	}

}