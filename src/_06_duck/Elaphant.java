package _06_duck;

public class Elaphant {
public static void main(String[] args) {
Elaphant c = new Elaphant(8,1);	
c.printAmtLegs();
}
int amountOfLegs;
int amountOfEars;
	Elaphant(int amountOfLegs, int amountOfEars){
	this.amountOfLegs = amountOfLegs;
	this.amountOfEars = amountOfEars;

}
	public void printAmtLegs() {
	System.out.println(amountOfLegs);
}
}
