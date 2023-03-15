public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    // Construtor sem parâmetros
    public Estoque() {}

    // Construtor com parâmetros
    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    // Método para dar baixa no estoque
    public void darBaixa(int qtde) {
        if (this.qtdAtual >= qtde) {
            this.qtdAtual -= qtde;
        } else {
            System.out.println("Erro: quantidade a ser retirada é maior que a quantidade atual!");
        }
    }

    // Método para mostrar informações do estoque
    public String mostra() {
        return "Nome: " + this.nome + " / Quantidade atual: " + this.qtdAtual + " / Quantidade mínima: " + this.qtdMinima;
    }

    // Método para verificar se é necessário repor o estoque
    public boolean precisaRepor() {
        return this.qtdAtual <= this.qtdMinima;
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Cria um novo objeto Estoque
        Estoque estoque = new Estoque("Caneta", 10, 5);

        // Testa os métodos da classe
        System.out.println("Antes da movimentação do estoque: ");
        System.out.println(estoque.mostra());
        System.out.println("Precisa repor: " + estoque.precisaRepor());

        // Realiza uma movimentação no estoque
        estoque.darBaixa(5);

        // Testa novamente os métodos da classe após a movimentação
        System.out.println("\nDepois da movimentação do estoque: ");
        System.out.println(estoque.mostra());
        System.out.println("Precisa repor: " + estoque.precisaRepor());
    }
}

