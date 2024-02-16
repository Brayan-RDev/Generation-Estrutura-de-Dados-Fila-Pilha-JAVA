package estruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		Scanner scan = new Scanner(System.in);
		int escolhaAcao;
		
		do {
			System.out.println("------ESCOLHA UMA OPÇÃO------\n"
							 + "1 - Adicionar Cliente na Fila\n"
							 + "2 - Listar todos os Clientes\n"
							 + "3 - Retirar Cliente da Fila\n"
							 + "0 - Sair\n"
							 + "Entre com a opção desejada: ");
			escolhaAcao = scan.nextInt();
			scan.nextLine();
			
			switch(escolhaAcao) {
				case 0:{
					break;
				}
				case 1:{
					System.out.println("Digite o nome do cliente: ");
					fila.add(scan.nextLine());
					System.out.println("\n");
					break;
				}
				case 2:{
					if(fila.isEmpty()) {
						System.out.println("A fila está vazia!");
						System.out.println("\n");
						break;
					}
					else {
						Iterator<String> iterator = fila.iterator();
						System.out.println("-----Lista de clientes-----\n");
						while(iterator.hasNext()){
							System.out.println(iterator.next());
						}
						break;
					}
				}
				case 3:{
					if(fila.isEmpty()) {
						System.out.println("A fila está vazia!");
						System.out.println("\n");
						break;
					}
					else {
						fila.remove();
						Iterator<String> iterator = fila.iterator();
						while(iterator.hasNext()){
							System.out.println(iterator.next());
						}
						System.out.println("O Cliente foi Chamado!");
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
