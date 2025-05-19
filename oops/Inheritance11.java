// TYPE3 - HIERARICHIAL Inheritance
// ek he class ke multiple subclass
class Shape {
    public void area() {                          //we have defined a function
        System.out.println("It displays area");
    }
}
class Triangle extends Shape {
    public void area(int b,int h) {              
        System.out.println((1/2)*b*h);            
    }                                         
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}
public class Inheritance11 {
    public static void main(String args[]) {

    }
}
