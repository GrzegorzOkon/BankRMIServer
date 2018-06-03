package rmi.server.output;

import java.io.Serializable;
import java.util.ArrayList;

public class BankStatement implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Bill> historiaRachunkuKlienta;
	private int sumaZakupionychTowarów;

	public BankStatement(ArrayList<Bill> historiaRachunkuKlienta, int sumaZakupionychTowarów) {
		this.historiaRachunkuKlienta = historiaRachunkuKlienta;
		this.sumaZakupionychTowarów = sumaZakupionychTowarów;
	}

	public ArrayList<Bill> getHistoriaRachunkuKlienta() {
		return historiaRachunkuKlienta;
	}

	public void setHistoriaRachunkuKlienta(ArrayList<Bill> historiaRachunkuKlienta) {
		this.historiaRachunkuKlienta = historiaRachunkuKlienta;
	}

	public int getSumaZakupionychTowarów() {
		return sumaZakupionychTowarów;
	}

	public void setSumaZakupionychTowarów(int sumaZakupionychTowarów) {
		this.sumaZakupionychTowarów = sumaZakupionychTowarów;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "BankStatement [historiaRachunkuKlienta=" + (historiaRachunkuKlienta != null
				? historiaRachunkuKlienta.subList(0, Math.min(historiaRachunkuKlienta.size(), maxLen))
				: null) + ", sumaZakupionychTowarów=" + sumaZakupionychTowarów + "]";
	}
}
