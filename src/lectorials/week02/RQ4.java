package lectorials.week02;

public class RQ4 {
    public static void main(String[] args) {
        int month = 13;
        switch (month) {
            case 1:
            case 2:
            case 3: System.out.println("First Quarter");
//                break;
            case 4: System.out.println("April");
//                break;
            case 5:
            case 6: System.out.println("Second Quarter");
//                break;
            case 7:
            case 8:
            case 9: System.out.println("Third Quarter");
//                break;
            case 10:
            case 11:
            case 12: System.out.println("Fourth Quarter");
//                break;
            default: System.out.println("Invalid input");
//                break;
        }
    }

}
