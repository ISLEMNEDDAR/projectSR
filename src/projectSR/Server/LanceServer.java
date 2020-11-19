package projectSR.Server;

import projectSR.Commun.Commun;
import projectSR.Server.Dao.DataBase;
import projectSR.Server.InformationImpl;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.sql.SQLException;

public class LanceServer {
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			new DataBase();
			System.out.println("Mise en place du Security Manager ...");
			InformationImpl informationImpl = new InformationImpl();
			//String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/TestRMI";
			String url = Commun.rmiUrlReturn(InetAddress.getLocalHost().getHostAddress(),"/TestRMI");
			System.out.println("Enregistrement de l'objet avec l'url : " + url);
			Naming.rebind(url, informationImpl);
			System.out.println("Serveur lancé");
		} catch (RemoteException | MalformedURLException | UnknownHostException | SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
