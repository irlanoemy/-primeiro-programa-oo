sealed class ContaBancaria
        permits ContaCorrente, ContaPoupanca, ContaEmpresarial {
    protected double saldo;
}
// CAMINHO 1: final (encerra a ramificacao)
final class ContaCorrente extends ContaBancaria {
}
// CAMINHO 2: non-sealed (reabre a heranca)
non-sealed class ContaPoupanca extends ContaBancaria {
}
class ContaPoupancaPremium extends ContaPoupanca {
}
// CAMINHO 3: sealed (continua controlando)
sealed class ContaEmpresarial extends ContaBancaria
        permits ContaEmpresarialPequena {
}
final class ContaEmpresarialPequena extends ContaEmpresarial {
}
public class Exemplo04 {
    public static void main(String[] args) {
        ContaPoupancaPremium conta = new ContaPoupancaPremium();
        System.out.println("Conta poupanca premium criada.\n");
        System.out.println("Observe a hierarquia que voce criou:\n");
        System.out.println("ContaBancaria (sealed)");
        System.out.println(" |");
        System.out.println(" +-- ContaCorrente (final)");
        System.out.println(" |     -> a heranca termina aqui");
        System.out.println(" |");
        System.out.println(" +-- ContaPoupanca (non-sealed)");
        System.out.println(" |     -> a heranca foi reaberta");
        System.out.println(" |     -> ContaPoupancaPremium pode herdar dela");
        System.out.println(" |");
        System.out.println(" +-- ContaEmpresarial (sealed)");
        System.out.println("       -> continua controlando a heranca");
        System.out.println("       -> permite ContaEmpresarialPequena\n");
        System.out.println("Conclusao:");
        System.out.println("final fecha a heranca.");
        System.out.println("sealed controla quem pode herdar.");
        System.out.println("non-sealed reabre a heranca.");
    }
}