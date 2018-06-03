package rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import rmi.server.output.BankStatement;
import rmi.server.output.Bill;
import rmi.server.output.NoSuchClientException;

public interface BankServer extends Remote {
	
	public boolean payBill(Bill bill) throws RemoteException;
	public BankStatement getBankStatement(String identyfikatorKlienta) throws RemoteException, NoSuchClientException;
}
