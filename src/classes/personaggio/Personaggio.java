package classes.personaggio;

public class Personaggio {
    private int PF = 0;
    private int MP = 0;
    private int attacco = 0;
    private int difesa = 0;

    public Personaggio(int PF, int MP, int attacco, int difesa) {
        pfCheck(PF);
        mpCheck(MP);
        attaccoCheck(attacco);
        difesaCheck(difesa);

        this.PF = PF;
        this.MP = MP;
        this.attacco = attacco;
        this.difesa = difesa;

    }

    private void pfCheck(int PF) {
        if (PF <= 0) {
            throw new IllegalArgumentException("I punti vita non possono essere inizializzati come 0.");
        }
    }

    private void mpCheck(int MP) {
        if (MP < 0) {
            throw new IllegalArgumentException("I mana point non possono essere inferiori a 0.");
        }
    }

    private void attaccoCheck(int attacco) {
        if (attacco < 0) {
            throw new IllegalArgumentException("l'attacco non può essere inizializzato come 0");
        }
    }

    private void difesaCheck(int difesa) {
        if (difesa < 0) {
            throw new IllegalArgumentException("la difesa non può essere inizializzata come 0");
        }
    }

    public void setPF(int pf) {
        pfCheck(pf);
        this.PF = pf;
    }

    public void setMP(int mp) {
        mpCheck(mp);
        this.MP = mp;
    }

    public void setAttacco(int attacco) {
        attaccoCheck(attacco);
        this.attacco = attacco;
    }

    public void setDifesa(int difesa) {
        difesaCheck(difesa);
        this.difesa = difesa;
    }

}
