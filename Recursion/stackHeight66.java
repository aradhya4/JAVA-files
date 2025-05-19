// print x^n(stack height = logn)
public class stackHeight66 {
    public static int calcPower(int x,int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        if(n%2 == 0) {   // n is even
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        else { //n is odd
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int ans = calcPower(2, 5);
        System.out.println(ans);
    }
}
