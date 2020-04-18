package diploma.gametheory.controller;

import diploma.gametheory.model.Owner;
import diploma.gametheory.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class QuizzesController {

    @GetMapping("/index")
    public List<Owner> index(){

        Question question = Question.builder()
                .type("full")
                .question("What is the biggest decimal number")
                .answer("1000")
                .optionA("2000")
                .optionB("1000")
                .optionC("500")
                .optionD("4000")
                .build();

        Question true_false = Question.builder()
                .type("true_false")
                .question("Is one plus one equal to two?")
                .answer("yes")
                .optionA("Yes")
                .optionB("No")
                .build();


        List<Question> questions = Arrays.asList(question, true_false, question);

        Owner john = new Owner("john", questions);
        Owner rita = new Owner("rita", questions);

        List<Owner> owners = Arrays.asList(john, rita);

        return owners;
    }

}
