class Student {
        String name;
        int marks;
        
        public void studentReport() {
            System.out.println(this.name);
            System.out.println(this.marks);
        }
    
        Student( String name, int marks) {       //this is a parameterized constructor bcoz it has parameters
            this.name = name;                     //phla name is obj ka name and dusra name is parameter which is passed
            this.marks = marks;
        }
    }
    
public class Constructor04 {
    public static void main(String args[]) {
        Student s1 = new Student("Aradhya",90);
        
        s1.studentReport();
    }
}
