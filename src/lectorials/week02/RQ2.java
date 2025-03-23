package lectorials.week02;

public class RQ2 {
    public static void main(String[] args) {
        String s1 = "Abraham";
        String s2 = "Isaac";
        if (s1.compareTo(s2) > 0)
            System.out.println(s1 + " is greater");
        else if (s1.compareTo(s2) == 0)
            System.out.println(s1 + " same as " + s2);
        else
            System.out.println(s2 + " is greater");
    }

}

