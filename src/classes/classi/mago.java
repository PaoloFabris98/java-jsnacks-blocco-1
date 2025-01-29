package classes.classi;

import utility.*;

public class mago extends classes.personaggio.Personaggio {
    public mago(String nome, int puntiFerita, int manaPoint, int attacco, int difesa) {

        Utility.belowEqualZero(puntiFerita);
        Utility.belowZero(manaPoint);
        Utility.belowZero(attacco);
        Utility.belowZero(difesa);
        this.puntiFeritaTotali = puntiFerita;
        this.puntiFerita = puntiFerita;
        this.manaPointTotali = manaPoint;
        this.manaPoint = manaPoint;
        this.attaccoTotale = attacco;
        this.attacco = attacco;
        this.difesaTotale = difesa;
        this.difesa = difesa;

    }

}
