import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class JsonParseMain {

    @Test
    public void testSimpleParse() throws IOException {

        ObjectMapper om = new ObjectMapper();
        ScreenRules rules = new ObjectMapper().readerFor(ScreenRules.class).readValue(new File("C:\\Users\\rizva\\IdeaProjects\\ScreenRuleValidator\\src\\main\\resources\\testJson"));
        System.out.println(rules);

    }
}
