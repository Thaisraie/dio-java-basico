import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        double saldo = 237.48;

        System.out.println("Por favor, digite o Número da Conta: ");

        int numero;
        Scanner leia = new Scanner(System.in);
        numero = leia.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");

        String agencia;
        Scanner informe = new Scanner(System.in);
        agencia = informe.nextLine();

        System.out.println("Por favor, digite seu Nome: ");

        String nome;
        Scanner reader = new Scanner(System.in);
        nome = reader.nextLine();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
