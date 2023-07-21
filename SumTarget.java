import java.util.*;
import java.util.Scanner;

class SumTarget
{
		public static void main(String args[])
		{
			int n,i,j,sum=0;
			Scanner sc= new Scanner(System.in);
			n=sc.nextInt();
			
			int arr[]=new int[n];
			
			for(i=0;i<n;i++)
			{
			arr[i]=sc.nextInt();
			}
			
			int target=sc.nextInt();
			
			for(i=0;i<n;i++){
				for(j=i+1;j<n;j++){
					
				sum=arr[i]+arr[j];
				
				if(sum==target){
				System.out.printf("%d + %d = %d\n",arr[i],arr[j],target);}
				
			}}
}}
