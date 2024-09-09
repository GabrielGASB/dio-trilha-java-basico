import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

           
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("");       
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("");
        System.out.println("Digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("");
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("");
        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("");
        System.out.println("Digite seu saldo inicial :) ");
        Double saldo = scanner.nextDouble();

        // String str = String.format("%.02f", saldo);
        // saldo = Double.valueOf(str);

        DecimalFormat formato = new DecimalFormat("#.##");
        saldo = Double.valueOf(formato.format(saldo));

        System.out.println("");
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + 
        ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + 
        ", sua conta: " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
