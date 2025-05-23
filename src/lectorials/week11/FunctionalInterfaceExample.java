package lectorials.week11;

@FunctionalInterface
interface Operator{
	int operate(int a, int b);
}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		int x = 2;
		Operator myOperation = (a, b) -> a + b;
		System.out.println(myOperation.operate(2, 3));
		myOperation = (a, b) -> a / b;
		System.out.println(myOperation.operate(2, 3));
		myOperation = (a, b) -> (int)(Math.pow(a, b));
		System.out.println(myOperation.operate(2, 3));

		Operator minus = (a, b) -> a - b;
		System.out.println(minus.operate(2, 3));

		Operator multiply = (a, b) -> a * b;
		System.out.println(multiply.operate(2, 3));
		
	}
}
