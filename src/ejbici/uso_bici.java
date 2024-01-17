package ejbici;
public class uso_bici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bicicleta bici = new bicicleta();
		System.out.println("La bicicleta tiene "+bici.numeroruedas+(" ruedas"));
		System.out.println("La bicicleta es para "+bici.tipo);
		System.out.println("La bicicleta tiene un tamaño de "+bici.tamaño);
	}

}