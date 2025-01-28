package classes.personaggio;

import utility.*;

public class Personaggio {
    private int puntiFerita = 0;
    private int manaPoint = 0;
    private int attacco = 0;
    private int difesa = 0;

    public Personaggio(int puntiFerita, int manaPoint, int attacco, int difesa) {

        Utility.pfCheck(puntiFerita);
        Utility.mpCheck(manaPoint);
        Utility.attaccoCheck(attacco);
        Utility.difesaCheck(difesa);
        this.puntiFerita = puntiFerita;
        this.manaPoint = manaPoint;
        this.attacco = attacco;
        this.difesa = difesa;

    }

    public void setPF(int puntiFerita) {
        Utility.pfCheck(puntiFerita);
        this.puntiFerita = puntiFerita;
    }

    public void setMP(int manaPoint) {
        Utility.mpCheck(manaPoint);
        this.manaPoint = manaPoint;
    }

    public void setAttacco(int attacco) {
        Utility.attaccoCheck(attacco);
        this.attacco = attacco;
    }

    public void setDifesa(int difesa) {
        Utility.difesaCheck(difesa);
        this.difesa = difesa;
    }

    public int getPF() {
        return this.puntiFerita;
    }

    public int getMP() {
        return this.manaPoint;
    }

    public int getAttacco() {
        return this.attacco;
    }

    public int getDifesa() {
        return this.difesa;
    }

}
