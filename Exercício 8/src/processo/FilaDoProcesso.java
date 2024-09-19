package processo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaDoProcesso {

    public static void main(String[] args) {

            Scanner nomeDoProcesso = new Scanner(System.in);
            Scanner numeroDoProcesso = new Scanner(System.in);
            Scanner opcaoUsuario = new Scanner(System.in);
            Queue<String> objetoFila= new LinkedList<>();
            if(objetoFila.isEmpty()) System.out.println("A fila do processo");
            else {
                System.out.println("Fila cheia!");
            }
            int qtd=0;
            do {
                System.out.print("Usuário escolha a opção"
                        + "\n(1) Adicionar Processo ao Fila"
                        + "\n(2) Remover Seguinte Processo"
                        + "\n(3) Mostrar Fila de Processos"
                        + "\n(4) Sair");

                int operacao = opcaoUsuario.nextInt();
                switch(operacao) {
                    //adicionar
                    case 1:
                        String DadosDoProcessos = recebeDados( nomeDoProcesso, numeroDoProcesso);//método para receber musica
                        objetoFila.add(DadosDoProcessos);
                        System.out.println("Processo adicionado a fila!");
                        System.out.println("Os processos da fila são: ");
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
                            System.out.println("Processo excluído!");
                            System.out.println("Mostrar a fila dos processos: ");
                            Iterator<String> objetoInterator2 = objetoFila.iterator();
                            while (objetoInterator2.hasNext()) {
                                System.out.println(objetoInterator2.next());
                            }
                        }
                        else {
                            System.out.println("A fila do processo está vazia!");
                        }
                        break;
                    case 3:
                        System.out.println("O tamanho da fila do processo é -->  " + objetoFila.size());
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
        public static String recebeDados(Scanner nomeDoProcesso, Scanner numeroDoProcesso){
            System.out.println("Usuário qual o nome do processo?");
            String nome=nomeDoProcesso.nextLine();
            System.out.println("Usuário qual o número do processo?");
            String numero = numeroDoProcesso.nextLine();
            String dadosProcesso = "nome do processo: " +nome+" | numero do processo: " +numero;
            return dadosProcesso;
        }
    }
