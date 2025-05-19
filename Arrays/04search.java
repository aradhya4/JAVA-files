import java.util.*;
class searchElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();          //size input by user
        System.out.print("Enter the elements:");
        int num[] = new int[size];        //array name is num
        
        for(int i=0;i<size;i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be found: ");
        int x = sc.nextInt();

        for (int i=0;i<size;i++) {
            if(num[i] == x) {
                System.out.println("Element found at index:"+i);
            }
        }
        sc.close();
    }
}
