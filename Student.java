import java.util.*; 

public class Student {
    private String identification;
    private String answer;

    public Student(String identification, String answer) {
        this.identification = identification;
        this.answer = answer;
    }

    public void setIdentification(String identification) {
        this.identification = identification; 
    }

    public String getIdentification() {
        return this.identification; 
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer; 
    }

    public String toString() {
        return "Student ID is " + identification + " Student answer is " + answer; 
    }

    public String randomID() {
        Random r = new Random(); 
        String responseChars = "ABCDEFGHIJKLMNOPQRSTUV1234567890"; 
        StringBuilder response = new StringBuilder(); 
        while (response.length() < 18) {
            int index = (r.nextInt() * responseChars.length());
            response.append(responseChars.charAt(index)); 
        }

        String responseStr = response.toString(); 
        return responseStr; 
    }
}


