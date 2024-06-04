import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia, nomeCliente;
        float saldo;

        try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){
            
            System.out.println("Por favor, Digite o número da Agência: ");
             agencia = scanner.next();

             System.out.println("Insira o numero da conta: ");
             numeroConta = scanner.nextInt();

             scanner.nextLine();

             System.out.println("Insira seu nome: ");
             nomeCliente = scanner.nextLine();

             System.out.println("Insira seu saldo: ");
             saldo = scanner.nextFloat();

             System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numeroConta + " e seu saldo "+ saldo + " já está disponivel para saque.");
        }
    }
}
