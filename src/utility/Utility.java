package utility;

public class Utility {
    public static void pfCheck(int PF) {
        if (PF <= 0) {
            throw new IllegalArgumentException("I punti vita non possono essere inizializzati come 0.");
        }
    }

    public static void mpCheck(int MP) {
        if (MP < 0) {
            throw new IllegalArgumentException("I mana point non possono essere inferiori a 0.");
        }
    }

    public static void attaccoCheck(int attacco) {
        if (attacco < 0) {
            throw new IllegalArgumentException("l'attacco non può essere inizializzato come 0");
        }
    }

    public static void difesaCheck(int difesa) {
        if (difesa < 0) {
            throw new IllegalArgumentException("la difesa non può essere inizializzata come 0");
        }
    }
}
