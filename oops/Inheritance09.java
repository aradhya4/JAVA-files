//base class is the parent class and sub class is the child class

//       TYPE1 - single class inheritance 
class Shape {
    public void area() {                          //we have defined a function
        System.out.println("It displays area");
    }
}
class Triangle extends Shape {
    public void area(int b,int h) {               //it will have properties of its parent class and its additional properties as well
        System.out.println((1/2)*b*h);            //1/2 * base *height
    }                                         
}

public class Inheritance09 {
    public static void main(String args[]) {
        
    }
    
}
