import java.util.*;
class TestCollection4{
 public static void main(String args[]){
 
  ArrayList<String> al=new ArrayList<String>();
  al.add("Navi");
  al.add("Pavi");
  al.add("Kavi");
  
  ArrayList<String> al2=new ArrayList<String>();
  al2.add("Sutha");
  al2.add("Hari");
  al2.add("Raj");
  
  al.addAll(al2);  

  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}