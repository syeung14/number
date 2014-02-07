package mytest;

class Animal {

	public Number eat() throws Exception {
		return null;
	}
}

class Dog2 extends Animal {
	static int count;

	public Dog2() {
		super();
		count++;
		// TODO Auto-generated constructor stub
	}

	char[][] data = new char[5][];

	@Override
	public Double eat() {
		count++;

		int intV = 0144;
		System.out.println(intV);

		return null;
	}
}

public class TEST {

	private void method() {
		short res = (short) Integer.parseInt("11101111", 2);
		System.out.println(res);

		
		System.out.println( (char)Integer.parseInt("1000011",2));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new TEST().method();
	}
}
