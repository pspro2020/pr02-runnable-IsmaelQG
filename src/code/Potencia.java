package code;

public class Potencia implements Runnable{

	private final double number;
	
	Potencia(int number){
		this.number=number;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.printf("%.0f elevado a %d = %.0f\n", number, i, Math.pow(number, i));
		}
	}

}
