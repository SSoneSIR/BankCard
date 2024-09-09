
/**
 * Write a description of class DebitCard here.
 *
 * @Yashaswan Gautam
 * @1/7/2023 (a version number or a date)
 */
public class DebitCard extends BankCard
{
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    /**Constructor for DebitCard**/
    public DebitCard(double cardID, String issuerBank, String bankAccount, int balanceAmount,int pinNumber)
    {
        super(cardID, issuerBank, bankAccount, balanceAmount);                            //calling parameters of constructor BankCard from super class
        this.pinNumber=pinNumber;
        this.hasWithdrawn=false;
    }
    // creating accesor method for attributes
    public int getPinNumber()
    {
        return this.pinNumber;
    }

    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }

    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }

    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    //mutator method for withdrawal amount.
    public double setWithdrawalAmount()
    {
        return this.withdrawalAmount=withdrawalAmount;
    }

    public void withdrawn(int withdrawalAmount,String dateOfWithdrawal,int pinNumber)
    {
        if(pinNumber == this.pinNumber )
        {
            if(withdrawalAmount< getBalanceAmount())
                super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
            this.withdrawalAmount=withdrawalAmount;
            this.dateOfWithdrawal=dateOfWithdrawal;
            this.hasWithdrawn=true;
            System.out.println("Amount withdrawing successfull !");
            System.out.println("After Withdrawal Balance= " +getBalanceAmount());
        }
        else 
        {
            System.out.println("The pin number you've entered is incorrect or the balance amount is insuffiecient.");
        } 
    }
    public void display(){
        if(hasWithdrawn=true){
        super.display();
            System.out.println("Date of withdrawal: " +this.dateOfWithdrawal);
            System.out.println("Entered pin number: " +this.pinNumber);
            System.out.println("Amount withdrawn: " +this.withdrawalAmount); 
        }else{
            System.out.println("The balance amount is " +getBalanceAmount());
        }
    }
}
 