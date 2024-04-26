import java.util.ArrayList;

public class Question {
    private final String questText;
    private final ArrayList<Answer> answers;
    private final QuestionType howMamy;


    public Question(String questText, ArrayList<Answer> answers, QuestionType howMamy) {
        this.questText = questText;
        this.answers = answers;
        this.howMamy = howMamy;

    }

    public String getQuestText() {
        return questText;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public QuestionType getHowMamy() {
        return howMamy;
    }
}
