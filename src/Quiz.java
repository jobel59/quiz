import java.util.ArrayList;

public class Quiz {
    private final ArrayList<Question> questions;
    private final String quizName;

    public Quiz(String quizName, ArrayList<Question> questions) {
        this.quizName = quizName;
        this.questions = questions;
    }

    public void add(Question question) {
        this.questions.add(question);
    }

    public String getQuizName() {
        return quizName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
