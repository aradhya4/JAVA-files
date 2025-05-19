// first and last occurance of a char 'a' = "abgeacgab"
class firstlast9 {
    public static int first = -1;
    public static int last = -1;

    public static void printOccurance(String str, int index ,char element) {
        if(index == str.length()) {                     //length starts from 1 
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(index);
        if(currentChar == element) {
            if(first == -1) {
                first = index;
            }
            else {
                last = index;
            }
        }
        printOccurance(str, index+1, element);
    }
    public static void main(String[] args) {
        printOccurance("aabgeacgab", 0, 'a');
    }

}