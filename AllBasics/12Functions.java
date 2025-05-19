import java.util.*;
class functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);                     //give a name as input and it will print that
        sc.close();
    }
}