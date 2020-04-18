package diploma.gametheory.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Question {


    private String type;

    private String question;

    private String answer;

    private String optionA;

    private String optionB;

    private String optionC;

    private String optionD;

}
