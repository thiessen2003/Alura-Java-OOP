package pilha;

public class Fluxo {

    //o Stack do Java sempre começa pelo método main
    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
            metodo1();
        } catch(Exception ex) {
            String msg = ex.getMessage();
            System.out.println("Exception" + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() throws MinhaExcecao{
        System.out.println("Início do metodo1");
        metodo2(); //quebra no throw e sai do método 1
        System.out.println("Fim do metodo1");
    }
    public static void metodo2() throws MinhaExcecao{
        System.out.println("Início do metodo2");
        throw new MinhaExcecao("deu muito errado"); //sai do método 2 && throw só funciona com exceções
        //System.out.println("Fim do metodo 2");
    }


}
