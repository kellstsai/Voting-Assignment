import java.io.StreamCorruptedException;
import java.util.*;

public class Question {
    private int numberOfChoices; 
    private String actualQuestion; 

    public Question(int numberOfChoices, String actualQuestion) { 
        this.numberOfChoices = numberOfChoices;
        this.actualQuestion = actualQuestion; 
    }

    public void setQuestion(String actualQuestion) {
        this.actualQuestion = actualQuestion; 
    }

    public void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices; 
    }

    public String getQuestion() {
        return actualQuestion; 
    }

    public int getNumberOfChoices() {
        return numberOfChoices; 
    }

    public String toString() {
        return "The question is: " + this.actualQuestion + "\nWith " + this.numberOfChoices; 
    }

   

    public Character singleChoiceQuestion(int numberOfChoices) {
        Random r = new Random(); 
        char[] letterChoices = {'A', 'B', 'C', 'D', 'E'}; 

        char output = letterChoices[r.nextInt(numberOfChoices)];
        return output; 
     }
      /*  Random r = new Random(); 
        char c = (char)(r.nextInt(numberOfChoices + 'A')); 
        String string = Character.toString(c); 
        return string; 
*/

     public String multipleChoiceQuestions(int numberOfChoices) {
        Set<Character> hs = new LinkedHashSet<Character>(); 
        Random r = new Random(); 
        StringBuilder sb = new StringBuilder(); 
        StringBuilder strbuild = new StringBuilder(); 
        char[] letterChoices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'}; 
        int numberOfTimes = r.nextInt(numberOfChoices - 1) + 1; 
        for(int i = 0; i < numberOfTimes + 1; i++) {
            //System.out.print("i wanna die" + numberOfChoices); 
            char output = letterChoices[r.nextInt(numberOfTimes)];
            hs.add(output);
            //System.out.print("HELLLOOOOO" + output); 
            String string = Character.toString(output); 
            strbuild.append(string); 
        }

        String answer = strbuild.toString(); 
        char[] secondArray = answer.toCharArray(); 
        for(char output : secondArray) {
            hs.add(output);  
            //System.out.print("BITCHHHH" + output); 
        }
        for(Character character : hs) {
            sb.append(character); 
        }
        answer = sb.toString(); 
        return answer;
        
     } 


}
