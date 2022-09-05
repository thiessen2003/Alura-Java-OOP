package polimorfismo.bytebankHerdado;

public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("321321343");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());

        boolean autenticou = g1.autentica(2222);
    }

}
