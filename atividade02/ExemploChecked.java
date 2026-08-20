import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExemploChecked {
    public static void main(String[] args) {
        // EXCEÇÃO CHECKED: FileNotFoundException obriga tratamento (try/catch) ou throws
        try {
            FileReader arquivo = new FileReader("dados.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}