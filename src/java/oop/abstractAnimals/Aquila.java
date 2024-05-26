package java.oop.abstractAnimals;

public class Aquila extends Animale implements IVolante {
	
	@Override
	public void verso() {
	  System.out.println("strido");
	}
 	
	@Override
 	public void mangia() {
 		System.out.println("carne");
 	}
	
	@Override
	public void vola() {
	 	System.out.println("Sto volando");
	}
}
