package mytest;

public class Child extends Parent {
	static {
		System.out.println("Child static");
	}
	
	Child(){
		System.out.println("child Con");
	}
	

	@Override
	protected int getInt() {
		
		return super.getInt();
	}
	
	public void otherM(String[]... naem){
		
	}

	
	public static void main(String[] args) {
		Parent p = new Child();
		
		System.out.println(p.getInt());
	}
}
