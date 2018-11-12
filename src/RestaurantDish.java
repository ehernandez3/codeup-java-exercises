public class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    private void eat () {
    System.out.println("Nom nom nom!");

    }
    public int getCostInCents() {
        return this.costInCents;
        }
    public void setCostInCents(int cents) {
        this.costInCents = cents ;
    }

    public String getNameOfDish() {
        return this.nameOfDish;
    }

    public void setNameOfDish(String name) {
        this.nameOfDish = name;
    }

    public boolean getWouldRecommend() {
        return this.wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public void getEat() {
        eat();
    }
    

//    private String myField; //"private" means access to this is restricted
//
//    public String getMyField()
//    {
//        //include validation, logic, logging or whatever you like here
//        return this.myField;
//    }
//    public void setMyField(String value)
//    {
//        //include more logic
//        this.myField = value;
//    }



//-- SHORT ASSIGNMENT #2 (part 2) --
//    Refactor your RestaurantDish and RestaurantTest classes...
//      1) Change your public properties in your RestaurantDish class to private
//      2) Add getters and setters for these properties (write them manually then
//          erase them and use IntelliJ to do this quickly)
//      3) Refactor code used in RestaurantTest to set and print these property values...
//            ...to use your getters and setters
//      4) Add a constructor method to RestaurantDish that will assign property...
//            ...values based on arguments passed into the constructor




}
