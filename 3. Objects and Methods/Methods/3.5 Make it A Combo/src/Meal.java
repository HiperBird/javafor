public class Meal
{
    //Instance attributes//
    private String name;
    private double cost;

    //Class constructor//
    public Meal(String food, double price)
    {
        name = food;
        cost = price;
    }
    public void makeItACombo() {
        this.name = name + " with fries and soda";
        this.cost = cost+3;
    }
    public String getBill() {
        return (this.name + ", $" + this.cost);
    }
    //Instance methods//
    // Complete the method makeItACombo
    // Complete the method getBill

}