public class Main {
    public static void main(String[] args) {

        Mage mage1 = new Mage("w", 10, 10, "ice");
        Mage mage2 = new Mage("kolya", 3, 5, "ice");
        System.out.println(mage1.getInfo());
        System.out.println(mage2.getInfo());
        System.out.println(mage1.fight(mage2));
    }
}
