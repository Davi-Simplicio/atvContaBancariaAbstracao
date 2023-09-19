import java.util.ArrayList;

public class Banco implements IImprimivel{
    ArrayList<ContaBancaria>contasBancarias= new ArrayList<>();

    public void inserir(ContaBancaria contaBancaria){
        contasBancarias.add(contaBancaria);
    }
    public void deletar(ContaBancaria contaBancaria){
        contasBancarias.remove(contaBancaria);
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
}
