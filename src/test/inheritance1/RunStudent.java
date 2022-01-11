package test.inheritance1;

public class RunStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "청명";
		s1.age = 21;
		s1.addr = "섬서 화산";
		System.out.println("성명: "+s1.name);
		System.out.println("나이: "+s1.age);
		System.out.println("주소: "+s1.addr);
		
		System.out.print(s1.name + "이 ");
		s1.eat();
		s1.sleep();
		s1.study();
		System.out.println(s1.toString());
	}

}
