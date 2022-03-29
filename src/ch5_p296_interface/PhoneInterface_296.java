package ch5_p296_interface;

public interface PhoneInterface_296 { // 인터페이스 선언

	//	int a; 같은 건 안된다. 여긴 인터페이스라.
	final int TIMEOUT = 10000; //상수 선언
	
	public abstract void sendCall(); // 추상 메소드 선언
	void receiveCall(); // 추상 메소드 선언 - 어차피 인터페이스 안의 메소드는 다 public abstract다. 그 부분 생략가능.
		
	default void printLogo() { // default 메소드. 인터페이스 안에서 내용을 넣을라면 이리해야.
		// default 메소드는 abstract들과는 달리, "꼭 구현해야" 할 필요는 없다. 하려면 할 수 있는 거고...
		System.out.println("** Phone **");
	}
}
