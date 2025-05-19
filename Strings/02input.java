import java.util.*;
class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();              //take only next for string     //through this only 1st word will be printed
        String name = sc.nextLine();             //through this all words 
        sc.close();

        System.out.println("Your name is: " + name);        
    }
}
