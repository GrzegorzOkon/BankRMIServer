package rmi.server;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

import rmi.server.output.BankStatement;
import rmi.server.output.Bill;
import rmi.server.output.NoSuchClientException;

public class BankServerImpl implements BankServer {
	private HashMap<String, ArrayList<Bill>> historiaRachunkówWszystkichKlientów = new HashMap<>();;
	
	@Override
	public synchronized boolean payBill(Bill bill) throws RemoteException {
		if (!historiaRachunkówWszystkichKlientów.containsKey(bill.getIdentyfikatorKlienta())) {
			ArrayList<Bill> historiaRachunkuKlienta = new ArrayList<>();
			historiaRachunkuKlienta.add(bill);
			historiaRachunkówWszystkichKlientów.put(bill.getIdentyfikatorKlienta(), historiaRachunkuKlienta);
		} else {
			historiaRachunkówWszystkichKlientów.get(bill.getIdentyfikatorKlienta()).add(bill);
		}
		
		return true;
	}

	@Override
	public synchronized BankStatement getBankStatement(String identyfikatorKlienta) throws RemoteException, NoSuchClientException {
		if (historiaRachunkówWszystkichKlientów.containsKey(identyfikatorKlienta)) {
			int sumaZakupionychTowarów = 0;
			
			for (Bill b : historiaRachunkówWszystkichKlientów.get(identyfikatorKlienta)) {
				sumaZakupionychTowarów += b.getIloœæTowaru();
			}
			
			return new BankStatement(historiaRachunkówWszystkichKlientów.get(identyfikatorKlienta), sumaZakupionychTowarów);
		} else {
			throw new NoSuchClientException("Podany identyfikator klienta '" + identyfikatorKlienta + "' nie posiada historii rachunku.");
		}
	}
	
}
