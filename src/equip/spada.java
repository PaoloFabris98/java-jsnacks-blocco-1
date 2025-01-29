package equip;

import utility.*;

public class spada extends equipaggiamento {
    public spada(String nome, int attacco, int difesa, int agilità, int vita, int mana) {
        Utility.belowZero(agilità);
        Utility.belowZero(difesa);
        Utility.belowZero(attacco);
        Utility.belowZero(vita);
        Utility.belowZero(mana);
        this.agilità = agilità;
        this.attacco = attacco;
        this.difesa = difesa;
        this.vita = vita;
        this.mana = mana;
    }

}
