//wap to create a class called person with private instances variables name,age,country. 
//provide public getter and setter methods to access and modify these variables 

class Person {
    private String name;
    private int age;
    private String country;

    public void setName(String n) {              //setter for name
        name = n;         
    } 
    public String getName() {                    //getter for name
        return this.name;                  
    }
    public void setAge(int teen) {               //setter for age
        age = teen;
    }
    public int getAge() {                        //getter for age
        return this.age;
    }
    public void setCountry(String indian) {      //setter for country
        country = indian;
    }
    public String getCountry() {                 //getter for country
        return this.country;
    }
}
class Demo{
    public static void main(String args[]) {
        Person p1 = new Person();            //created an object p1
        p1.setName("Aradhya");
        System.out.println(p1.getName());    //we got the output that we set 
        p1.setAge(19);
        System.out.println(p1.getAge());
        p1.setCountry("India");
        System.out.println(p1.getCountry());
    }
}