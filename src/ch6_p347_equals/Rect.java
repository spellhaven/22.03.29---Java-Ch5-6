package ch6_p347_equals;

public class Rect {

	private int width;	//�ʵ� 2�� ���� ��
	private int height;
	
	public Rect(int width, int height) {	//�� 2�� �ʵ带 �̿��� ������ ����� ��
//		super();
		this.width = width;
		this.height = height;
	}
	
	// ��� �츮�� ���� �ۼ����� �ʾƵ�, equals()�� �̹� java.lang.Object�� �ִ� ��
	// �׷��� �׳� ==ó�� ������ �ƴ� '���۷���'�� ��ġ ���θ� ������ ������, �츮�� ���� �̳��� ��ü�� �Ű������� �ް� �������̵��ؼ� ���� ����.
	public boolean equals(Rect rec) {		
		int area = rec.height * rec.width;	
		int area_self = this.height * this.width;
		
		if (area == area_self) {
			return true;
		} else {
			return false;
		}
		
	}
}
