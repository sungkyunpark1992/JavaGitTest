package chapter07;

public class MethodOrder {

	public static void main(String[] args) {
		
		MethodEx me = new MethodEx();
		
		me.one();	//메서드 실행
	}

}
class MethodEx{
	
	void one() {
		
		System.out.println("one");
		two();
	}
	void two() {
		
		System.out.println("two");
		three();
	}
	void three() {
		System.out.println("three");
	}
	
}
