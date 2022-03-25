package helloworld;

public class class0 {

	public static void main(String[] args) {
	   // TODO Auto-generated method stub
		
		
		Triangle tri1 = new Triangle();
		//Triangle 클래스로 tri1이라는 이름의 객체를 선언(클래스로 만들어낸 객체)
		tri1.bottom = 10;
		tri1.height = 20;
		tri1.color = "red";
		double s = tri1.tri_area(10, 20);
		System.out.print(s);
		
		square squ1 = new square();
		//square 클래스로 squ1이라는 이름의 객체를 선언
		squ1.width = 10;
		squ1.height = 10;
		squ1.color = "black";

	}

}
