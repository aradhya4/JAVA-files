class arrays {
    public static void main(String args[]){
        int marks[] = new int[3];
        marks[0] = 99;
        marks[1] = 90;
        marks[2] = 95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);   

        System.out.println("Same marks using for loop:");
        // for ex we have 100 marks like this then we will use loop
        for(int i=0;i<3;i++) {
            System.out.println(marks[i]);
        }
    }
}