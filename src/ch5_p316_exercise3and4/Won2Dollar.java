package ch5_p316_exercise3and4;

//난 틀렸다. 하하. 교수님 답을 여기다 쓰고, 내 답은 전부 주석 처리했다.
//교수님 Overriding하실 때 특) 일단 run은 일반 메소드니까 '꼭' 오버라이딩할 필요는 없다 하시며, 필요할 때 가져오자 하시며 않 가져옴.
//내가 run()만 안 가져왔으면 맞았을 텐데, 오히려 가져와서 틀렸다 (weary face emoji)

public class Won2Dollar extends Converter {

	public Won2Dollar(double ratio) {
//		super();
		this.ratio = ratio; //외부에서 들어온 값으로 ratio 초기화
		// ratio = this.ratio라고 하면 infinity 달러라고 값이 나와 버린다. 헷갈리지 말디 ㅋ.
	}

	@Override
	protected double convert(double src) {
		double won_dollar = src / ratio;
		return won_dollar;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

	
	
	
	
	
	
//	//교: 환율 변수를 하나 선언해 놓고, 그걸 초기화하게 생성자를 만들어 보세요 ㅋ.
//	//교: 아 아니네요. Converter 클래스의 protected double ratio;를 초기화시켜서 해 보세요.
//	
//	protected double getVal() {	//아 getter 같은 거 만들어야하나? 어케함
//		return val;
//	}
//	
//
//	public Won2Dollar(double ratio) { //아 이 셍성자 왜이래
//		super();
//		this.ratio = ratio;
//		//this.ratio의 ratio는 분명 이 클래스가 아닌 슈퍼클래스 Converter에 있는 놈이지만,
//		//교: 상속받은 거니까 여기에도 ratio가 있는 거죠! 그니까 this.라고 써도 됩니다.
//		//나의 해석: 엄마 거는 내 거라고 해도 되는구나 ㅋ
//		
//		// TODO Auto-generated constructor stub
//	}
//
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	} // 이게 있으니까 toDollar.run();이 얘가 되어 버리는 거 같다 일단 주석처리
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
////		System.out.print("원");
////		return null;
//		return "원";
//// return null;은 이클립스가 알아서 만들어 줬는데, 함수 이름 앞에 void 붙이는 거랑 return null;은 같은 건가?
//// 아 이클립스야 void 함수랑 다르잖아 이거! 어쩔거야!
//	}
//
//	@Override
//	protected String getDestString() {
//		// TODO Auto-generated method stub
////		System.out.print("달러");
////		return null;		
//		return "달러";
//	}

}
