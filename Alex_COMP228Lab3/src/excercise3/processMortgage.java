package excercise3;
import javax.swing.JOptionPane;
interface MortgageConstants{
    int shortTerm =1;
    int mediumTerm=3;
    int longTerm=5;
    String bank= "CityToronto bank";
    double maxMartgageAmount = 300000;
}
abstract class Mortgage implements MortgageConstants{
    protected String mortgageNum;
    protected String name;
    protected double amount;
    protected double intRate;
    protected int term;
    public Mortgage(String mortgageNum, String name, double amount, double intRate, int term)
    {
        this.mortgageNum=mortgageNum;
        this.name=name;
        this.intRate=intRate;
        if(amount > maxMartgageAmount) {
        this.amount = maxMartgageAmount;
        }
        else {
            this.amount=amount;
        }
        if (term !=shortTerm && term !=mediumTerm && term != longTerm)
        {
            this.term=shortTerm;
        }
        else{
            this.term = term;
        }
    }
    public abstract double calcTotal();
    public String getMortgageInfo(){
        return "bank: "+bank + " |mortgage number: " + mortgageNum +" |Name:" + name + " |mortgage amount: "+ amount +
                " |interest rate: " + intRate + "%" + " |term" + term +" years"+ " |total owed: " + String.format("%.2f", calcTotal()) + "$";
    }
}
class businessMortgage extends Mortgage{
    public businessMortgage(String mortgageNum, String name, double amount , double primeRate, int term){
        super(mortgageNum, name, amount, primeRate +1, term);
    }
    public double calcTotal(){
        return  amount + (amount * (intRate/100)* term);
    }
}
class personalMortgage extends Mortgage{
    public personalMortgage(String mortgageNum, String name, double amount , double primeRate, int term){
        super(mortgageNum, name, amount, primeRate + 2, term);
    }
    public double calcTotal(){
        return  amount + (amount * (intRate/100)* term);
    }
}
public class processMortgage{
    public static void main (String[] args){
        Mortgage[] mortgage = new Mortgage[1];
        double primeRate = Double.parseDouble(JOptionPane.showInputDialog("input your prime rate: "));
        for (int i = 0; i < mortgage.length; i++){
            String mortType = JOptionPane.showInputDialog("enter your mortgage type 1 for business or 2 for personal");
            String mortgageNum = JOptionPane.showInputDialog("input the mortgage number: ");
            String name = JOptionPane.showInputDialog("input your name: ");
            double amount = Double.parseDouble(JOptionPane.showInputDialog("input the mortage amount: "));
            int term = Integer.parseInt(JOptionPane.showInputDialog("input your term years: 1, 3, 5"));
            if (mortType.equals("1")){
                mortgage[i] =new businessMortgage(mortgageNum, name, amount,primeRate,term);
            } else if (mortType.equals("2")) {
                mortgage[i] = new personalMortgage(mortgageNum, name, amount,primeRate,term);
            }else {
                JOptionPane.showMessageDialog(null,"you have inputed a inavlid number you will be defaulted to personal");
                mortgage[i] = new personalMortgage(mortgageNum, name, amount,primeRate,term);
            }
        }
        String MortgageInfo = "Mortgage info";
        for(int i = 0; i < mortgage.length; i++)
        {
            MortgageInfo += mortgage[i].getMortgageInfo();
        }
        JOptionPane.showMessageDialog(null, MortgageInfo);
    }
}