package equip;

import utility.Utility;

public class bastone extends equipaggiamento {
    public bastone(String nome, int attacco, int difesa, int agilità, int vita, int mana, int intelligenza) {
        Utility.belowZero(agilità);
        Utility.belowZero(difesa);
        Utility.belowZero(attacco);
        Utility.belowZero(vita);
        Utility.belowZero(mana);
        Utility.belowZero(intelligenza);

        this.agilità = agilità;
        this.attacco = attacco;
        this.difesa = difesa;
        this.vita = vita;
        this.mana = mana;
        this.intelligenza = intelligenza;
    }
}
