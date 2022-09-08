//excecoes do tipo checked também são aceitas pelo código caso sejam tratadas por meio do try e catch
//checked te obriga a tomar uma atitude

package pilha;

public class FluxoComError {

    //o Stack do Java sempre começa pelo método main
    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String msg = ex.getMessage();
            System.out.println("Exception" + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() throws MinhaExcecao{
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    public static void metodo2() throws MinhaExcecao{
        System.out.println("Início do metodo2");
        throw new MinhaExcecao("deu muito errado");
        }
        //System.out.println("Fim do metodo 2");
    }


}
