class Pen {
    String name;
    String type;

    public void penInfo() {
        System.out.println(this.name);
        System.out.println(this.type);
    }
}

public class OOPS2 {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.name = "elkos";
        pen1.type = "ballpen";

        Pen pen2 = new Pen();
        pen2.name = "reynolds";
        pen2.type = "gelpen";

        pen1.penInfo();
        pen2.penInfo();
    }
}
