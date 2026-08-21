class ContaBancaria {
    private final String titular;
    public ContaBancaria(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }
}
public class Exemplo01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("\nObserve:");
        System.out.println("- titular recebeu o valor Maria no construtor.");
        System.out.println("- titular foi declarado como final.");
        System.out.println("- por isso, ele nao pode ser reatribuido.");
    }
}