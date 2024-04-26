public enum QuestionType {
    SINGLETYPE("the question has one correct answer"),
    MULTIPLETYPE("the question has several correct answers");

    private final String text;

    QuestionType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
