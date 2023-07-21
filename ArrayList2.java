import java.io.*;
import java.util.ArrayList;
 
public class ArrayList2{
 
  public static void main(String[] args) {
  ArrayList<Integer>demo1=new ArrayList<>();
  demo1.add(1);
  demo1.add(2);
  demo1.add(3);
   
  ArrayList<Integer>demo2=new ArrayList<>();
  demo2.add(4);
  demo2.add(5);
  demo2.add(6);
  
  
  demo2.addAll(demo1);
  System.out.println(demo2);
  }}