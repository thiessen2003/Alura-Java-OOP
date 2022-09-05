package bytebank;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(300);
        System.out.println(minhaConta.saldo);
        minhaConta.saca(20);
        System.out.println(minhaConta.saldo);

        Conta outraConta = new Conta();
        outraConta.deposita(1500);

        outraConta.transfere(200, minhaConta);
    }

}
