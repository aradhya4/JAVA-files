//check if the array is sorted in strictly increasing manner ie. 1,3,5,7 etc
//                                                               1,3,3,5 this is wrong
// TC --> O(n)
public class sortArr11 {
    public static boolean checkArray(int arr[], int index) {
        if(index == arr.length-1) {        // index = 3, arr.length-1 =4-1 =3
            return true;                   // ye if wali base conditions hoti h 
        }
        if(arr[index] < arr[index+1]) {
            return checkArray(arr,index+1);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,11,9};
        System.out.println(checkArray(arr, 0));
    }
}
