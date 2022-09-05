package bytebankComposto;

public class Conta {

    private double saldo; //são atributos (basicamente, características de um objeto)
    int agencia;
    int numero;
    Cliente titular; //referência a classe cliente

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
    public double pegaSaldo() {
        return this.saldo;
    }
}

