package classes.personaggio;

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
    protected boolean isDead = false;

    public void setPuntiFerita(int puntiFerita) {
        Utility.belowEqualZero(puntiFerita);
        this.puntiFerita = puntiFerita;
        this.puntiFeritaTotali = puntiFerita;
    }

    public void setMP(int manaPoint) {
        Utility.belowZero(manaPoint);
        this.manaPoint = manaPoint;
        this.manaPointTotali = manaPoint;
    }

    public void setAttacco(int attacco) {
        Utility.belowZero(attacco);
        this.attacco = attacco;
        this.attaccoTotale = attacco;
    }

    public void setDifesa(int difesa) {
        Utility.belowZero(difesa);
        this.difesa = difesa;
        this.difesaTotale = difesa;
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
