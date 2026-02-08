public class fourth {
    public void  fourth() {
        int age = 18;
        if (age >= 18) System.out.println("eligible for voting");
    }
    public void voter() {
        int age1 = 17;
        if (age1 >= 18) System.out.println("eligible for voting");
        else System.out.println(" this is method voter = Not eligible for voting");
    }
    public static void main(String[] args) {
        fourth f = new fourth();
        f.fourth();
        f.voter();
    }

}

