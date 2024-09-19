package impressao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaDeImpressao {

    public static void main(String[] args) {

        Scanner nomeDocumento = new Scanner(System.in);
        Scanner numeroPagina = new Scanner(System.in);
        Scanner opcaoUsuario = new Scanner(System.in);
        Queue<String>objetoFila= new LinkedList<>();
        if(objetoFila.isEmpty()) System.out.println("Fila de Impressão");
        else {
            System.out.println("Fila cheia!");
        }
        int qtd=0;
        do {
            System.out.print("Usuário escolha a opção"
                    + "\n(1) Adicionar Trabalho de Impressão"
                    + "\n(2) Remover Trabalho"
                    + "\n(3) Mostrar Fila de Impressão"
                    + "\n(4) Sair");

            int operacao = opcaoUsuario.nextInt();
            switch(operacao) {
                //adicionar
                case 1:
                    String DadosDoTrabalho = recebeDados( nomeDocumento, numeroPagina);//método para receber musica
                    objetoFila.add(DadosDoTrabalho);
                    System.out.println("Trabalho de impressão adicionado a fila!");
                    System.out.println("Os trabalhos de impressão da sua fila são: ");
                    Iterator<String> objetoInterator1 = objetoFila.iterator();
                    while (objetoInterator1.hasNext()) {
                        System.out.println(objetoInterator1.next());
                    }

                    break;
                case 2:
                    //remover
                    if (objetoFila.size()>0) {
                        System.out.println("Preparando para excluir...");
                        objetoFila.remove();
                        System.out.println("Impressão excluído!");
                        System.out.println("Mostrar a fila de impressão: ");
                        Iterator<String> objetoInterator2 = objetoFila.iterator();
                        while (objetoInterator2.hasNext()) {
                            System.out.println(objetoInterator2.next());
                        }
                    }
                    else {
                        System.out.println("A fila de impressão está vazia!");
                    }
                    break;
                case 3:
                    System.out.println("O tamanho da fila da impressão é -->  " + objetoFila.size());
                    break;
                case 4:
                    //sair
                    qtd = 10;
                    break;
                default:
                    System.out.println("Operação inválida!!!!");
            }

        }while(qtd<5);
        opcaoUsuario.close();
    }
    public static String recebeDados(Scanner nomeDocumento, Scanner numeroPagina){
        System.out.println("Usuário qual o nome do documento?");
        String nome=nomeDocumento.nextLine();
        System.out.println("Usuário qual o número da página?");
        String numero = numeroPagina.nextLine();
        String dadosTrabalho = "nome do documento: " +nome+" | numero de paginas: " +numero;
        return dadosTrabalho;
    }
}
