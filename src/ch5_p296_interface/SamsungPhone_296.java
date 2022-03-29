package ch5_p296_interface;

// 인터페이스를 implement(구현) 하는 클래스를 만들어 보자 ㅋ.
public class SamsungPhone_296 implements PhoneInterface_296 {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.print("따르릉");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.print("전화받으세요. ㅋ");
		
	}

	
	
}
