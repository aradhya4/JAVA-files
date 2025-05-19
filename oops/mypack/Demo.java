package mypack;
import mypack.Simple;

public class Demo {
    public static void main(String[] args) {
        Simple s1 = new Simple();
        s1.name = "Here we are using package";
        System.out.println(s1.name);
        s1.voice();
    }
}
