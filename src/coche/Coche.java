package coche;

public class Coche {

	 
		// TODO Auto-generated method stub

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
		 
		 public Coche() {
			 ancho=250;
			 largo=400;
			 ruedas=4;
			 motor=200;
			 peso=1900;
			 
			 Coche Renault = new Coche();
			 
			 System.out.println("Mi coche tiene "+Renault.ruedas+" ruedas y tiene "+Renault.motor+" CV.");
		 
			 public String dime motor("El motor tiene"+" motor"+" caballos.") {
					return "";
					public void establece_color() {
					color = "rojo";	
					}
					public String dime_color() {
						return "El color de tu coche es " + color;
			public String dime_datos_generales() {
				return "LA plataforma del coche tien "+ ruedas+" ruedas"+". Mide "+largo/1000 +" metros con un ancho de " + ancho + "centimetros y un peso de plataforma de "+ peso_plataforma + " kg"}
			
			public void configura_asientos(String asientos_cuero) {
				if(asientos_cuero=="si") {
					this.asientos_cuero=true;
				}else{
					this.asiento_cuero=false;
					
				}
				}
			}
					}
					
		 }
		
		 }


