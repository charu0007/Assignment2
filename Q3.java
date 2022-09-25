import java.util.*;

public class Q3 {
    public static void main(String[] args) throws Exception{
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Index: ");
        int i = src.nextInt();
        int d = 30;
        switch(i){
            case 1: System.out.println("January: " + (d+1) + "days" ); break;
            case 2: System.out.println("February: " + (d-2) + "days" ); break;
            case 3: System.out.println("March: " + (d+1) + "days" ); break;
            case 4: System.out.println("April: " + (d) + "days" ); break;
            case 5: System.out.println("May: " + (d+1) + "days" ); break;
            case 6: System.out.println("June: " + (d) + "days" ); break;
            case 7: System.out.println("July: " + (d+1) + "days" ); break;
            case 8: System.out.println("August: " + (d+1) + "days" ); break;
            case 9: System.out.println("September: " + (d) + "days" ); break;
            case 10: System.out.println("October: " + (d+1) + "days" ); break;
            case 11: System.out.println("November: " + (d) + "days" ); break;
            case 12: System.out.println("December: " + (d+1) + "days" ); break;
            default : System.out.println("This month does not exist"); break;
        }
    }
}
