class Student {
    String name;
    int marks;
    
    public void studentReport() {
        System.out.println(this.name);
        System.out.println(this.marks);
    }

    Student( Student s2) {       // copying a constructor (s1 ko s2 main copy)
        this.name = s2.name;                     
        this.marks = s2.marks;
    }
    Student() {

    }
}

public class Constructor05 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name  = "Aradhya";
        s1.marks = 90;

        Student s2 = new Student(s1);
        s2.studentReport();   //pass hmne s2 ko kiya jisme koi info nahi but still isne s1 ki info return kari kyuki s1 ko s2 mai hmne copy kiya
    }
}
