// Time Complexity = O(2^n)
public class towerOfHanoi7 {
    public static void towerOfHanoi(int n, String src,String helper,String dest) {
        if(n==1) {
            System.out.println("Transfer disk" +n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk" +n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    } 
    public static void main(String[] args) {
        towerOfHanoi(2, "S", "H", "D");    //n can take many values 
    }
}
