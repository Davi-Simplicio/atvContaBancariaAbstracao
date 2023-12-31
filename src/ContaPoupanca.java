public class ContaPoupanca extends ContaBancaria{
    private double limite;

    public ContaPoupanca(int numeroDaConta, double saldo, double limite) {
        super(numeroDaConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor<=getSaldo()+limite){
            super.sacar(valor);
        }
    }

    @Override
    public String mostrarDados() {
        return toString();
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "limite=" + limite +
                "} " + super.toString();
    }
}
