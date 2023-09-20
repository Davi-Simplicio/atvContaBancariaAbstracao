import java.util.ArrayList;

public class Banco implements IImprimivel{
    ArrayList<ContaBancaria>contasBancarias= new ArrayList<>();

    public void inserir(ContaBancaria contaBancaria){
        contasBancarias.add(contaBancaria);
    }
    public void deletar(ContaBancaria contaBancaria){
        contasBancarias.remove(contaBancaria);
        for (ContaBancaria contaBancariaE:contasBancarias) {
            if (contaBancariaE.getNumeroDaConta()!=0){
                contaBancariaE.setNumeroDaConta(contaBancariaE.getNumeroDaConta()-1);
            }
        }
    }
    public ContaBancaria procurarConta(int id){
        return contasBancarias.get(id);
    }

    @Override
    public String mostrarDados() {
        String relatorioGeral = "";
        Relatorio relatorio = new Relatorio();
        for (ContaBancaria contaBancariaE:contasBancarias) {
            relatorioGeral = relatorio.gerarRelatorio(contaBancariaE)+"\n";
        }
        return relatorioGeral;
    }

    public void criarConta(int opcao) {
        switch (opcao){
            case 1:
                ContaCorrente contaCorrente = new ContaCorrente(contasBancarias.size(),0,0.002);
                this.inserir(contaCorrente);
                break;
            case 2:
                ContaPoupanca contaPoupanca = new ContaPoupanca(contasBancarias.size(),0, 100);
                this.inserir(contaPoupanca);
                break;
            case 3:
                break;
        }

    }
}
