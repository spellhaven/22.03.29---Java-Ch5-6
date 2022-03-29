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
	
		Circle c = (Circle) obj; //한 번 다운캐스팅 잘 되는지 보자 ㅋ. 어 왜 안되지? 아 중괄호 짝 안 맞았네 ㅋ.
	
		int ur_center = c.center;	
		int my_center = this.center;
		
		if (ur_center == my_center) {	//하하 나 맨날 == 까먹고 =로 해 ㅋ
			return true;
		} else {
			return false;
		}
	}
	
	

}
