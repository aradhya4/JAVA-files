import java.util.*;
class Solution1 {
    public static void studentGrade(int marks) {
        if(marks >= 90) {
            System.out.println("Output: Grade A");
            System.out.println("Explanation: marks are greater than or equal to 90.");

        }
        else if(marks< 90 && marks >= 70) {
            System.out.println("Output: Grade B");
            System.out.println("Explanation: marks are greater than or equal to 70.");

        }
        else if(marks< 70 && marks >= 50) {
            System.out.println("Output: Grade C");
            System.out.println("Explanation: marks are greater than or equal to 50.");

        }
        else if(marks< 50 && marks >= 35) {
            System.out.println("Output: Grade D");
            System.out.println("Explanation: marks are greater than or equal to 35.");

        }  
        else {
            System.out.println("Fail");
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:marks =");
        int marks = sc.nextInt();
        studentGrade(marks);

        sc.close();
    }
}
