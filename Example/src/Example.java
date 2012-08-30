public class Example {
	int x;

	Example(int x) {
		
		if (x <= 5) {
		this.x = x;}
		else {
		this.x = -1;
		}
	}

	public static void main(String[] args) {

		Example test = new Example(5); //Create 'test' object with the value '5';
		Example anotherTest = new Example(7); //Create 'anotherTest' object with the value '7';
		System.out.println("The 'x' value of 'test' object is " + test.x);
		System.out.println("The 'x' value of 'anotherTest object' is " + anotherTest.x);

	}

}


















