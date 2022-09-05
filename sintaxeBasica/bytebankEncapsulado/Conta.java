package sintaxeBasica.bytebankEncapsulado;

public class Conta {

    private double saldo; //são atributos (basicamente, características de um objeto)
    private int agencia;
    private int numero;
    private Cliente titular; //referência a classe cliente
    private static int total;


    public Conta(int agencia, int numero) { //construtor no momento de criação da classe
        Conta.total++;
        System.out.println("o total de contas é "+Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta");
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("não pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }
    public Cliente getTitular() {
        return titular;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }
    public static int getTotal() {
        return Conta.total;
    }
}



