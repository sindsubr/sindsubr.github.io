package javaprograms.markerinterface.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EvenOddCheckerRemote extends UnicastRemoteObject implements EvenOddCheckerInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Constructor
    EvenOddCheckerRemote() throws RemoteException {
        super();  
    }

    public Boolean checkEvenOdd(int no) {
        // If no gives a remainder of 0 when divided by 2, then it is an even number, else it is an odd number
        if(no % 2 == 0){
            return true;
        }
        return false;
    }  
}
