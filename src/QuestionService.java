public class QuestionService {

    //Store 5 questions
    Question[] questions = new Question[5];

    //Manually create questions by constructor
    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
        questions[1] = new Question(2, "What is the capital of Germany?", "Paris", "London", "Berlin", "Madrid", "Berlin");
        questions[2] = new Question(3, "What is the capital of Italy?", "Paris", "London", "Berlin", "Rome", "Rome");
        questions[3] = new Question(4, "What is the capital of Spain?", "Paris", "London", "Berlin", "Madrid", "Madrid");
        questions[4] = new Question(5, "What is the capital of Portugal?", "Paris", "London", "Berlin", "Lisbon", "Lisbon");
    }

    //Display all questions
    public void displayQuestions() {
        for(Question q : questions) {
            System.out.println(q.toString());
        }
    }

}
