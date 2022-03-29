package ch5_p296_interface;

public class SmartPhone_296 extends PDA_296 implements MobilePhoneInterface_296, MP3Interface_296, CameraInterface_296 {

	// 야호! 다른 클래스 상속(extends)는 1개만 받을 수 있디!
	// 다른 인터페이스 구현(implements)은 여러 개 가능~~~ 다중 상속 가능! ha ha ha! (인터페이스도 '상속'이라고 불러도 되는듯하다.)
	
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cameraShot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pictureSave() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
