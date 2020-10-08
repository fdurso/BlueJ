
/**
 * Write a description of class BudgetCalculator here.
 *
 * @author Frank D'Urso
 * @version 9/28/20
 */
public class BudgetCalculator
{
    public BudgetCalculator()
    {
        double hourlyRate = 14.25;
        //Dunkin Donuts shift leader (my job)
        int monthlyRent = 1829;
        //https://www.zillow.com/b/woodview-at-legacy-farms-hopkinton-ma-5XqyV5/#unit-2078070880
        int monthlyCarPayment = 160;
        //2020 Kia Forte (my car payment)
        int monthlyGymMembership = 10;
        //https://www.planetfitness.com/gyms/milford-main-st-ma/offers?q=01748
        int monthlyCellPayment = 105;
        //https://www.t-mobile.com/cell-phone-plans
        
        double income = 40 * 4 * hourlyRate;
        double expenses = (double)(monthlyRent + monthlyCarPayment + monthlyGymMembership + monthlyCellPayment);
        double savings = (double)(income - expenses);
        
        System.out.println("Income: " + String.format("%.2f", income));
        System.out.println("Total Expenses: " + String.format("%.2f", expenses));
        System.out.println("Savings: " + String.format("%.2f", savings));
    }
}
