package P2;

import java.sql.SQLException;

public class Reiziger {
	ReizigerOracleDaoImpl a = new ReizigerOracleDaoImpl();
	private int reizigerID;
	private String voorletters;
	private String tussenvoegsel;
	private String achternaam;
	private String gbdatum;

	
	public Reiziger(String voorletters, String tussenvoegsel, String achternaam, String gbdatum) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.voorletters = voorletters;
		this.tussenvoegsel = tussenvoegsel;
		this.achternaam = achternaam;
		this.gbdatum = gbdatum;
		a.save(this);
	}
	
	public Reiziger(int reizigerID, String voorletters, String tussenvoegsel, String achternaam, String gbdatum) {

		this.reizigerID = reizigerID;
		this.voorletters = voorletters;
		this.tussenvoegsel = tussenvoegsel;
		this.achternaam = achternaam;
		this.gbdatum = gbdatum;
	}

	public int getReizigerID() {
		return reizigerID;
	}
	public void setReizigerID(int reizigerID) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.reizigerID = reizigerID;
	}
	public String getVoorletters() {
		return voorletters;
	}
	public void setVoorletters(String voorletters) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.voorletters = voorletters;
		a.update(this);
	}
	public String getTussenvoegsel() {
		return tussenvoegsel;
	}
	public void setTussenvoegsel(String tussenvoegsel) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.tussenvoegsel = tussenvoegsel;
		a.update(this);
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.achternaam = achternaam;
		a.update(this);
	}
	public String getGbdatum() {
		return gbdatum;
	}
	public void setGbdatum(String gbdatum) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.gbdatum = gbdatum;
		a.update(this);
	}
	@Override
	public String toString() {
		return "GEBRUIKER: " + reizigerID + ", " + voorletters + ", "
				+ tussenvoegsel + ", " + achternaam + ", " + gbdatum;
	}


	

}
