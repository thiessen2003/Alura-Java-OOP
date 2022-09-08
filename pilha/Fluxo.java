package pilha;

public class Fluxo {

    //o Stack do Java sempre começa pelo método main
    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
            metodo1();
        } catch(ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Início do metodo1");
        try {
            metodo2();
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }

        System.out.println("Fim do metodo1");
    }
    public static void metodo2() {
        System.out.println("Início do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
                int a = i/0;
        }
        System.out.println("Fim do metodo 2");
    }


}
