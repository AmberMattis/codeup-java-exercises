package oopLecture;

public class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public String printSummary(){
        return "Cost: " + costInCents + "\n" + "Name: " + nameOfDish + "\n" + "Recommended: " + wouldRecommend;
    }

}
