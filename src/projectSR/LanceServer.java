package projectSR;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class LanceServer {

	  public static void main(String[] args) {
	    try {
	      LocateRegistry.createRegistry(1099);

	      System.out.println("Mise en place du Security Manager ...");
	    

	      InformationImpl informationImpl = new InformationImpl();

	      String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/TestRMI";
	      System.out.println("Enregistrement de l'objet avec l'url : " + url);
	      Naming.rebind(url, informationImpl);

	      System.out.println("Serveur lanc�");
	    } catch (RemoteException e) {
	      e.printStackTrace();
	    } catch (MalformedURLException e) {
	      e.printStackTrace();
	    } catch (UnknownHostException e) {
	      e.printStackTrace();
	    }
	  }
	}