package Question2;

import java.util.List;

public class Question_a {
    String questionID,question;
    List<String> Answers;

    public String getQuestionID() {
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return Answers;
    }

    public void setAnswers(List<String> answers) {
        Answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionID='" + questionID + '\'' +
                ", question='" + question + '\'' +
                ", Answers=" + Answers +
                '}';
    }
}
