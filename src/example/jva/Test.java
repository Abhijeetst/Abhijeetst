package example.jva;

public class Test {

	int a=20;int b=30;
	public static void program() {
		
		System.out.println("This is the addition of A and B is:");
		
	}
	
	public void addition() {
		
		int c=a+b;
		program();
		System.out.println(c);
		
	}
	
		
	public static void main(String[] args) {
		
		Test t=new Test();
		t.addition();
		Demo d=new Demo();
		d.substraction();
		Demo2 dd=new Demo2();
		dd.mul();
		
	}

}
