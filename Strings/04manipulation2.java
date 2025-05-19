class manipulation2 {
    public static void main(String[] args) {
        String first = "hello";
        String second = "world";
 
        // string1 > string2 
        // string1 < string2
        // string1 = string2
        if(first.compareTo(second) == 0) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

        //string substring
        String sentence = "Hey Guys!!";
        String name = sentence.substring(4,sentence.length());
        System.out.println(name);
    }
}
