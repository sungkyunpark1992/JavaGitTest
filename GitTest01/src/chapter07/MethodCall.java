package chapter07;

public class MethodCall {

	public static void main(String[] args) {
		// 직접 실행
		Method.printName();
		
		// 객체를 생성해서 실행
		Method m = new Method();
		m.printEamil();

	}

}
class Method{
	
	static void printName() {
		System.out.println("printName() 실행");
	}
	
	void printEamil() {
		System.out.println("printEail() 실행");
		
		printId();
	}
	void printId() {
		System.out.println("printId() 실행");
	}
	
}
