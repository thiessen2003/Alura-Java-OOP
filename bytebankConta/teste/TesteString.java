package bytebankConta.teste;

public class TesteString {

    public static void main(String[] args) {

        //=====================================================================
        String nome = "Alura"; //strings são imutáveis

        String outra = nome.replace("A", "a");

        char c = 'A'; //char sempre recebe um único caractere com aspas simples
        //=====================================================================
        char d = nome.charAt(0);

        int pos = nome.indexOf("ur");

        String vazio = " ";

        String outroVazio = vazio.trim();

        String sub = nome.substring(1); //devolve um string a partir da posição estipulada

        outra = outra.concat("em");
        //=========================================================================================
        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto = builder.toString();
        System.out.println(texto);

        //=========================================================================================
        System.out.println(vazio.contains("Alu"));
        System.out.println(outroVazio.isEmpty());
        System.out.println(nome.length());
        System.out.println(pos);
        System.out.println(d);
        System.out.println(nome);
        System.out.println(outra);
    }

}
