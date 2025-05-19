//Taking a matrix as an input Searching for an element x in a matrix.
import java.util.*;
class searchtwoD {
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
        //output
        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(num[i][j] == x) {
                    System.out.println("Element found at index: " +i+","+j);
                }
            }
        }
        sc.close();
    }
}
