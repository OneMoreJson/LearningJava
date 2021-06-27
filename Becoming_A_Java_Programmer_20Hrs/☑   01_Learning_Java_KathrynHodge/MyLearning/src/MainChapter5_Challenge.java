// Input 1: number of hours the employee works per week
// Input 2: amount of money the employee makes per hour
// Output employee's gross yearly salary
// Bonus: Add an hours for employee vacation time

import java.util.Scanner;

public class MainChapter5_Challenge {

    public static double weeksPayFunc(double weekHours,
                                      double wage) {
        if (weekHours < 0) {
            return -1;
        }

        if (wage < 0) {
            return -1;
        }

        double weeksPayResult = weekHours * wage;
        return weeksPayResult;
    }

    public static void main(String[] args) {
        System.out.println("How many hours did you work this week?");
        Scanner getX = new Scanner(System.in);
        double x = getX.nextDouble();

        System.out.println("How much do you get paid per hour?");
        Scanner getY = new Scanner(System.in);
        double y = getY.nextDouble();

        System.out.println("How many vacation days did you take?");
        Scanner getZ = new Scanner(System.in);
        int z = getZ.nextInt();

        double weeksPay = weeksPayFunc(x, y);
        int vacationDaysLeft = 8 - z;

        System.out.println("After working " + x + " hours " + " you will receive $" + weeksPay + ".  You also have " + vacationDaysLeft + " days of vacation left.");

    }
}