package sintaxeBasica.introdutorio;

public class TestaCondicional2 {

    public static void main(String[] args) {

        System.out.println("testando condicionais");
        int idade = 20;
        // || é igual a OU e && é igual a E
        int quantidadePessoas = 3;
        boolean acompanhado = true;

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar");
            }

    }

}