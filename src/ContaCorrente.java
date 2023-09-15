public class ContaCorrente extends ContaBancaria implements IImprimivel{
    double taxaDeOperacao=0.002;

    @Override
    public void sacar(double valor) {
        super.sacar(valor+(valor*taxaDeOperacao));
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor-(valor*taxaDeOperacao));
    }

    @Override
    public String mostrarDados() {
        return
    }
}
