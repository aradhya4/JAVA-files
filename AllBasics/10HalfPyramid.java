class pyramid {
    public static void main(String args[]) {
    //      *
    //      **
    //      ***
    //      ****
    //      *****
        int n=5;
        for(int i=1; i<=n;i++) {                   // i= 1 to n
            for(int j=1;j<=i;j++) {                // j= 1 to i
                System.out.print("*");
            }
            System.out.println();
        }
    }
}