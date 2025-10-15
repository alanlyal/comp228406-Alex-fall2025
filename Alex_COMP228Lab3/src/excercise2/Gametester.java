package excercise2;

import javax.swing.JOptionPane;

abstract class excercise2
{
    private String name;
    private boolean fulltime;
    public excercise2(String name, boolean fulltime)
    {
        this.name=name;
        this.fulltime=fulltime;
    }
    public String getName()
    {
        return name;
    }
    public boolean isFulltime()
    {
        return fulltime;
    }
    public abstract double determineSalary();
}
class FullTimeGameTester extends excercise2
{
    public FullTimeGameTester(String name){
        super(name,true);
    }
    public double determineSalary()
    {
        return 3000;
    }
}
class PartTimeGameTester extends excercise2{
    private int hours;
    public PartTimeGameTester(String name, int hours){
        super(name,false);
        this.hours=hours;
    }
    public double determineSalary()
    {
        return hours * 20;
    }
}
public class Gametester{
    public static void main(String[] args){
        String name= JOptionPane.showInputDialog("input your name: ");
        String workType = JOptionPane.showInputDialog("what type of work are you part-time(input part) or full-time(input full): ");
        workType = workType.toLowerCase();
        excercise2 tester;
       if (workType.equals("full")){
           tester= new FullTimeGameTester(name);
       }
       else
       {
           int hours = Integer.parseInt(JOptionPane.showInputDialog("input how many hours you worked: "));
           tester = new PartTimeGameTester(name,hours);
       }
       String info= "name: "+ tester.getName() + " |work status: " + (tester.isFulltime() ? "full-time" : "part-time")+ " |salary: "+ tester.determineSalary() + "$";
       JOptionPane.showMessageDialog(null,info);
    }

}