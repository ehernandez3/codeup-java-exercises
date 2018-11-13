public class BurgerTester {
    public static void main (String[] arg) {
        BurgerTools.mostPopularTopping = "bacon";
        BurgerTools.averageDaysBeforeExpiration = 5;
        BurgerTools.temperatureWhenCooked = 325;
        System.out.println(BurgerTools.mostPopularTopping);
        BurgerTools.grill();
    }
}
