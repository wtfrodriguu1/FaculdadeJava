import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader:

public class App {
    public static void main(String[] args) throws Exception 
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Digite seu nome Completo: ");
            String nome = reader.readLine();

            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(reader.readLine());

            System.out.print("Digite sua Altura: ");
            double altura = Double.parseDouble(reader.readLine());
            
            System.out.println("Nome Completo: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
