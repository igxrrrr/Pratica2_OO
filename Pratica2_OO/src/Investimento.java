import java.util.Scanner;

public class Investimento {
    private double investimentoInicial;
    private double taxaMensal;
    private int numeroMeses;

    public Investimento(double investimentoInicial, double taxaMensal, int numeroMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaMensal = taxaMensal;
        this.numeroMeses = numeroMeses;
    }

    public double calcularRendimento() {
        double rendimento = this.investimentoInicial * Math.pow(1 + this.taxaMensal/100, this.numeroMeses) - this.investimentoInicial;
        return rendimento;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o investimento inicial: ");
        double investimentoInicial = sc.nextDouble();

        System.out.print("Digite a taxa de rendimento ao mês: ");
        double taxaMensal = sc.nextDouble();

        System.out.print("Digite o número de meses: ");
        int numeroMeses = sc.nextInt();

        Investimento investimento = new Investimento(investimentoInicial, taxaMensal, numeroMeses);

        double rendimento = investimento.calcularRendimento();

        System.out.println("O rendimento do investimento será de R$" + String.format("%.2f", rendimento));
    }
}
