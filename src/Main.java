
import classes.classi.mago;
import classes.personaggio.Personaggio;
import equip.bastone;
import equip.equipaggiamento;
import equip.spada;

public class Main {
    public static void main(String[] args) {
        Personaggio test = new mago("test", 100, 100, 10, 10, 10, 100);
        equipaggiamento test1 = new spada("Spada Lunga", 10, 0, 0, 0, 0, 0);
        equipaggiamento test2 = new bastone("Bastone di legno", 0, 0, 0, 0, 0, 100);
        System.out.println("agilità " + test.getAgilità());
        System.out.println("mana " + test.getMP());
        System.out.println("vita " + test.getPF());
        System.out.println("attacco " + test.getAttacco());
        System.out.println("difesa " + test.getDifesa());
        System.out.println("intelligenza " + test.getIntelligenza());
        test.equip(test2);
        System.out.println("agilità " + test.getAgilità());
        System.out.println("mana " + test.getMP());
        System.out.println("vita " + test.getPF());
        System.out.println("attacco " + test.getAttacco());
        System.out.println("difesa " + test.getDifesa());
        System.out.println("intelligenza " + test.getIntelligenza());
        test.unequip(test2);
        System.out.println("agilità " + test.getAgilità());
        System.out.println("mana " + test.getMP());
        System.out.println("vita " + test.getPF());
        System.out.println("attacco " + test.getAttacco());
        System.out.println("difesa " + test.getDifesa());
        System.out.println("intelligenza " + test.getIntelligenza());
    }
}
