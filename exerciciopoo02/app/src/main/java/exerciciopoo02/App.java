package exerciciopoo02;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        contaCorrente Ccorrente = new contaCorrente(1200.00, 023, "matheus silva");
        Scanner teclado = new Scanner(System.in);

        char opsaque;
        char opdeposito;
        char opalterarnome;

        System.out.print("deseja alterar o nome: ");
        opalterarnome = teclado.next().charAt(0);

        if (opalterarnome == 's' || opalterarnome == 'S') {
            System.out.print("informe o novo nome: ");
            Ccorrente.alterarnome(teclado.next());
            
            System.out.println("nome alterado para: " + Ccorrente.getNometitular());
        }

        System.out.print("deseja realizar deposito: ");
        opdeposito = teclado.next().charAt(0);

        if (opdeposito == 's' || opdeposito == 'S') {
            System.out.print("informe o valor para deposito: ");
            Ccorrente.deposito(teclado.nextDouble());
        }

        System.out.println("seu saldo ficou: " + Ccorrente.getSaldo());

        System.out.print("deseja realizar saque: ");
        opsaque = teclado.next().charAt(0);

        if (opsaque == 's' || opsaque == 'S') {
            System.out.print("informe o valor para saque: ");
            Ccorrente.saque(teclado.nextDouble());
        }

        System.out.println("seu saldo ficou: " + Ccorrente.getSaldo());

    }
}
