package ch5_p321_exercise13and14;

public class ShapeMain {

	public static void main(String[] args) {
		Shape donut = new Circle(10);	// 반지름이 10인 원 객체(업캐스팅)
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}

}
