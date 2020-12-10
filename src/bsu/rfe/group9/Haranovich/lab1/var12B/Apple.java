package bsu.rfe.group9.Haranovich.lab1.var12B;

public class Apple extends Food{
	private String size;
	public Apple(String size) {
		super("apple");
		this.size = size;
	}
	public void Consume() {
		System.out.println(this + "eaten");
	}
	
	public double calculateCalories() {
		if (this.size.equals("Big"))
			return 150.0;
		else if (this.size.equals("Medium"))
			return 100.0;
		else if (this.size.equals("Small"))
			return 50.0;
		else return 0;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) 
            	return false;
            return size.equals(((Apple)arg0).size); 
        } else
            return false;
    }
    public String toString() {
    	return super.toString() + "of size: '" + size.toUpperCase() + "'";
    }

}