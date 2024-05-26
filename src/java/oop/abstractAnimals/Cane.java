package java.oop.abstractAnimals;

public class Cane extends Animale implements INuotante {
	
	@Override
	public void verso() {
	   System.out.println("abbaio");
	}
 
	@Override
 	public void mangia() {
 	   System.out.println("carne");
 	}
	
	@Override
	public void nuota() {
	 	System.out.println("Sto nuotando");
	}
}
