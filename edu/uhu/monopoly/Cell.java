package edu.uhu.monopoly;

public abstract class Cell {
	private String name;
	protected Player propietary;

	public String getName() {
		return name;
	}

	public Player getPropietary() {
		return propietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	public void setPropietary(Player Propietary) {
		this.propietary = Propietary;
	}
    
    public String toString() {
        return name;
    }
}
