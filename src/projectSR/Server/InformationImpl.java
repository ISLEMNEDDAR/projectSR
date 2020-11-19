package projectSR.Server;

import projectSR.Server.Enum.Sujet;
import projectSR.Server.Model.Formation;
import projectSR.Server.Model.Personnel;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InformationImpl extends UnicastRemoteObject implements InformationInf {
	private static final long serialVersionUID = 2674880711467464646L;
	protected InformationImpl() throws RemoteException {
		super();
	}

	@Override
	public Formation min_motivation_formation() throws RemoteException {
		return new Formation("formation1",Sujet.achats,new Date(),2.23,4.32,"islem","abdesllam");
	}

	@Override
	public int sites_sans_personnel() throws RemoteException {
		return 0;
	}
}