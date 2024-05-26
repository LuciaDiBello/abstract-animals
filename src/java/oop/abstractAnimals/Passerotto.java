package java.oop.abstractAnimals;

public class Passerotto extends Animale implements IVolante {
	
	@Override
	public void verso() {
	  System.out.println("cinguettio");
	}
 	
	@Override
 	public void mangia() {
 		System.out.println("semi, frutti, invertebrati");
 	}
	
	@Override
	public void vola() {
	 	System.out.println("Sto volando");
	}
}

