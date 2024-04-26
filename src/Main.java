import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int answerCorrectPlayer;
        int answerCorrectTotal;
        int answerCorrectPercent;
        Scanner sc = new Scanner(System.in);
        Set<Character> answersCorrect = new HashSet<>();

        Answer answer1 = new Answer("A: atmosphere", true);
        Answer answer2 = new Answer("B: biosphere", false);
        Answer answer3 = new Answer("C: thermosphere", false);

        Answer answer4 = new Answer("A: nitrogen", true);
        Answer answer5 = new Answer("B: oxygen", false);
        Answer answer6 = new Answer("C: carbon dioxide", false);

        Answer answer7 = new Answer("A: Jupiter", true);
        Answer answer8 = new Answer("B: Mars", true);
        Answer answer9 = new Answer("C: Uranus", true);
        Answer answer10 = new Answer("D: Mercury", false);

        ArrayList<Answer> answerForQuestion1 = new ArrayList<>();
        answerForQuestion1.add(answer1);
        answerForQuestion1.add(answer2);
        answerForQuestion1.add(answer3);
        Question question1 = new Question("What is the gaseous envelope of the earth called?", answerForQuestion1, QuestionType.SINGLETYPE);

        ArrayList<Answer> answerForQuestion2 = new ArrayList<>();
        answerForQuestion2.add(answer4);
        answerForQuestion2.add(answer5);
        answerForQuestion2.add(answer6);
        Question question2 = new Question("Which components are the most in the air?", answerForQuestion2, QuestionType.SINGLETYPE);

        ArrayList<Answer> answerForQuestion3 = new ArrayList<>();
        answerForQuestion3.add(answer7);
        answerForQuestion3.add(answer8);
        answerForQuestion3.add(answer9);
        answerForQuestion3.add(answer10);
        Question question3 = new Question("Which planets are further from the Sun than Earth?", answerForQuestion3,QuestionType.MULTIPLETYPE);

        ArrayList<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

        Quiz quiz = new Quiz("Air", questions);

        System.out.println(quiz.getQuizName());
        System.out.println();
        answerCorrectTotal = 0;
        answerCorrectPlayer = 0;
        for (Question question : quiz.getQuestions()) {
            System.out.println(question.getQuestText() + " - " + question.getHowMamy().getText());
            for (Answer answer : question.getAnswers()) {
                System.out.println(answer.getAnswer());
                if (answer.isCorrectAnswer()) {
                    answersCorrect.add(answer.getAnswer().charAt(0));
                    ++answerCorrectTotal;
                }
            }
            System.out.println("Enter the answer: ");
            String scAnswer = sc.next().toUpperCase();
            for (int i = 0; i < scAnswer.length(); i++) {
                Character charN = scAnswer.charAt(i);
                if (answersCorrect.contains(charN)) {
                    System.out.println(charN + " is right answer");
                    ++answerCorrectPlayer;
                } else {
                    System.out.println(charN + " is wrong answer");
                }
            }
        }
        answerCorrectPercent = 100 * answerCorrectPlayer / answerCorrectTotal;
        System.out.println("Correctly " + answerCorrectPlayer + " from " + answerCorrectTotal + " (" + answerCorrectPercent + "%).");
        System.out.println("Bye.");
    }

}