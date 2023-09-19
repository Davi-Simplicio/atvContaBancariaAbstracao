public class ContaCorrente extends ContaBancaria{
    private double taxaDeOperacao = 0.002;

    @Override
    public void sacar(double valor) {
        super.sacar(valor + (valor * taxaDeOperacao));
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - (valor * taxaDeOperacao));
    }

    @Override
    public String mostrarDados() {
        return toString();
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "taxaDeOperacao=" + taxaDeOperacao +
                "} " + super.toString();
    }
}


