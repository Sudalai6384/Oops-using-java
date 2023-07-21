import java.util.*;

class prob1
   {
      public static void main(String args[])
        {
			int n,m;
			int i,min;
			int j;
			int count=0;
			int count1=0;
			Scanner s=new Scanner(System.in);

			System.out.println("ENter the size of array");

			n=s.nextInt();
			int a[]=new int[n];

			for(i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
				min=a[0];

			for(i=0;i<n;i++)
			{

				if(min>a[i])
			{
				min=a[i];
			}

			}
			for(i=0;i<n;i++)
			{

				if(a[i]==min)
			   {

			 }
			else
			{

				while(a[i]>min)
				{
					count++;
					a[i]--;
				}
			}
			}
          System.out.print(+count);
		}
   }