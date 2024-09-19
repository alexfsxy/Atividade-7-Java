package atendimentoaopublico;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaDoBanco {

    public static void main(String[] args) {

        Scanner cpfInformado = new Scanner(System.in);
        Scanner nomeInformado = new Scanner(System.in);
        Scanner opcaoUsuario = new Scanner(System.in);
        Queue<String>objetoFila= new LinkedList<String>();
        if(objetoFila.isEmpty()) {
            System.out.println("Sua fila está vazia!");
        }else {
            System.out.println("Fila cheia!");
        }
        int qtd=0;
        do {
            System.out.print("Usuário escolha a opção"
                    + "\n(1) Inserir cliente"
                    + "\n(2) Remover cliente"
                    + "\n(3) Ver tamanho da fila"
                    + "\n(4) Sair");

            int operacao = opcaoUsuario.nextInt();
            switch(operacao) {
                //adicionar
                case 1:
                    String DadosDoCliente = recebeDados(nomeInformado, cpfInformado);//método para receber musica
                    objetoFila.add(DadosDoCliente);
                    System.out.println("Cliente adicionado a fila!");
                    System.out.println("Os clientes da sua fila são: ");
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
                        System.out.println("Cliente excluído!");
                        System.out.println("Os clientes da sua fila são: ");
                        Iterator<String> objetoInterator2 = objetoFila.iterator();
                        while (objetoInterator2.hasNext()) {
                            System.out.println(objetoInterator2.next());
                        }
                    }
                    else {
                        System.out.println("Sua fila está vazia!");
                    }
                    break;
                case 3:
                    System.out.println("O tamanho da fila é -->  " + objetoFila.size());
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
    public static String recebeDados(Scanner nomeInformado, Scanner cpfInformado){
        System.out.println("Usuário qual o nome do cliente?");
        String nome=nomeInformado.nextLine();
        System.out.println("Usuário qual o cpf do cliente?");
        String cpf =cpfInformado.nextLine();
        String dadosCliente = "nome do cliente: " +nome+" | cpf do cliente: " +cpf;
        return dadosCliente;
    }
}
