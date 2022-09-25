import java.util.*;

public class Q4 {
    public static void main(String[] args) throws Exception{
        float p = 80000;
        float f = (float) 21.0/20;
        int y = 0;
        while(p<150000){
            p*=f;
            y++;
        }
        System.out.println("The city's population would exceed 150000 after " + y + "years");
    }
}
