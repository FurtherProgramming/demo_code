package lectorials.week02;

public class Method {
    public static int compareInt(int x, int y){
//        return x > y?x:y;
//        System.out.println(i);
        if(x > y){
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(compareInt(1,2));
        System.out.println(compareInt(1000,2));
        System.out.println(compareInt(101,200));
        int i = 0;
        int j = 1;
        System.out.println(compareInt(i,j));

        int x = 1;
        System.out.println(x);
        System.out.println(compareInt(1000,2));
        System.out.println(x);

    }
}
