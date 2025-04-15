package lectorials.week07;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}catch(Exception x) {
			System.err.println(x.getMessage());
		}finally {
			System.out.println("I really wanna execute this no matter what.");
		}
		
		System.out.println("Hello world!");
		
	}

}
