package java.oop.abstractAnimals;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verso() {
	  System.out.println("fischio");
	}
 	
	@Override
 	public void mangia() {
 		System.out.println("pesci, molluschi");
 	}
	
	@Override
	public void nuota() {
	 	System.out.println("Sto nuotando");
	}
}

