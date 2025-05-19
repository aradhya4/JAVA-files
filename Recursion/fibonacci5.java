// fibonacci ---> 0,1,1,2,3,5,8,......
public class fibonacci5 {
    public static void printFib(int a,int b,int n) {
        if(n==0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);      // ek no. already printed isiliye n-1
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFib(a, b, n-2);      // in n=7, 2 terms are already taken a & b so we did n-2
    }
}
