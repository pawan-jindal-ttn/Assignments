package Ques6;

class Bank {
    protected String Name, headofficeAddress, chairmanName;
    protected int branchCount;
    protected double fdInterestRate, personalLoanInterestRate, homeLoanInterestRate;

//    contructor
    public Bank(String Name,String headofficeAddress, String chairmanName, int branchCount,
                double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate){
        this.Name = Name;
        this.headofficeAddress = headofficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
//    getter and setters
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }

    public void setHeadofficeAddress(String headofficeAddress){
        this.headofficeAddress = headofficeAddress;
    }
    public String getHeadofficeAddress(){
        return this.headofficeAddress;
    }

    public void setChairmanName(String chairmanName){
        this.chairmanName = chairmanName;
    }
    public String getChairmanName(){
        return this.chairmanName;
    }

    public void setBranchCount(int branchCount){
        this.branchCount = branchCount;
    }
    public int getBranchCount(){
        return this.branchCount;
    }

    public void setFdInterestRate(double fdInterestRate){
        this.fdInterestRate = fdInterestRate;
    }
    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate){
        this.personalLoanInterestRate = personalLoanInterestRate;
    }
    public double getPersonalLoanInterestRate(){
        return personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate){
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    public double getHomeLoanInterestRate(){
        return homeLoanInterestRate;
    }

    public String toString() {
        return "Base class";
    }
}

class SBI extends Bank{
    public SBI(){
        super("Ques6.SBI", "Mumbai", "Aman",
                500, 7.5, 6.5, 6);
    }
    @Override
    public String toString(){
            return "Ques6.Bank Name: " + Name +
                    "\nHead Office Address: " + headofficeAddress +
                    "\nChairman: " + chairmanName +
                    "\nBranch Count: " + branchCount +
                    "\nFD Interest Rate: " + fdInterestRate  +
                    "\nPersonal Loan Interest Rate: " + personalLoanInterestRate +
                    "\nHome Loan Interest Rate: " + homeLoanInterestRate;
        }
}


class BOI extends Bank{
    public BOI(){
        super("Ques6.BOI", "New Delhi", "Rohan",
                300, 10.5, 8.5, 7);
    }
    @Override
    public String toString(){
        return "Ques6.Bank Name: " + Name +
                "\nHead Office Address: " + headofficeAddress +
                "\nChairman: " + chairmanName +
                "\nBranch Count: " + branchCount +
                "\nFD Interest Rate: " + fdInterestRate  +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate;
    }
}
class ICICI extends Bank{
    public ICICI(){
        super("Ques6.ICICI", "Mumbai", "Keshav", 100, 4.5, 5.5, 6);
    }
    @Override
    public String toString(){
        return "Ques6.Bank Name: " + Name +
                "\nHead Office Address: " + headofficeAddress +
                "\nChairman: " + chairmanName +
                "\nBranch Count: " + branchCount +
                "\nFD Interest Rate: " + fdInterestRate  +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate;
    }
}

public class BankingSystem{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        BOI boi = new BOI();
        ICICI icici = new ICICI();

        System.out.println(sbi);
        System.out.println();
        System.out.println(icici);
        System.out.println();
        System.out.println(boi);
    }
}