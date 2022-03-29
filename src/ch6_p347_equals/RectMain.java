package ch6_p347_equals;

public class RectMain {

	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(2,3);		
		Rect c = new Rect(2,3);
		
		if(a.equals(b)) {
			System.out.print("같디");
		} else {
			System.out.print("다르디");
		}
		
	}

}
