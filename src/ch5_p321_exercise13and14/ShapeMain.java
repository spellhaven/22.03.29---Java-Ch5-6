package ch5_p321_exercise13and14;

public class ShapeMain {

	public static void main(String[] args) {
		Shape donut = new Circle(10);	// �������� 10�� �� ��ü(��ĳ����)
		donut.redraw();
		System.out.println("������ " + donut.getArea());
	}

}
