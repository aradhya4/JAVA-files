//Inheritance - base class se subclass inherit kar leti h - it is of 4 types
class Shape {
    String color;
}
class Triangle extends Shape {

}


public class Inheritance08 {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "black";                      //triangle class mai koi property is not defined still no error for color in triangle class bcoz 
                                                 //triangle is a subclass jisne shape class ki properties inherit kar li h 

    }
}
