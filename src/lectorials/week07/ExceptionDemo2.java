package lectorials.week07;

public class ExceptionDemo2 {
	public static void methodWithPossibleException(int a, int b) throws Exception{
		if(b != 0) {
			System.out.println(a/b);
		}else {
			throw new Exception("The second variable cannot be 0.");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			methodWithPossibleException(10, 2); // no exception
			methodWithPossibleException(10, 0); // will have exception
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}
