package Entidades;

public class Cartao {

    private String numConta;
    private String nome;
    private Double saldoConta;

    public Cartao(String numConta, String nome, Double saldoConta) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldoConta = saldoConta;
    }
    public String getNumConta() { return numConta; }
    public void setNumConta(String numConta) { this.numConta = numConta; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Double getSaldoConta() { return saldoConta; }
    public void setSaldoConta(Double saldoConta) { this.saldoConta = saldoConta; }

    public void depositar(Double deposito) {
        saldoConta += deposito;
        System.out.println("O atual valor é conta é de " + saldoConta);
    }
    public void sacar(double valorSaque) {
        double novoSaldo = saldoConta - valorSaque;
        if ( valorSaque > saldoConta) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldoConta -= valorSaque;
            System.out.println("Operação de saque realizada " +
                    "com sucesso. O novo valor em conta é de " + this.saldoConta);
        }
    }
    public void imprimirSaldo() {
        System.out.println("O saldo em conta é de " + this.saldoConta);
    }
}
