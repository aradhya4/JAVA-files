// import java.util.*;
class manipulation {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        String name = "Aradhya";
        String surname = "Srivastava";
        String fullName = name + surname;         //string concatenation
        System.out.println(fullName); 

        System.out.println(fullName.length());    //string length
        //to print all these characters
        for(int i=0;i<fullName.length();i++) {
            System.out.println(fullName.charAt(i));  //charAt is used 
        }
    }
}