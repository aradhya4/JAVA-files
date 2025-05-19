//sum of n natural no.s
public class sumOfNum3 {
    public static void sumNumb(int i,int n,int sum) {
        if(i==n) {                //base condition 
            sum += i;             //phir ye wali 
            System.out.println(sum);
            return;
        }
        sum += i;                 //phle ye wali statements execute horhi hongi
        sumNumb(i+1,n,sum);
    }
    public static void main(String[] args) {
        sumNumb(1,5,0);
    }
}
