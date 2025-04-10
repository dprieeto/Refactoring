package edu.uhu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player propietary;
	protected boolean available = true;

	public String getName() {
		return name;
	}

	@Override
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

	@Override
	public void setPropietary(Player Propietary) {
		this.propietary = Propietary;
	}
    
    public String toString() {
        return name;
    }

	@Override
	public boolean isAvailable() {
		return available;
	}

	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
