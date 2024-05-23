import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Configura o Locale para US antes de criar o Scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite a conta!:");
        int conta = sc.nextInt(); // exemplo 1021

        System.out.println("Digite a agencia!:");
        String agencia = sc.next(); // exemplo 067-8

        System.out.println("Digite seu nome:");
        sc.nextLine(); // Consumir a linha pendente
        String nomeCliente = sc.nextLine(); // exemplo Mario Andrade

        System.out.println("Digite seu saldo:");
        Double saldo = sc.nextDouble(); // exemplo 237.48

        System.out.printf("Ola " + nomeCliente + " ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo atual é de12021 %.2f%n", saldo);

        sc.close();
    }
}