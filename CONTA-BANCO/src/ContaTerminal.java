import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numero;
        String  agencia;
        String  nomeCliente;
        Double  saldo;

        System.out.println("- - - - - Início do Programa - - - - -\n");

        System.out.print("\nPor favor digite o número da agência: ");        
        agencia = sc.next();  
        sc.nextLine();    
        
        System.out.print("\nDigite o número do usuário: ");
        numero = sc.nextInt();
                  

        System.out.print("\nDigite o nome do cliente: ");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.print("\nDigite o saldo: ");
        saldo = sc.nextDouble();

        System.out.print("\n\n- - - - Resposta do Sistema - - - - \n");
        System.out.print("\nOlá "+nomeCliente
                         +", obrigado por criar uma conta em nosso banco, "
                         +" sua agência é a "+agencia
                         +", conta "+numero
                         +" e seu saldo de R$"+saldo+" já está disponível." );

        sc.close();            

    }

}
