package bytebankHerdadoConta;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(132, 341);

        conta.deposita(200.0);

        try {
            conta.saca(190.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getSaldo());

    }

}
