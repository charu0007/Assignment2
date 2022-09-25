import java.util.*;

public class Q5 {
    public static void main(String[] args) throws Exception{
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = src.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i + " " + i*i + " " + i*i*i + " " + i*i*i*i );
        }
    }
}
