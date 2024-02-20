public class App {
    public static void main(String[] args) throws Exception {

        Weapon weapon = new Weapon();
        System.out.println();
        System.out.println("WEAPON CLASS / WEAPON DEFAULT CONSTRUCTOR");
        System.out.println(weapon + "\n");

        Weapon ranged = new Ranged();
        System.out.println("WEAPON CLASS / RANGED DEFAULT CONSTRUCTOR");
        System.out.println(ranged + "\n");

        Ranged rock = new Ranged("ROCK", 1, 10);
        System.out.println("RANGED CLASS / RANGED CONSTRUCTOR WITH PARAMETERS");
        System.out.println(rock + "\n");

        Bow bow = new Bow();
        System.out.println("BOW CLASS / BOW DEFAULT CONSTRUCTOR");
        System.out.println(bow + "\n");

        Ranged ashBow = new Bow("ASH BOW", 25, 50, 2);
        System.out.println("RANGED CLASS / BOW CONSTRUCTOR WITH PARAMETERS");
        System.out.println(ashBow + "\n");

        Weapon boom = new Boomerang();
        System.out.println("WEAPON CLASS / BOOMERANG DEFAULT CONSTRUCTOR");
        System.out.println(boom + "\n");

        Boomerang bigBoom = new Boomerang("BIG BOOMERANG", 20, 15, 3);
        System.out.println("BOOMERANG CLASS / BOOMERANG CONSTRUCTOR WITH PARAMETERS");
        System.out.println(bigBoom + "\n");



        
        
    }
}
