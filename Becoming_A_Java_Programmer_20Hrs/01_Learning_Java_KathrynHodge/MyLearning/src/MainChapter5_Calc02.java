import java.util.Scanner;

public class MainChapter5_Calc02 {

    public static double calcTotalMealPrice(double listedMealPrice,
                                            double tipRate,
                                            double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("How much did was the meal?");
        Scanner getX = new Scanner(System.in);
        double x = getX.nextDouble();

        System.out.println("What percent do you tip?");
        Scanner getY = new Scanner(System.in);
        double y = getY.nextDouble();

        System.out.println("How much is the meal taxed?");
        Scanner getZ = new Scanner(System.in);
        double z = getZ.nextDouble();

        double groupTotalMealPrice =  calcTotalMealPrice(x, y, z);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);

    }
}