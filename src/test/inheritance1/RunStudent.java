package test.inheritance1;

public class RunStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "û��";
		s1.age = 21;
		s1.addr = "���� ȭ��";
		System.out.println("����: "+s1.name);
		System.out.println("����: "+s1.age);
		System.out.println("�ּ�: "+s1.addr);
		
		System.out.print(s1.name + "�� ");
		s1.eat();
		s1.sleep();
		s1.study();
		System.out.println(s1.toString());
	}

}
