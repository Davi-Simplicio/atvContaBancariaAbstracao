public class Main {
    static ContaPoupanca contaPoupanca = new ContaPoupanca();
    static ContaCorrente contaCorrente = new ContaCorrente();
    static Relatorio relatorio = new Relatorio();

    public static void main(String[] args) {
        contaCorrente.depositar(100);
        contaCorrente.sacar(50);
        contaPoupanca.depositar(1000);
        contaPoupanca.setLimite(100);
        contaPoupanca.sacar(1100);
        System.out.println(relatorio.gerarRelatorio(contaCorrente));
        System.out.println(relatorio.gerarRelatorio(contaPoupanca));
    }
}
