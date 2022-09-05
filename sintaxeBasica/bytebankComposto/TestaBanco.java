package sintaxeBasica.bytebankComposto;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.nome = "Gabriel Thiessen";
        gabriel.cpf = "000000000";
        gabriel.profissao = "Gestor de Comunidades";

        Conta contaDoGabriel = new Conta();
        contaDoGabriel.deposita(100);

        contaDoGabriel.titular = gabriel;
        System.out.println(contaDoGabriel.titular.nome);

    }
}
