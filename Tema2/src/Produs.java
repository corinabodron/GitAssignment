
public class Produs implements Icomparable {
	private String denumireProdus;
	private int numarProduse;
	
	public Produs(String denumireProdus, int numarProduse) {
		super();
		this.denumireProdus = denumireProdus;
		this.numarProduse = numarProduse;
	}

	@Override
	public int getNumarProdus() {
		// TODO Auto-generated method stub
		return numarProduse;	
	}


	
	
}
