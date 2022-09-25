import java.util.*;

public class Q1 {
    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Score: ");
        double a = src.nextDouble();
        if (a>80&&a<90) a+=5;
        System.out.println("New Score: " + a);
    }
}