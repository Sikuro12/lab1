package bsu.rfe.group9.Haranovich.lab1.var12B;

public class Cheese extends Food{
	public Cheese() {
        super("Cheese");
    }
    public void Consume() {
        System.out.println(this + " eaten");
    }
    public double calculateCalories() {
        return 300.0;
    }

}