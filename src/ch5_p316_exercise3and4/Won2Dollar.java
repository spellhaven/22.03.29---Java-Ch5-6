package ch5_p316_exercise3and4;

//�� Ʋ�ȴ�. ����. ������ ���� ����� ����, �� ���� ���� �ּ� ó���ߴ�.
//������ Overriding�Ͻ� �� Ư) �ϴ� run�� �Ϲ� �޼ҵ�ϱ� '��' �������̵��� �ʿ�� ���� �Ͻø�, �ʿ��� �� �������� �Ͻø� �� ������.
//���� run()�� �� ���������� �¾��� �ٵ�, ������ �����ͼ� Ʋ�ȴ� (weary face emoji)

public class Won2Dollar extends Converter {

	public Won2Dollar(double ratio) {
//		super();
		this.ratio = ratio; //�ܺο��� ���� ������ ratio �ʱ�ȭ
		// ratio = this.ratio��� �ϸ� infinity �޷���� ���� ���� ������. �򰥸��� ���� ��.
	}

	@Override
	protected double convert(double src) {
		double won_dollar = src / ratio;
		return won_dollar;
	}

	@Override
	protected String getSrcString() {
		return "��";
	}

	@Override
	protected String getDestString() {
		return "�޷�";
	}

	
	
	
	
	
	
//	//��: ȯ�� ������ �ϳ� ������ ����, �װ� �ʱ�ȭ�ϰ� �����ڸ� ����� ������ ��.
//	//��: �� �ƴϳ׿�. Converter Ŭ������ protected double ratio;�� �ʱ�ȭ���Ѽ� �� ������.
//	
//	protected double getVal() {	//�� getter ���� �� �������ϳ�? ������
//		return val;
//	}
//	
//
//	public Won2Dollar(double ratio) { //�� �� �ļ��� ���̷�
//		super();
//		this.ratio = ratio;
//		//this.ratio�� ratio�� �и� �� Ŭ������ �ƴ� ����Ŭ���� Converter�� �ִ� ��������,
//		//��: ��ӹ��� �Ŵϱ� ���⿡�� ratio�� �ִ� ����! �״ϱ� this.��� �ᵵ �˴ϴ�.
//		//���� �ؼ�: ���� �Ŵ� �� �Ŷ�� �ص� �Ǵ±��� ��
//		
//		// TODO Auto-generated constructor stub
//	}
//
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	} // �̰� �����ϱ� toDollar.run();�� �갡 �Ǿ� ������ �� ���� �ϴ� �ּ�ó��
//
//
//	@Override
//	protected double convert(double src) {
//		// TODO Auto-generated method stub
//		
//		
//		
////		double val = this.val;
////		double res = this.res; 
//		
//		
//		return res;
//	}
//
//	@Override
//	protected String getSrcString() {
//		// TODO Auto-generated method stub
////		System.out.print("��");
////		return null;
//		return "��";
//// return null;�� ��Ŭ������ �˾Ƽ� ����� ��µ�, �Լ� �̸� �տ� void ���̴� �Ŷ� return null;�� ���� �ǰ�?
//// �� ��Ŭ������ void �Լ��� �ٸ��ݾ� �̰�! ��¿�ž�!
//	}
//
//	@Override
//	protected String getDestString() {
//		// TODO Auto-generated method stub
////		System.out.print("�޷�");
////		return null;		
//		return "�޷�";
//	}

}
