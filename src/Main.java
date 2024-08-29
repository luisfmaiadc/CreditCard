import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Limite do cartão de crédito:");
        int limiteCartao = scanner.nextInt();
        CreditCard card = new CreditCard(limiteCartao);

        int sair = 0;
        while (sair != 1) {

            System.out.println("Digite a descrição da compra:");
            String descricao = scanner.next();
            System.out.println("Digite o valor da compra:");
            int valor = scanner.nextInt();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = card.fazCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Seu limite atual é de: " + card.getSaldo());
                System.out.println("Digite 1 para sair e 0 para realizar uma nova compra.");
                sair = scanner.nextInt();
            } else {
                System.out.println("Limite insuficiente. Seu limite atual é de: " + card.getSaldo());
                System.out.println("Caso deseja realizar uma nova compra digite 0, caso contrário digite 1 para sair.");
                sair = scanner.nextInt();
            }
        }

        Collections.sort(card.getCompraList());
        System.out.println("Sua lista de compras:");
        //ForEach com Sintaxe do Method Reference
        card.getCompraList().forEach(System.out::println);
    }
}