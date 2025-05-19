import java.util.*;
class average {

    public static int calcAvg(int a,int b,int c) {       //int or void depends upon ki agli line mai kya logic lag raha
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        int avg = calcAvg(a,b,c);
        System.out.println("The average is:" + avg);
    }
}
