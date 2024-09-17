package navegation;
import java.util.Scanner;

public class OpcaoHistorico {
    private final HistoricoNavegacao historicoNavegacao;
    private final Scanner scanner;

    public OpcaoHistorico(Scanner scanner) {
        this.historicoNavegacao = new HistoricoNavegacao();
        this.scanner = scanner;
    }

    public void showMenu() {
        while (true) {
            System.out.println("1. Add Navegacao");
            System.out.println("2. Remove Navegacao");
            System.out.println("3. Mark Navegacao Completed");
            System.out.println("4. Display Navegacao");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Adicione uma navegação:");
                    String description = scanner.nextLine();
                    historicoNavegacao.addNavegacao(description);
                    break;

                case 2:
                    System.out.println("Insira o ID da tarefa para remover:");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    historicoNavegacao.removeNavegacao(removeId);
                    break;

                case 3:
                    System.out.println("Insira o ID da tarefa para marcar como concluída:");
                    int completeId = scanner.nextInt();
                    scanner.nextLine();
                    historicoNavegacao.markNavegacaoCompleted(completeId);
                    break;

                case 4:
                    historicoNavegacao.displayNavegacao();
                    int  qtd = 10;
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
    }
