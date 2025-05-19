// very important ques for interview and placement
// TC --> O(n)
//subsequence --> string which have choice that they want to be in a string or not but the sequence should be the same 
public class subsequence14 {
    public static void subsequence(String str, int index, String newString) {
        if(index == str.length()) {         //base condition
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);

        // if the string to be added 
        subsequence(str, index+1, newString+currChar);

        //if the string not to be added
        subsequence(str, index+1, newString);
    }
    public static void main(String[] args) {
        subsequence("aaa", 0, "");      // for aaa string - the o/p is repeated so if we want unique subsequence then 
//                                                                                    we will see next program
    }
}
