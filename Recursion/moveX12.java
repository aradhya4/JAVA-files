// move all the x to the end of the string 
public class moveX12 {
    public static void moveAllX(String str,int index, int count, String newString) {
        //base condition
        if(index == str.length()) {
            for(int i=0;i < count; i++) {
                newString += 'x';          //x add ho gya count times yaani jitni baar count m add hua tha utni baar
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if(currChar == 'x') {
            count++;
            moveAllX(str, index+1, count, newString);
        }
        else{                                         //T.C --> O(n) where n is the str length
            newString += currChar;
            moveAllX(str, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abxxcxxd";
        moveAllX(str, 0, 0,"" );
    }
}
