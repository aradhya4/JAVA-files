import java.util.*;
class equality {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x==y) {
            System.out.println("equal");
        }
        else if(x>y){
            System.out.println("A is greater");
        }
        else{
            System.out.println("A is lesser");
        }
        sc.close();   
    }
}