package excercise3;

public class Overload {
    public static int mutliply(int num1, int num2){
        return num1*num2;
    }
    public static int mutliply(int num1, int num2 , int num3){
        return num1*num2*num3;
    }
    public static int mutliply (int num1, int num2, int num3, int num4){
        return num1*num2*num3*num4;
    }
    public static void main(String[] args){
        int mult= mutliply(20,15);
        int mult2 = mutliply(100, 10, 5);
        int mult3= mutliply(15, 20, 25 ,30);
        System.out.println("20 x 15 = " + mult );
        System.out.println("100 x 10 x5 = " + mult2 );
        System.out.println("15 x 20 x 25 x 30= " + mult3);
    }
}

