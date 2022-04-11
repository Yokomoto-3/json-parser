import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Map;

public class JsonParseMain {

    @Test
    public void testSimpleParse() {
        JsonParser jsp = new JsonParser("C:\\Users\\Ризван\\IdeaProjects\\ScreenRuleValidator\\src\\main\\resources\\testJsonSimple");
        jsp.JsonPrint();

        Assert.assertEquals("name\"My bean\"attr2\"val2\"attr1\"val1\"", jsp.toString());
    }
}
