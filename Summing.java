import java.io.*;
class Num
{
  int num1;
  int num2;
int sum1;
void insertRecord(int a,int b)
{
     num1=a;
	 num2=b;
	
}
void displayInformation()
{	
	System.out.println(num1+num2);
}
	 
}
class Summing{
public static void main(String[] args)
   {
	
        Num s1=new Num();
		s1.insertRecord(32,43);
		s1.displayInformation();
		
	
    }
}