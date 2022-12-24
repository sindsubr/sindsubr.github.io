package javaprograms.markerinterface.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
	  public static void main(String args[]) {
	    try{  
	      // Create an instance of EvenOddCheckerRemote
	      EvenOddCheckerInterface stub = new EvenOddCheckerRemote();  
	      System.out.println("Server Started...");  
	      // Creating registry to start the server
	      LocateRegistry.createRegistry(52345);
	      // Binding the object with the url so that it can be accessed by the client
	      Naming.rebind("rmi://localhost:52345/check",stub);
	    }  
	    catch(Exception e) {
	      System.out.println(e);  
	    }  
	  }  
	}  