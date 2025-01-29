package classes.personaggio;

import equip.equipaggiamento;
import utility.*;

public class Personaggio {
    protected String Nome;
    protected int puntiFeritaTotali = 0;
    protected int puntiFerita = 0;
    protected int manaPointTotali = 0;
    protected int manaPoint = 0;
    protected int attaccoTotale = 0;
    protected int attacco = 0;
    protected int difesaTotale = 0;
    protected int difesa = 0;
    protected int agilitàTotale = 0;
    protected int agilità = 0;
    protected int intelligenzaTotale = 0;
    protected int intelligenza = 0;
    protected boolean isDead = false;

    public void setPuntiFeritaMax(int puntiFerita) {
        Utility.belowEqualZero(puntiFerita);
        this.puntiFeritaTotali = puntiFerita;
    }

    public void setManaPointMax(int manaPoint) {
        Utility.belowZero(manaPoint);
        this.manaPointTotali = manaPoint;
    }

    public void setAttaccoMax(int attacco) {
        Utility.belowZero(attacco);
        this.attaccoTotale = attacco;
    }

    public void setDifesaMax(int difesa) {
        Utility.belowZero(difesa);
        this.difesaTotale = difesa;
    }

    public void setAgilitàMax(int agilità) {
        Utility.belowZero(agilità);
        this.agilitàTotale = agilità;
    }

    public void setPuntiFerita(int puntiFerita) {
        Utility.belowEqualZero(puntiFerita);
        this.puntiFerita = puntiFerita;
    }

    public void setManaPoint(int manaPoint) {
        Utility.belowZero(manaPoint);
        this.manaPoint = manaPoint;
    }

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

    public void subtractPuntiFerita(int i) {
        if (Utility.isDead(i, this.puntiFerita)) {
            this.isDead = true;
            this.puntiFerita = 0;
        } else {
            this.puntiFerita = puntiFerita - i;
        }
    }

    public void addPuntiFerita(int i) {
        if ((this.puntiFerita + i) > this.puntiFeritaTotali) {
            this.puntiFerita = this.puntiFeritaTotali;
        } else {
            this.puntiFerita += i;
        }
    }

    public void subtractManaPoint(int i) {
        if ((this.manaPoint - i) < 0) {
            this.manaPoint = 0;
        } else {
            this.manaPoint -= i;
        }
    }

    public void addManaPoin(int i) {
        if ((this.manaPoint + i) > this.manaPointTotali) {
            this.manaPoint = this.manaPointTotali;
        } else {
            this.manaPoint += i;
        }
    }

    public int getPuntiFeritaTotali() {
        return this.puntiFeritaTotali;
    }

    public int getaddManaPoinTotali() {
        return this.manaPointTotali;
    }

    public int getAttaccoTotale() {
        return this.attaccoTotale;
    }

    public int getDifesaTotale() {
        return this.difesaTotale;
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

    public int getAgilità() {
        return this.agilità;
    }

    public int getIntelligenza() {
        return this.intelligenza;
    }

    public void equip(equipaggiamento temp) {
        this.agilità += temp.getAgilità();
        this.agilitàTotale += temp.getAgilità();
        this.difesa += temp.getDifesa();
        this.difesaTotale += temp.getDifesa();
        this.attacco += temp.getAttacco();
        this.attaccoTotale += temp.getAttacco();
        this.puntiFerita += temp.getVita();
        this.puntiFeritaTotali += temp.getVita();
        this.manaPoint += temp.getMana();
        this.manaPointTotali += temp.getMana();
        this.intelligenza += temp.getIntelligenza();
        this.intelligenzaTotale += temp.getIntelligenza();
    }

    public void unequip(equipaggiamento temp) {
        this.agilità -= temp.getAgilità();
        this.agilitàTotale -= temp.getAgilità();
        this.difesa -= temp.getDifesa();
        this.difesaTotale -= temp.getDifesa();
        this.attacco -= temp.getAttacco();
        this.attaccoTotale -= temp.getAttacco();
        this.puntiFerita -= temp.getVita();
        this.puntiFeritaTotali -= temp.getVita();
        this.manaPoint -= temp.getMana();
        this.manaPointTotali -= temp.getMana();
        this.intelligenza -= temp.getIntelligenza();
        this.intelligenzaTotale -= temp.getIntelligenza();
    }

}
