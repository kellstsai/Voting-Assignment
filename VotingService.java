import java.util.*; 

public class VotingService {
    private int numberOfChoices;
    private int typeOfQuestion;
    private ArrayList<String> test; 

    public VotingService(int typeOfQuestion, int numberOfChoices, ArrayList<String> test) {
        this.typeOfQuestion = typeOfQuestion; 
        this.numberOfChoices = numberOfChoices;
        this.test = test; 
    }

    public int getTypeOfQuestion() {
        return typeOfQuestion; 
    }

    public int getNumberOfChoices() {
        return numberOfChoices;
    }

    public ArrayList<String> getTest() {
        return test; 
    }

    public void setTypeOfQuestion(int questionType) {
        this.typeOfQuestion = questionType;
    }

    public void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices; 
    }

    public void setTest(ArrayList<String> test) {
        this.test = test; 
    }
}
