package polimorfismo.bytebankHerdado;

public class TesteSistema {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2323);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
    }

}
