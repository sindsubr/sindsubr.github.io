package javaprograms.oops;

public class EncapsulationExample {

	
	public static void main(String args[]) {
		Public publicObj = new Public();
		publicObj.variable = "Publicly assigned Variable -->The access modifier is public";
		System.out.println(publicObj.variable);

		Private privateObj = new Private();
		privateObj.setVariable(
				"Variable is private and so we need a method to set the variable -->The access modifier is private");
		System.out.println(publicObj.getVariable());

		Protected protectedObj = new Protected();
		protectedObj.variable = "Publicly assigned Variable -->The access modifier is protected accessed within same package";
		System.out.println(protectedObj.variable);
	}
}
