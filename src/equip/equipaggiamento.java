package equip;

import utility.Utility;

public class equipaggiamento {
    String nome;
    int attacco = 0;
    int difesa = 0;
    int agilità = 0;
    int vita = 0;
    int mana = 0;

    public void setAttacco(int attacco) {
        Utility.belowZero(attacco);
        this.attacco = attacco;
    }

    public void setDifesa(int difesa) {
        Utility.belowZero(difesa);
        this.difesa = difesa;
    }

    public void setAgilità(int agilità) {
        Utility.belowZero(agilità);
        this.agilità = agilità;
    }

    public void setMana(int mana) {
        Utility.belowZero(mana);
        this.mana = mana;
    }

    public void setVita(int vita) {
        Utility.belowZero(vita);
        this.vita = vita;
    }

    public int getAttacco() {
        return this.attacco;
    }

    public int getDifesa() {
        return this.difesa;
    }

    public int getAgilità() {
        return this.difesa;
    }

    public int getMana() {
        return this.difesa;
    }

    public int getVita() {
        return this.difesa;
    }

}
