import java.util.*;

class Friends
{
public static void main(String args[])
{
int n,i,count=0;

Scanner sc=new Scanner(System.in);
System.out.println("number of elements");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Enter the elements ");


for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}

for(i=0;i<n;i++)
{
   

System.out.print(a[i]+" ");

}

for(i=0;i<n-1;i++)
{
if(a[i]==a[i+1])
{

}
else
{

count++;
}


}



if(a[0]==a[n-1])
{

}
else
{

count++;
}




System.out.print(count);









}
}