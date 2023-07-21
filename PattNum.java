import java.io.*;
import java.util.Scanner;

class PattNum{
public static void main(String args[]){
int i,j;
int r=7;
int c=16;


for(i=0;i<7;i++){
	for(j=0;j<7;j++){
	if(i==j){
	System.out.print(i+1);}
	else{
	System.out.print(" ");}
	}
	System.out.println();
	}
	
	for(i=5;i>=0;i--){
	for(j=7;j<13;j++){
			if(j==(i-2)){
		System.out.print(j+1);}
		else{
	System.out.print(" ");}
	}
	System.out.println();
	}	
				
}}