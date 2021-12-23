import java.util.Scanner;

public class MyHomeTools {

    public static void main(String[] args) {
        //Continuous running
        Scanner in;
        in = new Scanner(System.in);
        while (true) {
            //displays the options
            System.out.println("##### HOME SCREEN #####");
            options();
            boolean homeMod = true;


            while (homeMod) {
                String input = in.nextLine().toLowerCase();
                Mortgage mortgage = new Mortgage();
                Savings savings = new Savings(1000, 200);
                switch (input) {
                    case "homecost":
                        System.out.println("Cost of home?");
                        Double homeCostInput = Double.parseDouble(in.nextLine());
                        System.out.println("Downpayment amount?");
                        Double downpaymentInput = Double.parseDouble(in.nextLine());
                        System.out.println("Interest Rate?");
                        Double interestRateInput = Double.parseDouble(in.nextLine());
                        System.out.println("How long in years? 30 or 15");
                        Integer loanTermInput = Integer.valueOf(in.nextLine());
                        mortgage = new Mortgage(homeCostInput, downpaymentInput, interestRateInput, loanTermInput);
                        System.out.println(mortgage);
                        break;
                    case "mp":
                    case "monthlypayment":
                        System.out.println("Est. Monthly Payment: " + mortgage.mortgageCalc());
                        double homeCost = mortgage.getHomeCost();
                        for (int i = 0; i < 5; i++){

                            switch (i){
                                case 1:
                                    mortgage.setHomeCost(homeCost - 100000);
                                    System.out.println("Making a 100000 payment would make your monthly payment: " + mortgage.mortgageCalc());
                                    break;
                                case 2:
                                    mortgage.setHomeCost(homeCost - 50000);
                                    System.out.println("Making a 50000 payment would make your monthly payment: " + mortgage.mortgageCalc());

                                    break;
                                case 3:
                                    mortgage.setHomeCost(homeCost - 25000);
                                    System.out.println("Making a 25000 payment would make your monthly payment: " + mortgage.mortgageCalc());

                                    break;
                                case 4:
                                    mortgage.setHomeCost(homeCost - 10000);
                                    System.out.println("Making a 1000 payment would make your monthly payment: " + mortgage.mortgageCalc());

                                    break;
                                case 5:
                                    mortgage.setHomeCost(homeCost -  1000);
                                    System.out.println("Making a 1000 payment would make your monthly payment: " + mortgage.mortgageCalc());

                                    break;
                                default:
                                        break;
                            }
                        }
                        break;
                    case "opt":
                        options();

                    case "goals":
                        System.out.println(savings.calcRateToGoal(5000));
                        break;
                    case "view":
                        System.out.println(mortgage);
                        break;
                    case "exit":
                        System.out.println("Exiting to home screen");
                        homeMod = false;
                        break;
                    default:
                        System.out.println("Invalid Input.");
                        options();
                        break;
                }
            }
        }


    }

    public static void options() {
        System.out.println("##### OPTIONS #####");
        System.out.println("homecost");
        System.out.println("opt");
    }
}
