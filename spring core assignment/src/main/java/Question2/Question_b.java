package Question2;

import java.util.List;
import java.util.Set;

public class Question_b {
    String questionID,question;
    Set<String> Answers;

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

    public Set<String> getAnswers() {
        return Answers;
    }

    public void setAnswers(Set<String> answers) {
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
