import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BankGUI implements ActionListener
{
    JFrame frame;
    JPanel BC,DC,CC;
    JLabel lbEXPDate,lbCreditCard,lbDebitCard,lbBankCard,lbCardID,lbClientName,lbIssuerBank,lbBankaccount,lbBalanceamount,lbPINNumber,lbWithdrawalamount,lbCVCNumber,lbCreditLimit,lbInterestRate,lbGracePeriod,lbDateOfW;
    JButton DebitCard,CreditCard,Display,Clear,Back,AddDC,AddCC,Withdraw,Cancel,SetCreditLimit;
    JTextField tfCardID,tfClientName,tfIssuerBank,tfBankAccount,tfBalanceamount,tfPINNumber,tfWithdrawalamount,tfCVCNumber,tfCreditLimit,tfInterestRate,tfGracePeriod;
    JComboBox CMBDate,EXPDate;
    public BankGUI()
    {
        frame = new JFrame("Bank GUI");

        BC=new JPanel();
        BC.setLayout(null);
        BC.setSize(380,420);

        lbBankCard=new JLabel("Bank Card");
        lbBankCard.setBounds(125,25,165,25);
        lbBankCard.setFont(new Font("serif",Font.PLAIN,26));

        lbCardID=new JLabel("CardID");
        lbClientName=new JLabel("Client Name");
        lbIssuerBank=new JLabel("Issuer Bank");
        lbBankaccount=new JLabel("Bank account");
        lbPINNumber=new JLabel("PINNumber");

        lbCardID.setBounds(35,78,51,41);
        lbClientName.setBounds(35,132,77,21);
        lbIssuerBank.setBounds(35,166,74,41);
        lbBankaccount.setBounds(35,210,85,41);
        lbPINNumber.setBounds(48,254,77,41);

        tfCardID=new JTextField("");
        tfClientName =new JTextField("");
        tfIssuerBank =new JTextField("");
        tfBankAccount =new JTextField("");
        tfPINNumber =new JTextField("");

        tfCardID.setBounds(155,90,180,20);
        tfClientName.setBounds(155,132,180,20);
        tfIssuerBank.setBounds(155,175,180,20);
        tfBankAccount.setBounds(155,220,180,20);
        tfPINNumber.setBounds(155,266,180,20);

        DebitCard=new JButton("Switch to  Debit Card");
        DebitCard.setBounds(200,300,180,20);
        DebitCard.addActionListener(this);

        CreditCard=new JButton("Switch to  Credit Card");
        CreditCard.setBounds(25,300,170,20);
        CreditCard.addActionListener(this);

        Clear=new JButton("Clear");
        Clear.setBounds(25,330,77,20);
        Clear.addActionListener(this);

        Display=new JButton("Display");
        Display.setBounds(275,330,75,20);
        //--------------------------------------------------------------------------------------------------//
        DC=new JPanel();
        DC.setLayout(null);
        DC.setVisible(false);
        DC.setSize(380,420);

        lbDebitCard=new JLabel("Debit Card");
        lbDebitCard.setBounds(125,25,165,25);
        lbDebitCard.setFont(new Font("serif",Font.PLAIN,26));

        Back=new JButton("Back");
        Back.setBounds(35,50,70,20);
        Back.addActionListener(this);

        AddDC=new JButton("Add");
        AddDC.setBounds(155,330,70,20);
        AddDC.addActionListener(this);

        Withdraw=new JButton("Withdraw");
        Withdraw.setBounds(144,300,90,20);

        lbDateOfW=new JLabel("Date of Withdrawal");
        lbDateOfW.setBounds(35,195,110,20);

        String Datee []={"Jan 1945","Feb 1945","Mar 1945","Apr 1945","May 1945","Jun 1945","Jul 1945","Aug 1945","Sep 1945","Oct 1945","Nov 1945","Dec 1945"};
        CMBDate=new JComboBox(Datee);
        CMBDate.setBounds(155,195,77,20);

        lbBalanceamount=new JLabel("Balance amount");
        lbWithdrawalamount=new JLabel("Withdrawal amount");
        lbPINNumber=new JLabel("PINNumber");

        lbBalanceamount.setBounds(35,78,100,41);
        lbWithdrawalamount.setBounds(35,122,120,41);
        lbPINNumber.setBounds(35,266,77,41);

        tfBalanceamount =new JTextField(""); 
        tfWithdrawalamount =new JTextField("");
        tfPINNumber =new JTextField("");

        tfBalanceamount.setBounds(155,90,180,20);
        tfWithdrawalamount.setBounds(155,134,180,20);
        tfPINNumber.setBounds(155,266,180,20);

        //--------------------------------------------------------------------------------------------------//
        CC=new JPanel();
        CC.setLayout(null);
        CC.setVisible(false);
        CC.setSize(380,420);
        
        lbEXPDate=new JLabel("Exp Date:");
        lbEXPDate.setBounds(155,58,80,20);
        
        String Date1 []={"Jan 1945","Feb 1945","Mar 1945","Apr 1945","May 1945","Jun 1945","Jul 1945","Aug 1945","Sep 1945","Oct 1945","Nov 1945","Dec 1945"};
        EXPDate=new JComboBox(Date1);
        EXPDate.setBounds(234,60,100,20);

        lbCreditCard=new JLabel("Credit Card");
        lbCreditCard.setBounds(125,25,165,25);
        lbCreditCard.setFont(new Font("serif",Font.PLAIN,26));

        lbCVCNumber=new JLabel("CVC Number");
        lbCreditLimit=new JLabel("Credit Limit");
        lbInterestRate=new JLabel("Interest Rate");
        lbGracePeriod=new JLabel("Grace Period");
        lbPINNumber=new JLabel("PINNumber");

        AddCC=new JButton("Add");
        AddCC.setBounds(155,330,70,20);

        Cancel=new JButton("Cancel");
        Cancel.setBounds(25,300,80,20);

        SetCreditLimit=new JButton("Set Credit Limit");
        SetCreditLimit.setBounds(219,300,130,20);

        lbCVCNumber.setBounds(35,78,77,41);
        lbCreditLimit.setBounds(35,122,70,41);
        lbInterestRate.setBounds(35,166,75,41);
        lbGracePeriod.setBounds(35,210,75,41);
        lbPINNumber.setBounds(35,254,77,41);

        tfCreditLimit=new JTextField("");
        tfCVCNumber =new JTextField("");
        tfInterestRate =new JTextField("");
        tfGracePeriod =new JTextField("");
        tfPINNumber =new JTextField("");

        tfCVCNumber.setBounds(155,90,180,20);
        tfCreditLimit.setBounds(155,135,180,20);
        tfInterestRate.setBounds(155,180,180,20);
        tfGracePeriod.setBounds(155,222,180,20);
        tfPINNumber.setBounds(155,266,180,20);

        //adds components for the frame
        //--------------------------------------------------------------------------------------------------//
        BC.add(lbBankCard);
        BC.add(lbCardID);
        BC.add(lbClientName);
        BC.add(lbIssuerBank);
        BC.add(lbBankaccount);
        BC.add(lbPINNumber);

        BC.add(tfCardID);
        BC.add(tfClientName);
        BC.add(tfIssuerBank);
        BC.add(tfBankAccount);
        BC.add(tfPINNumber);

        BC.add(CreditCard);
        BC.add(DebitCard);
        BC.add(Clear);
        BC.add(Display);
        //--------------------------------------------------------------------------------------------------//
        DC.add(lbDebitCard); 
        DC.add(lbBalanceamount);
        DC.add(lbWithdrawalamount);

        DC.add(Withdraw);
        DC.add(lbDateOfW);
        DC.add(CMBDate);

        DC.add(tfBalanceamount);
        DC.add(tfWithdrawalamount);

        //--------------------------------------------------------------------------------------------------//
        CC.add(lbCreditCard);
        CC.add(lbCVCNumber);
        CC.add(lbCreditLimit);
        CC.add(lbInterestRate);
        CC.add(lbGracePeriod);

        CC.add(tfCVCNumber);
        CC.add(tfCreditLimit);
        CC.add(tfInterestRate);
        CC.add(tfGracePeriod);
        CC.add(lbEXPDate);
        CC.add(EXPDate);
        CC.add(Back);
        CC.add(SetCreditLimit);
        CC.add(Cancel);
        //--------------------------------------------------------------------------------------------------//
        frame.add(BC);
        frame.add(DC);
        frame.add(CC);
        frame.setBounds(520,100,400,420);  //sets boundaries for the UI
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new BankGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==CreditCard){
            CC.add(lbPINNumber);
            CC.add(tfPINNumber);
            CC.add(Clear);
            CC.add(Display);
            CC.add(Back);
            CC.add(AddCC);
            CC.setVisible(true);
            BC.setVisible(false);  
        }
        else if(e.getSource()==DebitCard){

            DC.add(lbPINNumber);
            DC.add(tfPINNumber);
            DC.add(Clear);
            DC.add(Display);
            DC.add(Back);
            DC.add(AddDC);
            DC.setVisible(true);
            BC.setVisible(false); 
        }
        if(e.getSource()==Clear){
            tfCardID.setText("");
            tfClientName.setText("");
            tfIssuerBank.setText("");
            tfBankAccount.setText("");
            tfBalanceamount.setText("");
            tfPINNumber.setText("");
            tfWithdrawalamount.setText("");
            tfCVCNumber.setText("");
            tfCreditLimit.setText("");
            tfInterestRate.setText("");
            tfGracePeriod.setText("");
        }
        if(e.getSource()==Display){

        }
        if(e.getSource()==AddDC)
        {
            if(tfCardID.getText().isEmpty() || tfClientName.getText().isEmpty() || tfIssuerBank.getText().isEmpty() || tfBankAccount.getText().isEmpty() || tfPINNumber.getText().isEmpty() || tfBalanceamount.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Input cannot be empty");
            }
            ArrayList<BankCard> BankCard = new ArrayList<BankCard>(); 
            try {
                String ClientName = tfClientName.getText();
                int CardID = Integer.parseInt(tfCardID.getText());
                String IssuerBank = tfIssuerBank.getText();
                String BankAccount = tfBankAccount.getText();
                int BalanceAmount = Integer.parseInt(tfBalanceamount.getText());
                int PINNumber = Integer.parseInt(tfPINNumber.getText());
                boolean ExistDebitCard = false;
                for (BankCard bankcard : BankCard) {
                    if (bankcard.getCardID() == CardID) {
                        ExistDebitCard = true;
                    } else {
                    JOptionPane.showMessageDialog(frame, "Card pre-exists", "Error", JOptionPane.WARNING_MESSAGE);
                }
                }
                if (!ExistDebitCard) {
                    DebitCard DCList = new DebitCard(CardID, IssuerBank, BankAccount, BalanceAmount, PINNumber);
                    BankCard.add(DCList);
                    JOptionPane.showMessageDialog(frame, "Debit Card Added", "Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException arg) {
                JOptionPane.showMessageDialog(frame, "Enter a valid input", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(e.getSource()==AddCC){
            if(tfCardID.getText().isEmpty() || tfClientName.getText().isEmpty() || tfIssuerBank.getText().isEmpty() || tfBankAccount.getText().isEmpty() || tfPINNumber.getText().isEmpty() || tfBalanceamount.getText().isEmpty() || tfCVCNumber.getText().isEmpty() || tfInterestRate.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Input cannot be empty");
            }
        }
        if(e.getSource()==Back){
            BC.setVisible(true);
            BC.add(Clear);
            BC.add(Display);
            BC.add(lbPINNumber);
            BC.add(tfPINNumber);
            DC.setVisible(false);
            CC.setVisible(false);
        }
    }

}

