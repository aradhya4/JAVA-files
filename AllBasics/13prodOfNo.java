import java.util.*;
class prodOfNo {
    public static int CalcProduct(int a,int b){
        int prod = a*b;
        return prod;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int prod = CalcProduct(a,b);
        System.out.println("Product = " + prod);
    }
}