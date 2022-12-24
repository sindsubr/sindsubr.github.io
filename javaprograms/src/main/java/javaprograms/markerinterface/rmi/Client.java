package javaprograms.markerinterface.rmi;

import java.rmi.Naming;

public class Client {
	public static void main(String args[]) {
		try {
                        // Extracting the number from the arguments passed and converting it to integer
			int no = Integer.parseInt(args[0]);
                        // Accessing the binded object from the url
			EvenOddCheckerInterface stub = (EvenOddCheckerInterface) Naming.lookup("rmi://localhost:52345/check");  
			if(stub.checkEvenOdd(no)){
				System.out.println("Even");
			}
			else{
				System.out.println("Odd");	
			}
		}  
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
