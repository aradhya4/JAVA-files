//non-parameterized constructor i.e it have no parameters (default constructor)
class Students {
    String name;
    int marks;
    
    public void studentReport() {
        System.out.println(this.name);
        System.out.println(this.marks);
    }

    Students() {                                              //this is a non-parameterized constructor bcoz it has no parameters
        System.out.println("Constructor called");
    }
}

public class Constructor03 {
    public static void main(String args[]) {
        Students s1 = new Students();           //here this student is a constructor...go to student constructor and it's o/p will be printed
        s1.name = "Aradhya";
        s1.marks = 90;

        s1.studentReport();
    }
}
