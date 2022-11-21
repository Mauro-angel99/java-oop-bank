package jana60.bank;

public class Main {

	public static void main(String[] args) {
		
		Conto conto = new Conto(2875448, "Mauro");
		
		System.out.println(conto);
		System.out.println("---------------------------------------");
		
		conto.addMoney(3000);
		System.out.println(conto);		
		System.out.println("---------------------------------------");
		
		boolean res = conto.getMoney(250);
		System.out.println("risultato prelievo: " + res);
		System.out.println("---------------------------------------");
		System.out.println(conto);
		System.out.println("---------------------------------------");
		
		res = conto.getMoney(530);
		System.out.println("risultato prelievo: " + res);
		System.out.println("---------------------------------------");
		System.out.println(conto);
	}
}