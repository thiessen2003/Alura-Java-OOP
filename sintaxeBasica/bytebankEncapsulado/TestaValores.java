package sintaxeBasica.bytebankEncapsulado;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(123,1252);
        Conta conta2 = new Conta(1232,12533212);
        Conta conta3 = new Conta(12335,3212321);

        System.out.println(Conta.getTotal());

    }

}
