
public class Principal {

	public static void main(String[] args) {
		// Nome do aluno: �talo Dur�es Passos Barboza
		//  Ra:  21709010
		
		
		
		
		// Intanciar o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		
		// QUEST�O 2.a
		
		System.out.println("----------QUEST�O 2.a----------\n");
		System.out.println(bds.getInfoCliente("Evandro da Silva"));
		System.out.println("\n");
		
		// QUEST�O 2.b 
		
		System.out.println("----------QUEST�O 2.b----------\n");
		System.out.println(bds.ligacoesPorCliente("Jo�o dos Montes"));
		System.out.println("\n");
		
		// QUEST�O 2.c
		
		System.out.println("----------QUEST�O 2.c----------\n");
		System.out.println(bds.ligacoesPorUF("RJ"));
		System.out.println("\n");

		
		// QUEST�O 2.d
		
				System.out.println("----------QUEST�O 2.d----------\n");
				System.out.println(bds.ligacoesUFDiferente());
				System.out.println("\n");
				
				
				
	  // QUEST�O 3.a e a 3.b
				
			System.out.println("----------QUEST�O 3.a----------\n");
			System.out.println(bds.getContaDoCliente("Evandro da Silva"));
			System.out.println("\n");
						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
