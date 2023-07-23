package main;

import com.example.project_java_professional.main.Answer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestAnswer {
    @Test
    public void ifNullText(){
        assertThrows(IllegalArgumentException.class,() -> new Answer(null));
    }

}
