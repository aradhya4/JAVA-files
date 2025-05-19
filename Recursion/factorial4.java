public class factorial4 {
    public static int calcFact(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        int fact_nm1 = calcFact(n-1);
        int factNo = n * fact_nm1;
        return factNo;
    }
    public static void main(String[] args) {
        // System.out.println(calcFact(5));
                    //OR
        int ans = calcFact(5);
        System.out.println(ans);            
    }
}
