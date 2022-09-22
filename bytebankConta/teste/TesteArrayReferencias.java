package bytebankConta.teste;

import bytebankConta.modelo.Conta;
import bytebankConta.modelo.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        ContaCorrente cc2 = new ContaCorrente(53, 12);

        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());

        ContaCorrente ref = contas [1];
    }

}
