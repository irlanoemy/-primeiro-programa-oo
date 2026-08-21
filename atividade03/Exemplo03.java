final class ContaPoupanca {
    protected double saldo;
    public void depositar(double valor) {
        saldo += valor;
    }
}
public class Exemplo03 {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(50.00);
        System.out.println("Deposito realizado.");
        System.out.println("Saldo: R$ " + conta.saldo);
        System.out.println("\nObserve:");
        System.out.println("- ContaPoupanca e uma classe final.");
        System.out.println("- Podemos criar objetos dela normalmente.");
        System.out.println("- Mas nenhuma classe pode herdar dela.");
    }
}