public class Q_24to26 {
    private int value;


    public Q_24to26() {
        System.out.println("This is a 0-arguments constructor.");
    }

    // Parameterized constructor
    public Q_24to26(int val) {
        value = val;
        System.out.println("Parameterized constructor called with value: " + val);
    }

    // Another parameterized constructor
    public Q_24to26(int val1, int val2) {
        value = val1 + val2;
        System.out.println("Parameterized constructor called with values: " + val1 + ", " + val2);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
       Q_24to26 obj1 = new Q_24to26();
       Q_24to26 obj2 = new Q_24to26(10);
       Q_24to26 obj3 = new Q_24to26(5, 7);
    }
}

