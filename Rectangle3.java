class Shape{

	public int calculateArea(int length,int breadth){
		return length*breadth;
	}
}


class Rectangle3 extends Shape{

	public static void main(String args[]){
		Rectangle3 rect=new Rectangle3();
		System.out.println("Area :"+rect.calculateArea(10,5));
		
}}