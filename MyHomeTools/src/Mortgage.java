public class Mortgage {
    private Double homeCost;
    private final Double downPayment;
    private Double principal;
    private Double interestRate;
    private final Integer loanTermYears;

    public Mortgage(double homeCost, double downPayment, double interestRate, Integer loanTermYears) {
        this.homeCost = homeCost;
        this.downPayment = downPayment;
        this.interestRate = interestRate;
        this.loanTermYears = loanTermYears;
    }

    public Mortgage() {
        this.homeCost = 400000.00;
        this.downPayment = 80000.00;
        this.interestRate = .06;
        this.loanTermYears = 30;
    }

    public double getHomeCost() {
        return homeCost;
    }

    public void setHomeCost(Double homeCost) {
        this.homeCost = homeCost;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(Double homeCost) {
        this.homeCost = homeCost;
    }

    public void principalCalc() {
        this.principal = homeCost - downPayment;
    }

    public double getPrincipal() {
        return this.principal;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getLoanTermYears() {
        return loanTermYears;
    }

    public Integer convertLoanTermToMonths() {
        return loanTermYears * 12;
    }

    public double mortgageCalc() {
        // M = P[i(1+i)^n] / [(1+i)^n-1}
        //P =principal loan amount
        //i = monthly interest rate
        //n = number of months to repay the loan
        double monthlyPayment;

        principalCalc();
        monthlyPayment = (principal * (interestRate / 12) * (Math.pow(1 + (interestRate / 12), convertLoanTermToMonths())))
                / (Math.pow(1 + (interestRate / 12), convertLoanTermToMonths())) - 1;
        return monthlyPayment;
    }

    public String toString() {
        return "Home Cost: "
                + this.homeCost
                + "\n"
                + "Down Payment: "
                + this.downPayment
                + "\n"
                + "Interest Rate: "
                + this.interestRate
                + "\n"
                + "Loan Term (in years): "
                + this.loanTermYears;
    }
}
