//wap to create a class called book with instance variables like title,author and price. 
//implement a default constructor and 2 parameterized constructor 

class Book {
    String title;
    String author;
    float price;

    public void mostSold() { 
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);
    }
    Book() {                                           //default 
        System.out.println("constructor called");
    }
    Book(String title,String author) {
        System.out.println();
    }
}
class Books {
    public static void main(String args[]) {
        Book b1 = new Book();
        b1.mostSold();
        
    }
}