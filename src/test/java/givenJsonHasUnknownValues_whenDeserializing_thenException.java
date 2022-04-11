import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class givenJsonHasUnknownValues_whenDeserializing_thenException {
    @Test(expected = UnrecognizedPropertyException.class)
    public void givenJsonHasUnknownValues_whenDeserializing_thenException()
            throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        MyDto readValue = mapper.readValue(new File("C:\\Users\\rizva\\IdeaProjects\\ScreenRuleValidator\\src\\main\\resources\\testJsonUnknownParams"), MyDto.class);

        System.out.println(readValue.toString());

    }
}
