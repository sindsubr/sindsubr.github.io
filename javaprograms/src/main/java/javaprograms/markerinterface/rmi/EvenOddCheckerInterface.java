package javaprograms.markerinterface.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * 
 * @author sindu
 * 
 * https://www.scaler.com/topics/marker-interface-in-java/
 *
 */
public interface EvenOddCheckerInterface extends Remote {
    // checkEvenOdd() -> Function declaration 
    public Boolean checkEvenOdd(int no)throws RemoteException;  
}  