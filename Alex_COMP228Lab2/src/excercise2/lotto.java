package excercise2;
import javax.swing.JOptionPane;
import java.util.Random;

public class lotto {
    private Random random = new Random();
    private int[] nums = new int[3];
    public lotto(){
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(9)+1;
        }
    }
    public int[] getNums(){
        return nums;
    }
    public int Sum(){
        int sum =0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    public static void main (String[] args)
    {
        String message= JOptionPane.showInputDialog("select a whole number between 3 and 27");
        int userInput = Integer.parseInt(message);
        boolean win =false;
        for (int i = 1; i <=5; i++){
            lotto Lotto = new lotto();
            int[] pcNum = Lotto.getNums();
            int sum = Lotto.Sum();
            JOptionPane.showMessageDialog(null,"the pc has rolled "+
                    pcNum[0] + " | " + pcNum[1]+" | " + pcNum[2] + "with the sum of " + sum);
            if(sum==userInput){
                JOptionPane.showMessageDialog(null,"the sum is in your favor you won");
                win = true;
                break;
            }else{
                JOptionPane.showMessageDialog(null,"the sum is not in you favour pc wins");
            }
        }
    }
}

