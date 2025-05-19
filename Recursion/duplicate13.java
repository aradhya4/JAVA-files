// remove duplicate characters from a string 
// TC --> O(n)
public class duplicate13 {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int index, String newString ) {
        //base condition 
        if(index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if( map[currChar - 'a'] == true) {             // 'a'-'a'= 0 , 'b'-'a'=1 , 'c'-'a'=2 ==true mtlb y phle bhi aa chuka h in the string
            removeDuplicate(str, index+1, newString);
        }
        else{
            newString += currChar;
            map[currChar - 'a'] = true;               //yaani abhi y phli baar aaya isiliye hmne isse true kar diya 
            removeDuplicate(str, index+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "aabcgge";
        removeDuplicate(str, 0, "");
    }
}
