package ch6_p347_equals;

// Wrapper�� �⺻ 8�� �������� �޼ҵ带 �� �� �ִ� ��ü�� ����� �ش�.
// ��� �̷� ��ʰ� �ִ�~ ������ �˾� �ְ�, �������� ��Ŭ������ ������ Ȥ�� �˻� ����� �ȴ�. �δ� ����
public class WrapperTest_351 {

	public static void main(String[] args) {
//		Integer i = Integer.valueOf(10);//��°�ü
//		int a = 10;	//��º���
		
		System.out.println(Character.toLowerCase('A'));
		
		char ch1 = '4';
		char ch2 = 'F';
		char ch3 = '��';
		char ch4 = 'ʦ';
		
		if(Character.isDigit(ch1)) { //�Էµ� ���� ��������? ���ڸ� true
			System.out.print("�����Դϴ�.");			
		}
		
		if(Character.isAlphabetic(ch4)) { //�Էµ� ���� ���ĺ�����? ���ĺ��̸� true
			System.out.print("���ĺ��Դϴ�.");	// ��? ch3�� ���ĺ��̶�� ���Ѵ�. �����ڵ忡�� �ѱ��� Alphabetic���� ó���ؼ� �׷� �ɱ�?
			//�� ch4�� ���ĺ��̶�� �ϴµ�... �׳� ���ڸ� ���� �� ���ĺ��̶�� �ϴ� �ų�? �� ��. ���� ����� ����? ��. ����. �ù߳��. ��. ����. �ù����.
		}
		
		System.out.println(Integer.parseInt("-1234"));	//���� ���ڿ��� ���ڷ� �ٲ� �ִ� �� parseInt�� ���� ���� ����. API ȣ���ؼ� �� ũ�Ѹ��� ��(Ư�� ���̽�) ���...
		
		Double d = Double.valueOf(3.14); //3.14�� ������ �ִ� ��ü ����
		String a = d.toString(); //��. ���ڸ� ���ڿ��� �ٲ�� �� ���� �־�.
		double b = Double.parseDouble(a);
		
		boolean bool = true;
		String b1 = Boolean.toString(bool);	//�긦 ����ϸ� ���ڿ� "true"�� ����ϰ� �Ǵ� ����.
		boolean b2 = Boolean.parseBoolean(b1); //���ڿ� "true"�� bool�� TRUE�� ��ȯ
		
		Integer ten = 10; //Integer.valueOf(10);�� ���ٰ� �ؼ� "�ڽ�"�̶�� �θ���.
		int ten2 = ten;	//int ten2 = ten.intValue();�� ����. ten ���� 10�� ���� Wrapper Ÿ���� Integer�� �ƴ�, �⺻ Ÿ���� int�� �ٲ��. �̰� "��ڽ�"�̶�� �Ѵ�.
		
	}

}
