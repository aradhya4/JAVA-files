import java.util.*;
class tanspose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();             //user se no. of rows and cols as input
        int cols = sc.nextInt(); 

        int num[][] = new int[rows][cols];   //isko 2d array define kr liya

        //input
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                num[i][j] = sc.nextInt();    //hmne values leli user se
            }
        }
        sc.close();
        System.out.println("The transpose of the matrix is: ");
        for(int j=0;j<cols;j++) {
            for(int i=0;i<rows;i++) {
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
    } 
}           
