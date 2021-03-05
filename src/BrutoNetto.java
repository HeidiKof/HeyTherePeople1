public class BrutoNetto {
    public static void main(String[] args) {
        float x, tax, z, taxv;

        x = 1520;
        tax = -1;
        taxv = x/100*tax;
        z = x + taxv;
        int maxTax = 50;

        int tax_class = 1;
        if (tax_class == 1) {
            tax = 20;
        } else if (tax_class == 2) {
            tax = 16;
        } else if (tax_class == 3) {
            tax = 8;
        } else {
            tax = 0;
            System.out.println("Unbekannte Steuerklasse");
        }

        boolean maxTaxExceeded = taxv >= maxTax;


        System.out.println("Nettopreis = " +x);
        System.out.println("Steuer = " +taxv);
        if  (maxTaxExceeded == true){
            System.out.println("Der maximale Steuerbetrag wurde erreicht: " + taxv + " >= " + maxTax);
        }
        System.out.println("Bruttopreis = " +z);

        int schulnote = 4;
        if (schulnote == 1) {
            System.out.println("Sehr Gut");
    } else if (schulnote == 2) {
            System.out.println("Gut");
        } else if (schulnote == 3) {
            System.out.println("Befriedigend");
        } else if (schulnote == 4) {
            System.out.println("Genügend");
        } else if (schulnote == 5) {
            System.out.println("Nicht Genügend");
        } else {
            System.out.println("Unbekannt");
        }
        }
}
