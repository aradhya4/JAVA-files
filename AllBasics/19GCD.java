import java.util.*;
class gcd {

    public static void gcD(int n1,int n2) {
        while(n1 != n2) {
            if(n1 > n2) {
                n1 -= n2;
            }
            else {
                n2 -= n1;
            }
        }
        System.out.println("The greatest common divisor is: " + n2);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        gcD(n1, n2);
    }
}
