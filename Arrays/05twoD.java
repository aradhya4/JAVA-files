import java.util.*;
class twoDarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();        //asks user to give no. of rows and cols
        int cols = sc.nextInt();

        int num[][] = new int[rows][cols];

        //input
        // outer loop for rows and inner loop for cols
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                num[i][j] = sc.nextInt();       //takes the values now as input 
            }
        }
        sc.close();
        //output
        System.out.println("The output is: ");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
