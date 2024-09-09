
/**
 * The BankCard class has five attributes, which correspond to the card Id, client 
name, issuer bank, bank account, and BalanceAmount. The client name,issuer bank are each represented as a string of text and Card ID, and balance amount as a 
number. 
The constructor accepts four parameters which are, balance amount, card Id, bank account, issuer bank. The attributes client name is initialized to an empty 
string. Additionally, assign balance amount, card  Id, bank account, issuer bank with the parameter values.
Each attribute has a corresponding accessor method. 
A method is required to set the client name. The method accepts a new client name as a parameter. The parameter value is then assigned to the attribute client 
name.
A display method should output (suitably annotated) the card Id, client name, issuer bank, bank account, and BalanceAmount. If the client name is not assigned, 
display a suitable message.
 *
 * @Yashaswan Gautam
 * 1/5/2023
 */
public class BankCard
{
    private  double cardID;
    private  String clientName;
    private  String issuerBank;
    private  String bankAccount;
    private int balanceAmount;
    /**Constructor for BankCard**/
    public BankCard(double cardID, String issuerBank, String bankAccount, int balanceAmount  )                      //creating constructor for bank card
    {
        this.cardID=cardID;
        this.clientName="";
        this.issuerBank=issuerBank;
        this.bankAccount=bankAccount;
        this.balanceAmount=balanceAmount;
    }
    //accessor method for all attributes of BankCard
    public double getCardID ()
    {
        return this.cardID;
    }

    public String getIssuerBank()
    {
        return this.issuerBank;
    }

    public String getBankAccount()
    {
        return this.bankAccount;
    }

    public int getBalanceAmount()
    {
        return this.balanceAmount;
    }

    public String getClientName()
    {
        return this.clientName;
    }
    //mutator method for client name 
    public String setClientName(String clientname)
    {
        return this.clientName = clientname;
    }

    public int setBalanceAmount(int balanceAmount)
    {
        return this.balanceAmount=balanceAmount;
    }

    public  void display()
    {
        
        if (clientName.equals(""))
        {
            System.out.println("Clients's name hasn't been assigned yet.");

        }else
        {
            System.out.print("Dear valued customer," +clientName+ " having card ID of ");   
            System.out.print(cardID+ ",from ");
            System.out.print(issuerBank+ "Bank,Kathmandu, Nepal and ");
            System.out.print(bankAccount+ " as account type' balance is ");
            System.out.print(balanceAmount+". Thank you!");
        }
    }
}

