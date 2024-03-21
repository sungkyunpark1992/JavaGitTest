package chapter07;

public class InitEx2 {
	//static 변수
	static int sVar;
	//static 메서드
	static void sMethod() {
		
	}
	
	//인스턴스 변수
	int var;
	//인스턴스 메서드
	void method() {
		
	}
	
	// static 초기화 블럭
	static {
		sVar =0;	//static변수
		sMethod();
		
		//에러(인스턴스 변수, 메서드 사용불가)
//		var = 0;
//		method();
	}
	
	// static 메서드
	static void sMethod2() {
		
		// 에러 (static 메서드에서 this 키워드 사용불가)
//		this.sVar = 0;	//static 변수
//		this.sMethod();	//static 메서드
		
	}
	
}
