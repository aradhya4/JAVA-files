// a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
class radius {

    public static double calcRadius(int r) {        
        double circum = 2 * 3.14 * r;
        return circum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();

        double circum = calcRadius(r);
        System.out.println("The circumference is:" + circum);
    }
}
