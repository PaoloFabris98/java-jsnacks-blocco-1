
import classes.classi.mago;
import classes.personaggio.Personaggio;
import equip.equipaggiamento;
import equip.spada;

public class Main {
    public static void main(String[] args) {
        Personaggio test = new mago("test", 100, 100, 10, 10, 10);
        equipaggiamento test1 = new spada("Spada Lunga", 10, 0, 0, 0, 0);
        System.out.println(test.getAgilità());
        System.out.println(test.getMP());
        System.out.println(test.getPF());
        System.out.println(test.getAttacco());
        System.out.println(test.getDifesa());
        test.equip(test1);
        System.out.println(test.getAgilità());
        System.out.println(test.getMP());
        System.out.println(test.getPF());
        System.out.println(test.getAttacco());
        System.out.println(test.getDifesa());
        test.unequip(test1);
        System.out.println(test.getAgilità());
        System.out.println(test.getMP());
        System.out.println(test.getPF());
        System.out.println(test.getAttacco());
        System.out.println(test.getDifesa());
    }
}
