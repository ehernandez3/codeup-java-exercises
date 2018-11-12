public class RestaurantTest {
    public static void main (String[] arg) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 30;
        dish.nameOfDish = "Pizza";
        dish.wouldRecommend = true;
        System.out.println(dish.costInCents);
        System.out.println(dish.nameOfDish);
        System.out.println(dish.wouldRecommend);
        dish.eat();
    }


}
