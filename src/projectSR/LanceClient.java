package projectSR;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class LanceClient {

	  public static void main(String[] args) throws UnknownHostException {
	    System.out.println("Lancement du client");
	   
	    try {
	      Remote r = Naming.lookup("rmi://" + InetAddress.getLocalHost().getHostAddress() + "/TestRMI");
	      System.out.println(r);
	      if (r instanceof Information) {
	        String s = ((Information) r).getInformation();
	        System.out.println("chaine renvoyee = " + s);
	      }
	    } catch (MalformedURLException e) {
	      e.printStackTrace();
	    } catch (RemoteException e) {
	      e.printStackTrace();
	    } catch (NotBoundException e) {
	      e.printStackTrace();
	    }
	    System.out.println("Fin du client");
	  }
	}
