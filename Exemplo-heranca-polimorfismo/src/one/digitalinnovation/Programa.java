package one.digitalinnovation;

public class Programa {

    public static void main(String[] args) {

        Gerente ger = new Gerente("Nestor", 7500.71);
        Supervisor sup = new Supervisor("Geraldo", 4897.71);
        Atendente atd = new Atendente("Jessica", 2189.28);

        System.out.println("Imposto pago pelo gerente " + ger.getNome() + "foi de: R$" + ger.calculaImposto());
        System.out.println("Imposto pago pelo gerente " + sup.getNome() + "foi de: R$" + sup.calculaImposto());
        System.out.println("Imposto pago pelo gerente " + atd.getNome() + "foi de: R$" + atd.calculaImposto());
    }
}
