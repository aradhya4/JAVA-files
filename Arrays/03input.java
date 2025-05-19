import java.util.*;
class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();             //user se input le liya array ka size 
        int marks[] = new int[n];


        for(int i=0;i<n;i++) {
            marks[i] = sc.nextInt();        //we took marks from the user 
        }
        sc.close();
        System.out.println("Afer taking input from the user");

        for(int i=0;i<n;i++) {
            System.out.println(marks[i]);          
        }
    }        //since we did'nt initialize any value for inndices that's why it came as zeros

}
        