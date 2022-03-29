package ch6_p347_equals;

// Wrapper는 기본 8형 변수들을 메소드를 쓸 수 있는 객체로 만들어 준다.
// 사실 이런 용례가 있다~ 정도만 알아 주고, 나머지는 이클립스야 도와줘 혹은 검색 갈기면 된다. 부담 ㄴㄴ
public class WrapperTest_351 {

	public static void main(String[] args) {
//		Integer i = Integer.valueOf(10);//얘는객체
//		int a = 10;	//얘는변수
		
		System.out.println(Character.toLowerCase('A'));
		
		char ch1 = '4';
		char ch2 = 'F';
		char ch3 = '가';
		char ch4 = '可';
		
		if(Character.isDigit(ch1)) { //입력된 놈이 숫자인지? 숫자면 true
			System.out.print("숫자입니다.");			
		}
		
		if(Character.isAlphabetic(ch4)) { //입력된 놈이 알파벳인지? 알파벳이면 true
			System.out.print("알파벳입니다.");	// 어? ch3도 알파벳이라고 말한다. 유니코드에서 한글을 Alphabetic으로 처리해서 그런 걸까?
			//어 ch4도 알파벳이라고 하는데... 그냥 문자면 전부 다 알파벳이라고 하는 거냐? 이 슉. 슈슉 영어권 븅들아? 슉. 슈슉. 시발놈아. 슉. 슈슉. 시벌놈아.
		}
		
		System.out.println(Integer.parseInt("-1234"));	//들어온 문자열을 숫자로 바꿔 주는 이 parseInt는 제법 많이 쓴다. API 호출해서 웹 크롤링할 때(특히 파이썬) 등등...
		
		Double d = Double.valueOf(3.14); //3.14를 가지고 있는 개체 선언
		String a = d.toString(); //어. 숫자를 문자열로 바꿔야 할 때도 있어.
		double b = Double.parseDouble(a);
		
		boolean bool = true;
		String b1 = Boolean.toString(bool);	//얘를 출력하면 문자열 "true"를 출력하게 되는 거지.
		boolean b2 = Boolean.parseBoolean(b1); //문자열 "true"를 bool값 TRUE로 반환
		
		Integer ten = 10; //Integer.valueOf(10);과 같다고 해서 "박싱"이라고 부른다.
		int ten2 = ten;	//int ten2 = ten.intValue();와 같다. ten 안의 10만 빼서 Wrapper 타입의 Integer가 아닌, 기본 타입의 int로 바꿨네. 이걸 "언박싱"이라고 한다.
		
	}

}
