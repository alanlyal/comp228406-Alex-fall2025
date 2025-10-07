package excercise1;
import java.util.Random;

public class Quiz {
    int correct = 0;
    int incorrect = 0;
    private String[] Questions = {
            "Question 1) what is the word used to define a class \na)class \nb)private \nc)public \nd)none of the above", //a
            "Question 2) what variable is used to numbers with decimals \na)int \nb)double \nc)char \nd)none of the above", // b
            "Question 3) what symbol is used for a 1 line command \na)&& \nb)$$ \nc)// \nd)||",// c
            "Question 4) what year was java founded \na)2003 \nb)2000 \nc)1996 \nd)1995",// d
            "Question 5) what variable allows sentences \na)int \nb)sentece \nc)string \nd)none of the above"//c
    };
    char[] answers = {'a', 'b', 'c', 'd', 'c'};
    private Random random = new Random();

    public void inputAnswer() {
        simulateQuestion();
    }

    public void simulateQuestion() {
        for (int i = 0; i < Questions.length; i++) {
            String userInput = JOptionPane.showInputDialog(Questions[i]);
            char userAnswers = Character.toLowerCase(userInput.charAt(0));
            checkAnswer(i, userAnswers);
        }
        int total = correct + incorrect;
        int grade = (correct * 100) / total;
        JOptionPane.showMessageDialog(null, "the quiz is now done you got " + correct + "correct and " +
                incorrect + "incorrect and your grade is " + grade + "%");
    }

    private void checkAnswer(int questionNum, char userAnswer) {
        if (userAnswer == answers[questionNum]) {
            correct++;
            JOptionPane.showMessageDialog(null, generateMessage(true));
        } else {
            incorrect++;
            JOptionPane.showMessageDialog(null, generateMessage(false));
        }
    }

    private String generateMessage(boolean isCorrect) {
        int message = random.nextInt(4);
        if (isCorrect) {
            switch (message) {
                case 0:
                    return "correct great job ";
                case 1:
                    return "correct good stuff";
                case 2:
                    return "correct your on fire";
                default:
                    return "correct";
            }
        } else {
            switch (message) {
                case 0:
                    return "incorrect sorry try again";
                case 1:
                    return "incorrect close give it another go";
                case 2:
                    return "incorrect keep going you can do this";
                default:
                    return "incorrect";
            }
        }
    }
    public static void main(String[] args){
        Quiz quiz = new Quiz();
        quiz.inputAnswer();
    }
}
