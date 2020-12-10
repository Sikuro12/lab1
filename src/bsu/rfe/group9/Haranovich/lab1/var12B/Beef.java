package bsu.rfe.group9.Haranovich.lab1.var12B;

public class Beef extends Food{
	private String preparedness;
	
	public Beef(String preparedness) {
		super("Beef");
		this.preparedness = preparedness;
	}
	public void Consume() {
		System.out.print(this + " eaten \n");
	}
	public double calculateCalories() {
		if(this.preparedness.equals("Good"))
			return 300.0;
		else if (this.preparedness.equals("Medium"))
			return 150.0;
		else if (this.preparedness.equals("With blood"))
			return 75.0;
		else return 0.0;
	}
	
	public String getPreparedness() {
		return preparedness;
	}
	
	public void setPreparedness(String preparedness) {
		this.preparedness = preparedness;
	}
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if(!(arg0 instanceof Beef)) 
				return false;
			return preparedness.equals(((Beef)arg0).preparedness);
		} else return false;
	}

	public String toString() {
		return super.toString() + " prepared '" + preparedness.toUpperCase() + "'";
 	}
}