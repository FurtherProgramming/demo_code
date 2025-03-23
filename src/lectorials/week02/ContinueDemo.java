package lectorials.week02;

public class ContinueDemo {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if(i%2 == 0){
                System.out.println(i);
                continue;
            }

            //Other codes
            System.out.println("test");

        }
    }
}
