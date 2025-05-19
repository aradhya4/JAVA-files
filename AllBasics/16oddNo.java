//all odd no. from i to n

import java.util.*;
class oddnum {
    public static void calcOdd(int n) {
        int sum = 0;
        for(int i=1 ; i<=n; i++){
            if(i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of odd no.s is: " + sum);
        return;
    }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        calcOdd(n);
    }
}
