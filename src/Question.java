public class Question {

    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.answer = answer;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getOpt1() {
        return opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return  "Question No=" + id +
                ", Question='" + question + '\'' +
                ", Option 01='" + opt1 + '\'' +
                ", Option 02='" + opt2 + '\'' +
                ", Option 03='" + opt3 + '\'' +
                ", Option 04='" + opt4 + '\'' +
                ", Answer='" + answer + '\'';
    }
}
