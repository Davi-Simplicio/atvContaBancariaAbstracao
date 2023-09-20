public abstract class ContaBancaria implements IImprimivel{
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void sacar(double valor) {
            this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, ContaBancaria destinatario){
        this.sacar(valor);
        destinatario.depositar(valor);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }
}
