package estruturaDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		int escolhaAcao;
		
		do {
			System.out.println("------ESCOLHA UMA OPÇÃO------\n"
							 + "1 - Adicionar Livro na Pilha\n"
							 + "2 - Listar todos os Livros\n"
							 + "3 - Retirar Livro da Pilha\n"
							 + "0 - Sair\n"
							 + "Entre com a opção desejada: ");
			System.out.println("\n");
			escolhaAcao = scan.nextInt();
			scan.nextLine();
			
			switch(escolhaAcao) {
				case 0:{
					break;
				}
				case 1:{
					System.out.println("Digite o nome do livro: ");
					pilha.push(scan.nextLine());
					System.out.println("\n");
					break;
				}
				case 2:{
					if(pilha.isEmpty()) {
						System.out.println("A Pilha está vazia!");
						System.out.println("\n");
						break;
					}
					else {
						Iterator<String> iterator = pilha.iterator();
						System.out.println("-----Pilha de Livros-----\n");
						while(iterator.hasNext()){
							System.out.println(iterator.next());
						}
						System.out.println("-------------------------\n");
						break;
					}
				}
				case 3:{
					if(pilha.isEmpty()) {
						System.out.println("A Pilha está vazia!");
						System.out.println("\n");
						break;
					}
					else {
						pilha.pop();
						Iterator<String> iterator = pilha.iterator();
						while(iterator.hasNext()){
							System.out.println(iterator.next());
						}
						System.out.println("O livro foi removido da pilha!");
						System.out.println("\n");
						break;
					}				
				}
				default :{
					System.out.println("Opção Invalida!");
					System.out.println("\n");;
					break;
				}
			}
		}while(escolhaAcao != 0);
		
		System.out.println("Programa Finalizado!");
		scan.close();
	}

}
