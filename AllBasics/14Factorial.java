import java.util.*;
class fact {
    public static void calcFact(int n) {
        int fact = 1;
        if(n<0) {
            System.out.println("Invalid No.");
        }
        else {
            for(int i=n;i>=1;i--) {
                fact = fact * i;
            }
            System.out.println("Factorial of the no. is = " + fact);
            return;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        calcFact(n);              //call kr diya function ko 
    }
}
