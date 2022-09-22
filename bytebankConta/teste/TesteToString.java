package bytebankConta.teste;

import bytebankConta.modelo.ContaPoupanca;
import bytebankConta.modelo.ContaCorrente;

public class TesteToString extends Object{

    public static void main(String[] args) {
        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(33, 25); //é possível passar para o println qualquer tipo de referência, ou seja, sofre sobrecarga
        ContaPoupanca cp = new ContaPoupanca(32, 102);

        System.out.println(cc.toString());

    }
    static void println(Object conta) { //funciona com qualquer tipo de referência

    }

}
