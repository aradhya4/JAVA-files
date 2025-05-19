class patterns {
    public static void main(String args[]) {
        //solid rectangle
        // * * * * * * * * * *
        // * * * * * * * * * *
        // * * * * * * * * * *
        // * * * * * * * * * *
        int n=4;
        int m=10;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
