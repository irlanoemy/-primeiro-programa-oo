// EXCEÇÃO CUSTOMIZADA: classe própria que estende RuntimeException (por isso é unchecked)
class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            // THROW + EXCEÇÃO UNCHECKED: o compilador não obriga tratar, mas nós tratamos mesmo assim
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}

public class Exemplo02 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.00);
        // TRY/CATCH: captura a exceção customizada
        try {
            conta.sacar(500.00);
        } catch (SaldoInsuficienteException excecao) {
            System.out.println("Erro: " + excecao.getMessage());
        }
        System.out.println("Saldo final: " + conta.saldo);
    }
}