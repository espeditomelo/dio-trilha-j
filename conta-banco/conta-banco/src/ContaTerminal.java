import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Classe Scanner e atributos
        Scanner scanner = new Scanner(System.in);

        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        //TODO: Exibir mensagens para o usuário e obter por meio do Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo !");
        saldo = scanner.nextDouble();

        //TODO: Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "," + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");


        scanner.close();
    }
}
