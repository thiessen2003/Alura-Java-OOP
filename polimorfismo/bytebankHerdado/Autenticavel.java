package polimorfismo.bytebankHerdado;

//classes abstratas não são obrigadas de implementar métodos abstratos
//é uma classe abstrata com todos os métodos abstratos
//é um contrato que define obrigações
//também, é uma forma de conseguir polimorfismo sem herança
public abstract interface Autenticavel{

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
