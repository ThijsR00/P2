package P2;

import java.sql.SQLException;

public class OV_Chipkaart {
	OV_ChipkaartOracleDaoImpl c = new OV_ChipkaartOracleDaoImpl();
	private int kaarNummer;
	private String geldigTot;
	private int klasse;
	private double saldo;
	private int reizigerID;
	
	public OV_Chipkaart(String geldigTot, int klasse, double saldo, int reizigerID) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.geldigTot = geldigTot;
		this.klasse = klasse;
		this.saldo = saldo;
		this.reizigerID = reizigerID;
		c.save(this);
	}
	
	public OV_Chipkaart(int kaarNummer, String geldigTot, int klasse, double saldo, int reizigerID) {
		this.kaarNummer = kaarNummer;
		this.geldigTot = geldigTot;
		this.klasse = klasse;
		this.saldo = saldo;
		this.reizigerID = reizigerID;
	}


	public int getKaarNummer() {
		return kaarNummer;
	}

	public void setKaarNummer(int kaarNummer) {
		this.kaarNummer = kaarNummer;
	}

	public String getGeldigTot() {
		return geldigTot;
	}

	public void setGeldigTot(String geldigTot) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.geldigTot = geldigTot;
		c.update(this);
	}

	public int getKlasse() {
		return klasse;
	}

	public void setKlasse(int klasse) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.klasse = klasse;
		c.update(this);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.saldo = saldo;
		c.update(this);
	}

	public int getReizigerID() {
		return reizigerID;
	}

	public void setReizigerID(int reizigerID) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.reizigerID = reizigerID;
		c.update(this);
	}

	@Override
	public String toString() {
		return "OV_Chipkaart [kaarNummer=" + kaarNummer + ", geldigTot=" + geldigTot + ", klasse=" + klasse + ", saldo="
				+ saldo + ", reizigerID=" + reizigerID + "]";
	}
	
}
