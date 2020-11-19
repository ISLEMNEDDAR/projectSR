package projectSR.Commun;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class Commun {
    //InetAddress.getLocalHost().getHostAddress()
    //"/TestRMI"
    static String rmiUrl = "rmi://";

    public static Remote lookup(String hostAdresse,String link) throws RemoteException, NotBoundException, MalformedURLException {
        return Naming.lookup(rmiUrlReturn(hostAdresse,link));
    }

    public static String rmiUrlReturn(String hostAdresse,String link){
        return ""+rmiUrl + hostAdresse + link+"";
    }
}
