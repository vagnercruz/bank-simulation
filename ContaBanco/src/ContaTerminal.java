import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
      // TODO: Conhecer e importar a classe scanner

      // Exibir as mensagens papa o usuario

      // obter esse valor e exibir a mensagem conta criada

      Scanner sc = new Scanner(System.in);

      System.out.println("Por favor, digite o número da Agência! (Exemplo: 067-8)");
      String agencia = sc.nextLine();

      System.out.print("Por favor, digite o número da conta: ");
      int numero = sc.nextInt();
      sc.nextLine();

      System.out.print("Por favor, digite o seu nome: ");
      String nomeCliente = sc.nextLine();

      System.out.print("Por favor, digite o valor de saldo que queres adicionar: ");
      double saldo = sc.nextDouble();

     System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
  } 
}
