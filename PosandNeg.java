import java.io.*;
import java.util.Arrays;
class PosandNeg{
public static void main(String args[]){
int arr[]=new int[]{3,-65,45,-16,32,-73,46};
int pos=0,neg=0;
for(int i=0;i<7;i++){
	if(arr[i]>0)
	{pos++;}
	else
	{neg++;}
	}
if (pos>neg){
System.out.println("pos num=" +pos);}
else{
System.out.println("neg num=" +neg);}


}}