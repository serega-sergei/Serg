package test;

public class Test {
	
	public static void main(String[] args){
		System.out.println("Hello from: " + new Test().toString());
	}

	@Override
	public String toString() {
		// xxxxxxxxxxxxxxxasdfasdfasdfxxxxxxxxx
		return "Test Class " + super.toString();
	}	
}
