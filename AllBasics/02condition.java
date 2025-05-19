import java.util.*;                                  // this module needs to be imported to take input 
class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);         //way of taking an input 
        int age = sc.nextInt();                   //string input ke liye String age = sc.nextLine

        if (age>18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not a adult");
        }
        sc.close();
    }
}

//output direct terminal window pe likh den
