import java.util.Scanner;

public class MyHomeTools {

    public static void main(String[] args) {
        //Continuous running
        Scanner in;
        in = new Scanner(System.in);
        while (true){
            //displays the options
            System.out.println("##### HOME SCREEN #####");
            options();
            boolean homeMod = true;
            String input = in.nextLine().toLowerCase();

            while (homeMod) {
                Mortgage mortgage = new Mortgage();
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
                    case "view":
                        System.out.println(mortgage);
                    case "exit":
                        System.out.println("Exiting to home screen");
                        homeMod = false;
                        break;
                  default:
                        break;
                }
            }
        }



    }
    public static void options(){
        System.out.println("##### OPTIONS #####");
        System.out.println("homecost");
        System.out.println("opt");
    }
}
