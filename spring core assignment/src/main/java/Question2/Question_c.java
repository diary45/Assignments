package Question2;

import java.util.Map;
import java.util.Set;

public class Question_c {
    String questionID,question;
    Map<Integer,String> Answers;

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

    public Map<Integer,String> getAnswers() {
        return Answers;
    }

    public void setAnswers(Map<Integer,String> answers) {
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
