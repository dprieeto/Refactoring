package edu.uhu.monopoly;

public interface IOwnable {

	Player getPropietary();

	void setPropietary(Player Propietary);

	boolean isAvailable();

	void setAvailable(boolean available);

}