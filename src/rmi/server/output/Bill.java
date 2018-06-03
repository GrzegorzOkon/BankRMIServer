package rmi.server.output;

import java.io.Serializable;

public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	private String identyfikatorKlienta;
	private String nazwaTowaru;
	private int iloœæTowaru;
	private String numerRachunkuBankowegoKlienta;
	private String numerRachunkuBankowegoSklepu;
	
	public Bill(String identyfikatorKlienta, String nazwaTowaru, int iloœæTowaru, String numerRachunkuBankowegoKlienta, String numerRachunkuBankowegoSklepu) {
		this.identyfikatorKlienta = identyfikatorKlienta;
		this.nazwaTowaru = nazwaTowaru;
		this.iloœæTowaru = iloœæTowaru;
		this.numerRachunkuBankowegoKlienta = numerRachunkuBankowegoKlienta;
		this.numerRachunkuBankowegoSklepu = numerRachunkuBankowegoSklepu;
	}

	public String getIdentyfikatorKlienta() {
		return identyfikatorKlienta;
	}
	
	public void setIdentyfikatorKlienta(String identyfikatorKlienta) {
		this.identyfikatorKlienta = identyfikatorKlienta;
	}
	
	public String getNazwaTowaru() {
		return nazwaTowaru;
	}

	public void setNazwaTowaru(String nazwaTowaru) {
		this.nazwaTowaru = nazwaTowaru;
	}

	public int getIloœæTowaru() {
		return iloœæTowaru;
	}

	public void setIloœæTowaru(int iloœæTowaru) {
		this.iloœæTowaru = iloœæTowaru;
	}

	public String getNumerRachunkuBankowegoKlienta() {
		return numerRachunkuBankowegoKlienta;
	}

	public void setNumerRachunkuBankowegoKlienta(String numerRachunkuBankowegoKlienta) {
		this.numerRachunkuBankowegoKlienta = numerRachunkuBankowegoKlienta;
	}

	public String getNumerRachunkuBankowegoSklepu() {
		return numerRachunkuBankowegoSklepu;
	}

	public void setNumerRachunkuBankowegoSklepu(String numerRachunkuBankowegoSklepu) {
		this.numerRachunkuBankowegoSklepu = numerRachunkuBankowegoSklepu;
	}
	
	@Override
	public String toString() {
		return "Bill [identyfikatorKlienta=" + identyfikatorKlienta + ", nazwaTowaru=" + nazwaTowaru + ", iloœæTowaru="
				+ iloœæTowaru + ", numerRachunkuBankowegoKlienta=" + numerRachunkuBankowegoKlienta
				+ ", numerRachunkuBankowegoSklepu=" + numerRachunkuBankowegoSklepu + "]";
	}
}