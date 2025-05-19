//code is very much similar we just need to add hashset
import java.util.HashSet;
public class subsequence141 {
    public static void subsequence(String str, int index, String newString, HashSet<String> set) {
        if(index == str.length()) {         //base condition
            if(set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(index);

        // if the string to be added 
        subsequence(str, index+1, newString+currChar,set);

        //if the string not to be added
        subsequence(str, index+1, newString,set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subsequence("aaa", 0, "",set);      // now for aaa string every substring is unique
    }
}
