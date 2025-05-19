// print x^n(stack height = n)
public class stackHeight6 {
    public static int calcPower(int x,int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        int xpownm1 = calcPower(x,n-1);
        int xpown = x * xpownm1;           // x * x^n-1 = x^n
        return xpown;
    }
    public static void main(String[] args) {
        int ans = calcPower(2, 5);
        System.out.println(ans);
    }
}
