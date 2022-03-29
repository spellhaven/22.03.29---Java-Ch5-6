package ch6_p347_equals;

public class Rect {

	private int width;	//필드 2개 선언 ㅋ
	private int height;
	
	public Rect(int width, int height) {	//위 2개 필드를 이용한 생성자 만들기 ㅋ
//		super();
		this.width = width;
		this.height = height;
	}
	
	// 사실 우리가 직접 작성하지 않아도, equals()는 이미 java.lang.Object에 있다 ㅋ
	// 그러나 그놈도 ==처럼 내용이 아닌 '레퍼런스'의 일치 여부를 따지기 때문에, 우리는 보통 이놈을 객체를 매개변수로 받게 오버라이딩해서 쓰는 거지.
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
