package projectSR.Client;

import projectSR.Commun.Commun;
import projectSR.Server.InformationInf;
import projectSR.Server.Model.Formation;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class LanceClient {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println("Lancement du client");
		try {
			//Remote r = Naming.lookup("rmi://" + InetAddress.getLocalHost().getHostAddress() + "/TestRMI");
			Remote r = Commun.lookup(InetAddress.getLocalHost().getHostAddress(),"/TestRMI");
			if (r instanceof InformationInf) {
				InformationInf infoService = (InformationInf) r;
				//Formation formation = infoService.min_motivation_formation();
				int nombreSiteZeroPersonnelInfo = infoService.sites_sans_personnel();
				//System.out.println("chaine renvoyee = " + formation.getNom_formation());
				System.out.println("chaine renvoyee = " + nombreSiteZeroPersonnelInfo);
			}
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		System.out.println("Fin du client");
	}
}
