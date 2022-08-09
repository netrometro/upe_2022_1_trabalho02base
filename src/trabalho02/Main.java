package trabalho02;

public class Main {

	public static void main(String[] args) {
		
		// Tamanho para teste
		int tamanho = 100000;
		
		System.out.println("LISTA ENCADEADA DINÂMICA\n========================");
		
		System.out.println("\nTestes de tempo com a lista vazia\n---------------------------------");
		Trabalho02 lista1 = null; // <<----- CRIE O OBJETO DE SEU TRABALHO AQUI!
		Trabalho02 lista2 =  null; // <<----- CRIE O OBJETO DE SEU TRABALHO AQUI!
		for (int i = 0; i < tamanho; i++) {
			ITAD tad = null;  // <<---------- CRIE O OBJETO DE SEU TAD AQUI!
			lista2.inserirNoInicio(tad);
		}
		ITAD tad1 = null;  // <<---------- CRIE O OBJETO DE SEU TAD AQUI!
		ITAD tad2 = null;  // <<---------- CRIE O OBJETO DE SEU TAD AQUI!
		ITAD tad3 = null;  // <<---------- CRIE O OBJETO DE SEU TAD AQUI!
		
		
		System.out.println("\n\tInserção no início da lista\n\t----------------------------");
		System.out.println(lista1.print());
		
		long time = System.nanoTime();
		lista1.inserirNoInicio(tad1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		
		System.out.println("\n\tRemoção no início da lista\n\t----------------------------");
		
		System.out.println(lista1.print());
		
		time = System.nanoTime();
		tad1 = lista1.removerNoInicio();
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		
		System.out.println("\n\tInserção no final da lista\n\t----------------------------");
		
		System.out.println(lista1.print());
		
		time = System.nanoTime();
		lista1.inserirNoFim(tad1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		
		System.out.println("\n\tRemoção no final da lista\n\t----------------------------");
		
		System.out.println(lista1.print());
		
		time = System.nanoTime();
		tad1 = lista1.removerNoFim();
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		
		System.out.println("\n\tInserção no meio da lista\n\t----------------------------");
		lista1.inserirNoFim(tad1);
		lista1.inserirNoFim(tad2);
		
		System.out.println(lista1.print());
		
		time = System.nanoTime();
		lista1.inserirNoMeio(tad3, 1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		
		System.out.println("\n\tRemoção no meio da lista\n\t----------------------------");
		
		System.out.println(lista1.print());
		
		time = System.nanoTime();
		tad1 = lista1.removerNoMeio(1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		

		
		System.out.println("\nTestes de tempo com a lista cheia\n---------------------------------");
		
		System.out.println("\n\tInserção no início da lista\n\t----------------------------");
		System.out.println(lista2.print());

		time = System.nanoTime();
		lista2.inserirNoInicio(tad1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
		
		System.out.println("\n\tRemoção no início da lista\n\t----------------------------");
		
		System.out.println(lista2.print());
		
		time = System.nanoTime();
		tad1 = lista2.removerNoInicio();
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
		
		System.out.println("\n\tInserção no final da lista\n\t----------------------------");
		
		System.out.println(lista2.print());
		
		time = System.nanoTime();
		lista2.inserirNoFim(tad1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
		
		System.out.println("\n\tRemoção no final da lista\n\t----------------------------");
		
		System.out.println(lista2.print());
		
		time = System.nanoTime();
		tad1 = lista2.removerNoFim();
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
		
		System.out.println("\n\tInserção no meio da lista\n\t----------------------------");
		lista2.inserirNoFim(tad1);
		lista2.inserirNoFim(tad2);
		
		System.out.println(lista2.print());
		
		time = System.nanoTime();
		lista2.inserirNoMeio(tad3, tamanho/2);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
		
		System.out.println("\n\tRemoção no meio da lista\n\t----------------------------");
		
		System.out.println(lista2.print());
		
		time = System.nanoTime();
		tad1 = lista2.removerNoMeio(1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
	}

}
