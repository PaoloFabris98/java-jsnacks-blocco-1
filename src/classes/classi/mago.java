package classes.classi;

import utility.*;
import classes.personaggio.*;

public class mago extends Personaggio {
    public mago(String nome, int puntiFerita, int manaPoint, int attacco, int difesa, int agilità, int intelligenza) {

        Utility.belowEqualZero(puntiFerita);
        Utility.belowZero(manaPoint);
        Utility.belowZero(attacco);
        Utility.belowZero(difesa);
        Utility.belowZero(agilità);
        Utility.belowZero(intelligenza);
        this.puntiFeritaTotali = puntiFerita;
        this.puntiFerita = puntiFerita;
        this.manaPointTotali = manaPoint;
        this.manaPoint = manaPoint;
        this.attaccoTotale = attacco;
        this.attacco = attacco;
        this.difesaTotale = difesa;
        this.difesa = difesa;
        this.agilitàTotale = agilità;
        this.agilità = agilità;
        this.intelligenzaTotale = intelligenza;
        this.intelligenza = intelligenza;

    }

}
