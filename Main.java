// CLASSE base
class ContaBancaria {
    // ATRIBUTO + ENCAPSULAMENTO: protected permite acesso pelas subclasses, mas não é totalmente aberto
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Saldo: R$ " + saldo);
    }
}

// HERANÇA: ContaPoupanca herda atributo e método de ContaBancaria
class ContaPoupanca extends ContaBancaria {
}

// HERANÇA: ContaCorrente também herda de ContaBancaria
class ContaCorrente extends ContaBancaria {
    // SOBRESCRITA: reescreve depositar() para cobrar taxa antes de repassar pra classe pai
    @Override
    public void depositar(double valor) {
        super.depositar(valor - 1.00); // chama o método original da superclasse
        System.out.println("Foi descontada uma taxa de R$ 1,00.");
    }
}

public class Main {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca(); // CRIAÇÃO DE OBJETO
        poupanca.depositar(100.00);

        // POLIMORFISMO: mesmo tipo de chamada (depositar), comportamento diferente por causa da sobrescrita
        ContaCorrente corrente = new ContaCorrente(); // CRIAÇÃO DE OBJETO
        corrente.depositar(100.00);
    }
}
