package Week3day1;

public class InterfaceIMp implements LearnInterface, Interface2 {

	public static void main(String[] args) {
//		Interface2 Intobj = new Interface2();
		InterfaceIMp obj = new InterfaceIMp();
		obj.sampleMethod1();
		obj.sampleMethod1(5,6);
		obj.sampleMethod3(55,6.2);
		obj.sampleMethod2(5,"string");
		obj.sampleOwn();

	}

	public void sampleMethod1(int x, int y) {

System.out.println("interger input is" + x + " " + y);
	}

	public void sampleMethod2(int x, String y) {

		System.out.println("interger & String input is" + x + " " + y);
	}

	public void sampleOwn() {
		System.out.println("own method");
	}

	public void sampleMethod1() {
		System.out.println("without argument" );

	}

	public void sampleMethod3(float val, double da) {
		System.out.println("float & double input is" + val + " " + da);

	}

}
