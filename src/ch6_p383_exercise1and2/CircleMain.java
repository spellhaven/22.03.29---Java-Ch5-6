package ch6_p383_exercise1and2;

// ���� �ٸ� ���̶�� ��� ����� �� ��������, �� ���� �� �̻��ϴ�
// �� �ٵ� �� �ð� ���� �ȳ����輼��!!!
public class CircleMain {

	public static void main(String[] args) {
		
		Circle a = new Circle(2, 3, 5);	//�߽� (2,3)�� ������ 5�� �� ��
		Circle b = new Circle(2, 3, 30); //�߽� (2,3)�� ������ 30�� �� ��
		
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		
		if(a.equals(b))
			System.out.println("���� ��. ��ǡ�� ��. �������̳� ��");
		else
			System.out.println("���� �ٸ� ��");
		
	}

}
