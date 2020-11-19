package projectSR.Server;

import projectSR.Server.Model.Formation;
import projectSR.Server.Model.Personnel;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface InformationInf extends Remote {
	public Formation min_motivation_formation() throws RemoteException;
	public int sites_sans_personnel() throws RemoteException;
}