import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception 
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            /*  System.out.print("Digite seu nome Completo: ");
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
            e.printStackTrace();*/


            System.out.print("Digite o valor 1: ");
            int Valor1 = Integer.parseInt(reader.readLine());

            System.out.print("Digite o valor 2: ");
            int Valor2 = Integer.parseInt(reader.readLine());
        
            int soma = Valor1 + Valor2;
            int subtracao = Valor1 - Valor2;
            int multiplicacao = Valor1 * Valor2;

            System.out.println("Soma = " + soma);
            System.out.println("Subtração = " + subtracao);
            System.out.println("Multiplicação = " + multiplicacao);

        } catch (IOException e)
        {
            e.printStackTrace();

            //realziar a leitura de duas variáveis (Valor1 e Valor2)
            //realziar a soma, subtração e multiplicacao e imprima o valor dos resultados
        }
    }
}
