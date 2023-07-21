
import java.io.*;

import java.util.*;

class StPaSc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int A=2;
int X=2;
int B=1;
int Y=1;
int C=3;
int Z=3;
int me=0;
int com=0;

int win=6;
int lose=0;
int tie=3;

char play1;
char play2;


while( me<15 || com<15){

play1=sc.next().charAt(0);
play2=sc.next().charAt(0);

	if(play1=='A'){
		if(play2=='X'){
		me+=tie+A;
		com+=tie+X;
		
		}
		else if(play2=='Y'){
		me+=win+A;
		com+=lose+Y;
		}
		else if(play2=='Z'){
		me+=lose+A;
		com+=win+Z;
		}
		else{
		System.out.println("Not valid");}

		
	}
	
		else if(play1=='B'){
		if(play2=='X'){
		me+=B+lose;
		com+=X+win;
		}
		else if(play2=='Y'){
		me+=B+tie;
		com+=Y+tie;
		}
		else if(play2=='Z'){
		me+=B+win;
		com+=Z+lose;
		}
		else{
		System.out.println("Not valid");}
	}
	
	else if(play1=='C'){
	if(play2=='X'){
	me+=C+win;
	com+=X+lose;
		}
		else if(play2=='Y'){
		me+=C+lose;
		com+=Y+win;
		}
		else if(play2=='Z'){
		me+=C+tie;
		com+=Z+tie;
		}
		else{
		System.out.println("Not valid");}
	}
	
	else{
	System.out.println("Not valid");}
}

if(me>=15 && com>=15){
System.out.println("player1:"+me);
System.out.println("player2:"+com);

System.out.println("Tie");}

else if(me>=15&&com<15){
System.out.println("player1:"+me);
System.out.println("player2:"+com);

System.out.println("Player1 wins");}


else if(me<15&&com>=15){
System.out.println("player1:"+me);
System.out.println("player2:"+com);

System.out.println("Player2 wins");}

}}





