package classes.personaggio;

import utility.*;

public class Personaggio {
    private int PF = 0;
    private int MP = 0;
    private int attacco = 0;
    private int difesa = 0;

    public Personaggio(int PF, int MP, int attacco, int difesa) {

        Utility.pfCheck(PF);
        Utility.mpCheck(MP);
        Utility.attaccoCheck(attacco);
        Utility.difesaCheck(difesa);
        this.PF = PF;
        this.MP = MP;
        this.attacco = attacco;
        this.difesa = difesa;

    }

    public void setPF(int pf) {
        Utility.pfCheck(pf);
        this.PF = pf;
    }

    public void setMP(int mp) {
        Utility.mpCheck(mp);
        this.MP = mp;
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
        return this.PF;
    }

    public int getMP() {
        return this.MP;
    }

    public int getAttacco() {
        return this.attacco;
    }

    public int getDifesa() {
        return this.difesa;
    }

}
