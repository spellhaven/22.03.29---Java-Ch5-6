package ch6_p383_exercise1and2;

// 서로 다른 원이라는 출력 결과는 잘 나오지만, 그 위가 좀 이상하다
// 아 근데 나 시간 없다 안녕히계세요!!!
public class CircleMain {

	public static void main(String[] args) {
		
		Circle a = new Circle(2, 3, 5);	//중심 (2,3)에 반지름 5인 원 ㅋ
		Circle b = new Circle(2, 3, 30); //중심 (2,3)에 반지름 30인 원 ㅋ
		
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		
		if(a.equals(b))
			System.out.println("얘기야 ㅋ. 오퐈랑 ㅋ. 같은원이내 ㅋ");
		else
			System.out.println("서로 다른 원");
		
	}

}
