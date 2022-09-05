package bytebankEncapsulado;

public class Conta {

    private double saldo; //são atributos (basicamente, características de um objeto)
    private int agencia;
    private int numero;
    private Cliente titular; //referência a classe cliente

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
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}



