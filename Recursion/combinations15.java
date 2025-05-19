//print all possible combinations for ex- 23 --> 2 pe def and 3 pe ghi so all possible combinations will be dg,dh,di,eg,eh etc..
//TC ---> O(4^n)
public class combinations15 {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str, int index, String combination) {
        if(index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length();i++) {
            printComb(str, index+1, combination+mapping.charAt(i));  //combination empty string hai jisme hmne mapping jisko upar declare kiya uska char add kr liya
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");
    }
}
