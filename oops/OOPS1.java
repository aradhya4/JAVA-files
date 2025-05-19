// classes and objects
class Animal {                      //here animal is the class, dog nd cat are objects and every object has some properties 
                                    //                  like name,color,type,brand etc....
    String name;
    String color;

    public void animalType() {            //we declared a function animalType is a function
        System.out.println(this.name);    //this tells ki iss function ko konse obj ne call kiya h....jase ki hme pta chla ki dog obj tha jisne call kiya fn ko
        System.out.println(this.color);   //                uske baad cat obj ne bhi call kiya iss fn ko
    }
}

public class OOPS1 {                    //first letter of the class is suppose to be capital otherwise it will not run
    public static void main(String args[]) {
        Animal dog = new Animal();
        dog.name = "bronny";

        Animal cat = new Animal(); 
        cat.name = "tunnu";
        cat.color = "black";

        dog.animalType();             //dog and cat are objects
        cat.animalType();
    }
}