public class Savings {
    private double savings;
    private double saveRateMonthly;

    public Savings(double savings, double saveRateMonthly){
        this.savings = savings;
        this.saveRateMonthly = saveRateMonthly;
    }
    public Savings(){
        this.savings = 0.00;
        this.saveRateMonthly = 0.00;
    }

    public void increaseSaveRate(Double rateIncrease){
        this.saveRateMonthly += rateIncrease;
    }

    public double getSaveRateMonthly() {
        return saveRateMonthly;
    }

    public double getSavings() {
        return savings;
    }
    public String calcRateToGoal(int savingsGoal){
        double rate = (double) savingsGoal / saveRateMonthly;
        return "You will reach your savings goal of "
                + savingsGoal
                + " after "
                + rate
                + " months by saving "
                + saveRateMonthly;
    }
    public String toString(){
        return "Current Savings: "
                + this.savings
                + "\n"
                + "Est. Monthly Savings: "
                + this.saveRateMonthly;
    }
}
