package rmi.server;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

import rmi.server.output.BankStatement;
import rmi.server.output.Bill;
import rmi.server.output.NoSuchClientException;

public class BankServerImpl implements BankServer {
	private HashMap<String, ArrayList<Bill>> historiaRachunk�wWszystkichKlient�w = new HashMap<>();;
	
	@Override
	public synchronized boolean payBill(Bill bill) throws RemoteException {
		if (!historiaRachunk�wWszystkichKlient�w.containsKey(bill.getIdentyfikatorKlienta())) {
			ArrayList<Bill> historiaRachunkuKlienta = new ArrayList<>();
			historiaRachunkuKlienta.add(bill);
			historiaRachunk�wWszystkichKlient�w.put(bill.getIdentyfikatorKlienta(), historiaRachunkuKlienta);
		} else {
			historiaRachunk�wWszystkichKlient�w.get(bill.getIdentyfikatorKlienta()).add(bill);
		}
		
		return true;
	}

	@Override
	public synchronized BankStatement getBankStatement(String identyfikatorKlienta) throws RemoteException, NoSuchClientException {
		if (historiaRachunk�wWszystkichKlient�w.containsKey(identyfikatorKlienta)) {
			int sumaZakupionychTowar�w = 0;
			
			for (Bill b : historiaRachunk�wWszystkichKlient�w.get(identyfikatorKlienta)) {
				sumaZakupionychTowar�w += b.getIlo��Towaru();
			}
			
			return new BankStatement(historiaRachunk�wWszystkichKlient�w.get(identyfikatorKlienta), sumaZakupionychTowar�w);
		} else {
			throw new NoSuchClientException("Podany identyfikator klienta '" + identyfikatorKlienta + "' nie posiada historii rachunku.");
		}
	}
	
}
