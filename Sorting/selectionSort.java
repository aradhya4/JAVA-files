class selectionSort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {7,2,9,1,6};

            //bubble sort --> Time Complexity = O(n^2)
            for(int i=0; i<arr.length-1;i++) {   //n-1 //sorting mai loop n-1 times chalate hai
                int smallest = i;                //smallest is the index jispe hai hum
                for(int j=i+1;j<arr.length;j++) {   // ek element ke baad agla element is j
                    if(arr[smallest] > arr[j]) {    
                        smallest = j;            //j main smallest assign 
                    }
                }
                //swap
                int temp = arr[smallest];      
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
            printArray(arr);
        }
    }