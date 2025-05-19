// TYPE2 - MULTI LEVEL INHERITANCE
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
class EquilateralTriangle extends Shape {          //class ke andar subclass ke andar subclass
    public void area(int b,int h) {              
        System.out.println((1/2)*b*h);            
    }                                         
}

public class Inheritance10 {
    
}
