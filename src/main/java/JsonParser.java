import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class JsonParser {

    private JsonNode jsonNode;
    private String sourcedString;

    @Override
    public String toString() {
        StringBuilder parsedJson = new StringBuilder();
        Iterator<Map.Entry<String, JsonNode>> fieldsIterator = jsonNode.fields();
        while (fieldsIterator.hasNext()) {
            Map.Entry<String, JsonNode> field = fieldsIterator.next();
            parsedJson.append(field.getKey()).append(field.getValue());
        }
        return parsedJson.toString();
    }

    public JsonParser(String filePath) {
        try {
            sourcedString = Files.lines(Paths.get(filePath)).reduce("", (s, s2) -> s + s2);
            jsonNode = parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void JsonPrint() {
        Iterator<Map.Entry<String, JsonNode>> fieldsIterator = jsonNode.fields();
        while (fieldsIterator.hasNext()) {
            Map.Entry<String, JsonNode> field = fieldsIterator.next();
            System.out.println("Key: " + field.getKey() + "\tValue:" + field.getValue());
        }
    }

    private JsonNode parse() throws IOException {
        JsonFactory factory = new JsonFactory();
        ObjectMapper mapper = new ObjectMapper(factory);
        return mapper.readTree(sourcedString);
    }
}
