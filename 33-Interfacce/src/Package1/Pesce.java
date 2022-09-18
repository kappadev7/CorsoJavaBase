package Package1;

public class Pesce implements Preda, Predatore {

	@Override
	public void caccia() {

		System.out.println("il pesce grosso caccia");
		
	}

	@Override
	public void scappa() {

		System.out.println("sta scappando il pesce piccolo");
	}

}
