// 4 types of access modifiers in java
// PUBLIC - can be accessed by itself and other packages as well
// DEFAULT - when nothing mentioned then it is default i.e can be accessed by itself and not by any other package 
// PROTECTED - can be accessed by itself and dusre package mai only subclasses can access
// PRIVATE - can be accessed only by that class itself neither the package can access nor the subclasses in that package nor another package
//       '--->>
//               to access these private classes we use setters and getters by using set and get

class AccessModifier14 {
    public String name;                  //public
    String age;                          //default
    protected String email;              //protected
    // private String password;          //private

}
