package ch5_p296_interface;

public interface PhoneInterface_296 { // �������̽� ����

	//	int a; ���� �� �ȵȴ�. ���� �������̽���.
	final int TIMEOUT = 10000; //��� ����
	
	public abstract void sendCall(); // �߻� �޼ҵ� ����
	void receiveCall(); // �߻� �޼ҵ� ���� - ������ �������̽� ���� �޼ҵ�� �� public abstract��. �� �κ� ��������.
		
	default void printLogo() { // default �޼ҵ�. �������̽� �ȿ��� ������ ������� �̸��ؾ�.
		// default �޼ҵ�� abstract����� �޸�, "�� �����ؾ�" �� �ʿ�� ����. �Ϸ��� �� �� �ִ� �Ű�...
		System.out.println("** Phone **");
	}
}
