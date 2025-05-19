public class Practice {
    int add(int a,int b) {
        return a+b;
    }
    int add(int a,int b,int c) {
        return a+b+c;
    }
}
class Overloading {
    public static void main(String args[]) {
        Practice A1 = new Practice();
        System.out.println(A1.add(11,12));
        System.out.println(A1.add(10,12,34));
    }
}
