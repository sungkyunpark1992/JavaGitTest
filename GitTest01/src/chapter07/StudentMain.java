package chapter07;

public class StudentMain {

	public static void main(String[] args) {
			
//		Student stu = new Student("홍길동", 4, "소프트웨어 공학");
//		
//		System.out.println(stu.name);
//		System.out.println(stu.grad);
//		System.out.println(stu.department);
//
//		Student stu2 = new Student("이순신", 3, "디자인");
//		
//		System.out.println(stu2.name);
//		System.out.println(stu2.grad);
//		System.out.println(stu2.department);
//		
//		//기본 생성자로 객체 생성
//		Student stu0 = new Student();	//에러발생
		
		Student stu1 = new Student();	// 1번 생성자
		Student stu2 = new Student("홍길동");	// 2번 생성자
		Student stu3 = new Student("홍길동",4);	// 3번 생성자
		Student stu4 = new Student("홍길동",4,"소프트웨어공학");	// 4번 생성자
		
	}

}
