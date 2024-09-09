
/**
The Credit Card class is a subclass of Bank Card class and has six
attributes:
CVC number- an integer
Credit Limit- a double
Interest Rate - a double
Expiration Date - a String of characters
Grace Period - an integer
isGranted - either true or false (boolean)
The constructor accepts eight parameters which are card Id, client name,issuerbank, bank account, BalanceAmount, CVC number, Interest rate,ExpirationDate. A call is made to the superclass constructor with 
four parameters and asetter method. Additionally, in the constructor, assign CVCnumber, Interest rate,Expiration Date with the parameter values. Theattribute:, isGranted is set to false.
Each attribute has a corresponding accessor method.
A method is required to set the credit limit as each client can have different credit limits. The method accepts a new credit limit, and new Grace Period as a parameter and, if the credit limit is less than
or equal to 2.5 times the balance amount, then only the credit is granted to the client as new values are assigned to each attribute. Likewise, the status of isGranted is set to true. If the credit has not
been granted to the client, then a suitable message is output to the user indicating that the credit cannot be issued. There is a method named cancelCreditCard. This method will remove the client’s credit 
card . The attributes CVC number, credit limit and grace period is set to zero. The attribute isGranted is then set to false. A method to display the details of the Credit Card class is required. It must 
have the same signature as the display method in the Bank Card class. If isGranted is set to true, It will call the methodin the Bank Card class to display the card Id, client name, issuer bank, bank 
account, and BalanceAmount. However, if isGranted is set to false, Credit Limit and Grace Period should not be displayed. Each output must be suitably annotated. 
 * @Yashaswan Gautam
 * Version 1.0.0
 */
class CreditCard extends BankCard
{
    private int cVCnumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    /**Constructor for CreditCard**/
    public CreditCard(double cardID,String clientname, String issuerBank,String bankAccount,int balanceAmount,int cVCnumber,double interestRate,String expirationDate)//creating constructor for credit card
    {
        super(cardID, issuerBank, bankAccount, balanceAmount);      //calling parameters of bankcard from constructor
        this.cVCnumber=cVCnumber;
        this.creditLimit=creditLimit;
        this.interestRate=interestRate;
        this.expirationDate=expirationDate;
        this.gracePeriod=gracePeriod;
        this.isGranted=false;
    }
    //accessor method for all attributes:
    public int getCVCNumber(){
        return this.cVCnumber;
    }

    public double getInterestRate(){
        return this.interestRate;
    }

    public String getExpirationDate(){
        return this.expirationDate;
    }

    public boolean getIsGranted(){
        return this.isGranted;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }

    public int getGracePeriod(){
        return this.gracePeriod;
    }

    public boolean setIsGranted(boolean isGranted){
        return this.isGranted=isGranted;
    }
    //mutator method for credit limit and grace period:
    public double setCreditLimit(double creditlimit,int gracePeriod)
    {
        if(creditLimit<=2.5*this.getBalanceAmount())
        {
            this.isGranted=true;
            this.creditLimit=creditlimit;
            this.gracePeriod=gracePeriod;
            System.out.println("Access granted.");
        } else{
            System.out.println("Sorry,the credit hasn't been granted.");
        }
        return this.creditLimit=creditLimit;
    }
    //method to cancel Credit Card
    public void cancelCreditCard(){        
        this.cVCnumber=0;
        this.creditLimit=0;
        this.gracePeriod=0;
        this.isGranted=false;
        System.out.println("Your credit card has been removed and your CVC number is now " +this.cVCnumber+ " ,credit limit is now " +this.creditLimit+ " ,and Grace period is " +this.gracePeriod+ " .Thank you!");
    }
    //method to display bank details or nothing:
    public void display(){            
        if(this.isGranted=true){
            super.display();
        }else{
            System.out.println("Credit Limit and grace period could not be displayed");
        }   
    }        
}

