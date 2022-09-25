import java.util.*;

public class MinOfThree {
    public static void main(String[] args) throws Exception {
        int a = 10, b = 20, c = 30;
        if(a<=b&&a<=c) System.out.println("Smallest Number is: " + a);
        else if(b<=a&&b<=c) System.out.println("Smallest Number is: " + b);
        else System.out.println("Smallest Number is: " + c);
    }
}
