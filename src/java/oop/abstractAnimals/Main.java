package java.oop.abstractAnimals;

public class Main {
	
  public static void main(String[] args) {
		
	Animale c = new Cane();
	c.verso();
	c.mangia();
	c.dormi();
	INuotante cane = new Cane();
	faiNuotare(cane);
	
	Animale p = new Passerotto();
	p.verso();
	p.mangia();
	p.dormi();
	IVolante passerotto = new Passerotto();
	faiVolare(passerotto);
	
	Animale a = new Aquila();
	a.verso();
	a.mangia();
	a.dormi();
	IVolante aquila = new Aquila();
	faiVolare(aquila);

	Animale d = new Delfino();
	d.verso();
	d.mangia();
	d.dormi();
	INuotante delfino = new Delfino();
	faiNuotare(delfino);
    }

	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}

	public static void faiVolare(IVolante animale) {
		animale.vola();
	}
}

