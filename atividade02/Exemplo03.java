// TRY-WITH-RESOURCES / AUTOCLOSEABLE: implementar AutoCloseable permite usar a classe no try(...)
class ConexaoSimulada implements AutoCloseable {
    public ConexaoSimulada() {
        System.out.println("Conexão aberta.");
    }

    public void executar() {
        System.out.println("Executando operação...");
    }

    @Override
    public void close() {
        System.out.println("Conexão fechada.");
    }
}

public class Exemplo03 {
    public static void main(String[] args) {
        // TRY-WITH-RESOURCES: o Java chama close() automaticamente ao fim do bloco, mesmo sem chamada explícita
        try (ConexaoSimulada conexao = new ConexaoSimulada()) {
            conexao.executar();
        }
    }
}