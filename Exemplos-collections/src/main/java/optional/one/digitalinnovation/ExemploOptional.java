package optional.one.digitalinnovation;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {

        Optional<String> optString = Optional.of("Optional Presente");
        Optional<String> optString2 = Optional.ofNullable(null);
        Optional<String> optString3 = Optional.empty();

        optString.ifPresent(System.out::println);
        optString2.ifPresent(System.out::println);
        optString3.ifPresent(System.out::println);

        optString.orElseThrow(IllegalStateException::new);
        //optString2.orElseThrow(IllegalStateException::new);
        //optString3.orElseThrow(IllegalStateException::new);

        optString.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));
        optString2.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));
        optString3.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));

        optString.map((aux) -> aux.concat("*Alterado")).ifPresent(System.out::println);
        optString2.map((aux) -> aux.concat(":Alterado")).ifPresent(System.out::println);
        optString3.map((aux) -> aux.concat(":Alterado")).ifPresent(System.out::println);

        if (optString.isPresent()) {
            String valor = optString.get();
            System.out.println(valor);
        }

        if (optString2.isPresent()) {
            String valor = optString.get();
            System.out.println(valor);
        }

        if (optString3.isPresent()) {
            String valor = optString.get();
            System.out.println(valor);
        }

    }

}
