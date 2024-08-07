import edu.mateus.komorebi.modelos.ContaBancaria;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * <h1>🏦 Banco Komorebi</h1>
 * <p>Uma aplicação em <b>Java</b> para o banco tradicional <b>'Ficticio'</b> Komorebi.</p>
 * <p>Fundado em 1869, após o término da Guerra Boshin e o início da Restauração Meiji, por Hiroshi Tanaka.</p>
 *
 * @author  Mateus Simões Rosa
 * @version 1.0
 * @since   06/08/2024
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Yuki Nakamura", 1021, "067-8");

        // Variável ----------------------------------
        int selecao = 0;

        // Main --------------------------------------
        System.out.println(" *** コモレビ銀行 ***********************************");
        System.out.println("   Bem-Vindo");
        System.out.print("   Número: ");
        int numero = scan.nextInt();
        System.out.print("   Agência: ");
        String agencia = scan.next();
        System.out.println(" ************************************************** \n");

        if (conta.validarConta(numero, agencia)) {
            while (selecao != 3) {
                String menu = """
                     *** コモレビ銀行 ***********************************
                       %s
                       Saldo: ¥%.2f       
                     **************************************************  
                    | 1. Receber       |   2. Sacar    |       3. Sair |
                    """.formatted(conta.getNome(), conta.getSaldo());
                System.out.print(menu + ":");
                selecao = scan.nextInt();

                switch (selecao) {
                    case 1:
                        System.out.println("\n ************************************************** ");
                        System.out.print("   ¥");
                        conta.receber(scan.nextDouble()); // Passa o input como parâmetro...
                        System.out.println(" ************************************************** \n");
                        break;

                    case 2:
                        System.out.println("\n ************************************************** ");
                        System.out.print("   ¥");
                        conta.sacar(scan.nextDouble()); // Passa o input como parâmetro...
                        System.out.println(" ************************************************** \n");
                        break;

                    case 3:
                        System.out.println("\n ************************************************** ");
                        System.out.println("   Bye, bye...");
                        System.out.println(" ************************************************** \n");
                        break;

                    default:
                        System.out.println("\n ************************************************** ");
                        System.out.println("   Opção inválida...");
                        System.out.println(" ************************************************** \n");
                        break;
                }
            }
        } else {
            System.out.println(" ************************************************** ");
            System.out.println("   Nenhum usuário encontrado...");
            System.out.println(" ************************************************** \n");
        }
    }
}
