package sintaxeBasica.bytebankEncapsulado;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(123, 3231);
        conta.setNumero(10);
        System.out.println(conta.getNumero());

        Cliente gabriel = new Cliente();

        gabriel.setNome("Gabriel Thiessen");

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

    }

}
