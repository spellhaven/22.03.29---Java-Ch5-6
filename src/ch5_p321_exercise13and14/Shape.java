package ch5_p321_exercise13and14;

//�⺻������ �������̽� �ȿ� ���� �Լ��� default���� �� �տ� �� �� �ָ� �� abstract��. �����.

public interface Shape {
	final double PI = 3.14;	//���
	
	void draw();	//������ �׸��� �߻� �޼ҵ�. �������̵� �Ǳ⸸�� ��ٸ��� �ִ�.
	double getArea();	//������ ������ �����ϴ� �߻� �޼ҵ�. �������̵� �Ǳ⸸��...
	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}
