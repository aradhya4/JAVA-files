class bubbleSort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {3,8,1,9,0};

            //bubble sort --> Time Complexity = O(n^2)
            for(int i=0; i<arr.length-1;i++) {   //n-1 //sorting mai loop n-1 times chalate hai
                for(int j=0;j<arr.length-i-1;j++) { //n^2 // i can be 0,1,2... toh mtlb y element sorted h toh loop sorted elements mai nahi chlega 
                    if(arr[j] > arr[j+1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            printArray(arr);
        }
    }

    

   