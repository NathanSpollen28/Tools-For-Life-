import java.util.Scanner;
public class MonthlyBudget{
    public static void main(String[]args){
        double budget,rent,insurance,groceries,petrol,electric,gas,subscriptions,savings;
        int repeat = 1;
        
        Scanner scanner = new Scanner (System.in);
        while(repeat == 1){
        System.out.print("Whats your budget?:£ ");
        budget = scanner.nextDouble();
        System.out.print("How much is your rent?:£ ");
        rent = scanner.nextDouble();
        System.out.print("How much is your insurance?:£ ");
        insurance = scanner.nextDouble();
        System.out.print("How much is your groceries?:£ ");
        groceries = scanner.nextDouble();
        System.out.print("How much is you petrol?:£ ");
        petrol = scanner.nextDouble();
        System.out.print("How much is your electric?:£ ");
        electric = scanner.nextDouble();
        System.out.print("How much is your gas?:£ ");
        gas = scanner.nextDouble();
        System.out.print("How much is your subscriptions?:£ ");
        subscriptions = scanner.nextDouble();
        System.out.print("What are you saving?:£ ");
        savings = scanner.nextDouble();
       
        


      
        

        calculateExpenses(budget,rent, insurance, groceries, petrol, electric, gas, subscriptions, savings);

        System.out.print("Do you want to repeat the process? (1 for yes 0 for no.)");
        repeat = scanner.nextInt();
        scanner.close();
        }
        

    

    


        }
        public static void calculateExpenses(double budget,double rent, double insurance, double groceries, double petrol,double subscriptions, double electric, double gas, double savings){
            double totalExpenses = rent + insurance + groceries + petrol + electric + gas + savings + subscriptions;
            System.out.println("Your total expenses are: " + totalExpenses);
            if(totalExpenses > budget){
                System.out.println("You are over budget by: £ " + (totalExpenses - budget));
            } else if (totalExpenses < budget) {
                System.out.println("You are under budget by: £ " + (budget - totalExpenses));
            } else {
                System.out.println("You are exactly on budget!");
            }
    }
}
