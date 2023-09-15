public abstract class ContaBancaria {
    int numeroDaConta;
    double saldo;

    public void sacar(double valor) {
        if (saldo > 0 && saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }
}
