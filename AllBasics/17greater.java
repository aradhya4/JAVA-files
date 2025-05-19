//a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
class greater{

    public static void greaterNum(int a,int b) {
        if(a>b) {
            System.out.println("The greater no. is: " + a);
        }
        else{
            System.out.println("The greater no. is: " + b);
        }
        return;
    }  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        greaterNum(a, b);
    }
}
