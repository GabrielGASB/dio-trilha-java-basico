import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo no formato 4.500,30 (com ponto e vírgula como separadores):");
        String entrada = scanner.next();
        String saldoFormatado;
        String valorSemPonto = entrada.replace(".", "").replace(",", ".");
        saldo = Double.parseDouble(valorSemPonto);
        DecimalFormat formatador = new DecimalFormat("#,##0.00");
        saldoFormatado = String.format(formatador.format(saldo));

        System.out.println("");
        String fichaTecnica = """
                	************************************************************
                    Olá %s %s.
                	Obrigado por criar uma conta em nosso banco.
                	O número de sua agência é: %s.
                	Sua conta é: %d.
                	O saldo de R$%s já está disponível para saque.
                	************************************************************
                \t""".formatted(nomeCliente, sobrenomeCliente, agencia, numeroConta, saldoFormatado);
        System.out.println(fichaTecnica);

        scanner.close();
    }
}
