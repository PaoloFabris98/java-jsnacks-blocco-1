package classes.personaggio;

public class Personaggio {
    private int PF = 0;
    private int MP = 0;
    private int attacco = 0;
    private int difesa = 0;

    public Personaggio(int PF, int MP, int attacco, int difesa) {
        if (PF <= 0) {
            throw new IllegalArgumentException("I punti vita non possono essere inizializzati come 0.");
        }
        if (PF < 0) {
            throw new IllegalArgumentException("I mana point non possono essere inferiori a 0.");
        }
        if (attacco < 0) {
            throw new IllegalArgumentException("l'attacco non può essere inizializzato come 0");
        }
        if (difesa < 0) {
            throw new IllegalArgumentException("la difesa non può essere inizializzata come 0");
        }

        this.PF = PF;
        this.MP = MP;
        this.attacco = attacco;
        this.difesa = difesa;

    }
}
