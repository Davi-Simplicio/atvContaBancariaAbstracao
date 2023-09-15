public class ContaPoupanca extends ContaBancaria implements IImprimivel{
    double limite;

    @Override
    public void sacar(double valor) {
        if (valor<=saldo+limite){
            super.sacar(valor);
        }
    }

    @Override
    public String mostrarDados() {
        return toString();
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "limite=" + limite +
                "} " + super.toString();
    }
}
