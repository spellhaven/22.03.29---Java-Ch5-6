package ch6_p383_exercise1and2;

import ch6_p347_equals.Rect;

public class Circle {

	private int coordX, coordY, center;
	
	public Circle(int coordX, int coordY, int center) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
		this.center = center;
	}

	public boolean equals(Object obj) {	
	
		Circle c = (Circle) obj; //�� �� �ٿ�ĳ���� �� �Ǵ��� ���� ��. �� �� �ȵ���? �� �߰�ȣ ¦ �� �¾ҳ� ��.
	
		int ur_center = c.center;	
		int my_center = this.center;
		
		if (ur_center == my_center) {	//���� �� �ǳ� == ��԰� =�� �� ��
			return true;
		} else {
			return false;
		}
	}
	
	

}
