package yacine;

import specification.InterfacePoint;

public class Point implements InterfacePoint {

	int abscisse;
	int ordonnee; 
	
	@Override
	public int getOrd() {
		
		return ordonnee;
	}

	@Override
	public int getAbs() {
		return abscisse;
	}

	@Override
	public void setOrd(int ordonnee) {
		
		this.ordonnee = ordonnee; 

	}

	@Override
	public void setAbs(int abscisse) {
		this.abscisse = abscisse;

	}

	@Override
	public InterfacePoint add(InterfacePoint p) {
		
		int abs;
		int ord;
		
		InterfacePoint c = new Point();
		ord = this.getOrd() + p.getOrd();
		abs = this.getAbs() + p.getAbs();
		c.setAbs(abs); 
		c.setOrd(ord);
		return c;
	}
	
}
