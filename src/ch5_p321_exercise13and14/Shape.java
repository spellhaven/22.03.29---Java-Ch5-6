package ch5_p321_exercise13and14;

//기본적으로 인터페이스 안에 들어가는 함수는 default같은 거 앞에 안 써 주면 다 abstract다. 기억혀.

public interface Shape {
	final double PI = 3.14;	//상수
	
	void draw();	//도형을 그리는 추상 메소드. 오버라이딩 되기만을 기다리고 있다.
	double getArea();	//도형의 면적을 리턴하는 추상 메소드. 오버라이딩 되기만을...
	default public void redraw() {
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}
