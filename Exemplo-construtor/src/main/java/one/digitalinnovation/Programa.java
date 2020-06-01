package one.digitalinnovation;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Carro carro = new Carro("Ford", "Fiesta", 2003);

        System.out.println("O carro tem variante? Se sim, informe qual. Se não, digite não");
        carro.setVariante(leitura.next());

        if (!carro.getVariante().equals("não")) {
            System.out.println("O carro criado é da marca " + carro.getMarca() + " modelo " + carro.getModelo() +
                    " ano " + carro.getAno() + " e variante " + carro.getVariante());
        }
        else{
            System.out.println("O carro criado é da marca " + carro.getMarca() + " modelo " + carro.getModelo() +
                    " ano " + carro.getAno());
        }
    }
}
