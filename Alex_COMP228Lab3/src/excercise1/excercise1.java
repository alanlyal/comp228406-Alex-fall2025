package excercise1;
import java.util.Scanner;
abstract class inheritance{
    protected double monthlyCost;
    protected  String insurance;
    public inheritance(double monthlyCost, String insurance)
    {
        this.monthlyCost=monthlyCost;
        this.insurance=insurance;
    }
    public abstract void setInsuranceCost();
    public abstract  void displayInfo();
}
class Health extends inheritance
{
    public Health(double monthlyCost, String insurance)
    {
        super(monthlyCost,insurance);
    }

    public void setInsuranceCost()
    {

    }
    public void displayInfo()
    {
        System.out.println("----Heath---Insurance-------");
        System.out.println("Insurance: " + insurance);
        System.out.println("cost per month: "+ monthlyCost);
    }
}
class Life extends inheritance
{
    public Life(double monthlyCost, String insurance)
    {
        super(monthlyCost, insurance);
    }
    public void setInsuranceCost()
    {

    }
    public void displayInfo()
    {
        System.out.println("----life---Insurance-------");
        System.out.println("Insurance: " + insurance);
        System.out.println("cost per month: "+ monthlyCost);
    }
}
public class excercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the number of insurances you want: ");
        int num = input.nextInt();
        input.nextLine();
        inheritance[] policies = new inheritance[num];
        for (int i = 0; i < num; i++) {
            System.out.println("input the type of insurance you want (health or life): ");
            String insurType = input.nextLine().toLowerCase();
            if (insurType.equals("health")) {
                policies[i] = new Health(1.3, "health");
            } else if (insurType.equals("life")) {
                policies[i] = new Life(129.99, "life");
            } else {
                System.out.println("you have nade a error default insurance is now health");
                policies[i] = new Health(1.3, "health");
            }
        }
            System.out.println("-------Insureance------Info---------");
            double total =0;
            for (int i = 0; i < policies.length; i++) {
                policies[i].setInsuranceCost();
                policies[i].displayInfo();
                total += policies[i].monthlyCost;
                System.out.println();
            }
            System.out.println("total is: " +total);
        }
    }



