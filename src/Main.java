import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Banco banco = new Banco();
    static ContaBancaria contaLogada;

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        do {
            System.out.println("""
                    [1]Criar conta
                    [2]Selecionar Conta
                    [3]Remover Conta
                    [4]Gerar Relatorio
                    [5]Finalizar""");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    selecionarConta();
                    break;
                case 3:
                    removerConta();
                    break;
                case 4:
                    gerarRelatorio();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }

    private static void gerarRelatorio() {
        System.out.println(banco.mostrarDados());
    }

    private static void removerConta() {
        System.out.println(banco.mostrarDados());
        System.out.println("Escolha a conta que você deseja");
        int opcao = sc.nextInt();
        banco.deletar(banco.procurarConta(opcao));
    }

    private static void selecionarConta() {
        System.out.println(banco.mostrarDados());
        System.out.println("Escolha a conta que você deseja");
        int opcao = sc.nextInt();
        if (banco.procurarConta(opcao) != null) {
            contaLogada = banco.procurarConta(opcao);
            menuInicial();
        }
    }

    private static void menuInicial() {
        int opcao = 0;
        do {
            System.out.println("""
                    [1]Depositar
                    [2]Sacar
                    [3]Transferir
                    [4]Gerar relatorio
                    [5]Sair""");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Qual valor deseja depositar?");
                    double valorDeposito = sc.nextDouble();
                    contaLogada.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Qual valor deseja depositar?");
                    double valorSaque = sc.nextDouble();
                    contaLogada.sacar(valorSaque);
                    break;
                case 3:
                    tranferir();
                    break;
                case 4:
                    contaLogada.mostrarDados();
                    break;
                case 5:
                    break;
            }
        } while (opcao != 5);
    }

    private static void tranferir() {
        System.out.println("Qual conta você deseja tranferir?");
        banco.mostrarDados();
        int opcao = sc.nextInt();
        System.out.println("Qual o valor da tranferencia");
        double valor = sc.nextDouble();
        contaLogada.transferir(valor, banco.procurarConta(opcao));
    }

    private static void criarConta() {
        int opcao;
        do {
            System.out.println("""
                    [1]Conta correte
                    [2]Conta poupança
                    [3]Sair
                    """);
            opcao = sc.nextInt();
            banco.criarConta(opcao);
        } while (opcao != 3);
    }

}


