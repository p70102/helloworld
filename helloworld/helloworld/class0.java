package helloworld;

public class class0 {

	public static void main(String[] args) {
	   // TODO Auto-generated method stub
		
		
		Triangle tri1 = new Triangle();
		//Triangle Ŭ������ tri1�̶�� �̸��� ��ü�� ����(Ŭ������ ���� ��ü)
		tri1.bottom = 10;
		tri1.height = 20;
		tri1.color = "red";
		double s = tri1.tri_area(10, 20);
		System.out.print(s);
		
		square squ1 = new square();
		//square Ŭ������ squ1�̶�� �̸��� ��ü�� ����
		squ1.width = 10;
		squ1.height = 10;
		squ1.color = "black";

	}

}
