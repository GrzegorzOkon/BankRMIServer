package rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.security.AccessControlException;

public class BankServerApp {
    public static void main(String[] b){
        boolean err = false;
        int registryPort = 8001;
        try{
             LocateRegistry.createRegistry(registryPort);
             BankServer server = new BankServerImpl();
             UnicastRemoteObject.exportObject(server, 0);
             Naming.rebind("//localhost:"+registryPort+"/bServer", server);           
        }
        catch(java.rmi.UnknownHostException uhe){
             System.out.println("[error] podana nazwa hosta nie jest \n identyfikatorem tego komputera\n"+uhe+"\n");
             err = true;
        }
        catch(AccessControlException ace){
             System.out.println("[error] nie masz uprawnien aby uruchomic serwer\n na tym porcie dla podanej nazwy hosta\n"+ace+"\n");
             err = true;
        }
        catch(RemoteException re){
             System.out.println("[error] nie uda³o siê zarejestrowaæ \n zdalnego obiektu serwera\n"+re+"\n");
             err = true;
        }
        catch(MalformedURLException mURLe){
             System.out.println("[error] wewnêtrzny b³¹d" + mURLe+"\n");
             err = true;
        }
        catch(Exception ee){
             System.out.println("[error] cccc"+ee.getMessage()+"\n");
             err = true;
        }
        if(!err)
            System.out.println("\n[OK] Bank server running...\n");
                  
   }
}
