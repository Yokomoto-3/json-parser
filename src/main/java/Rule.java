import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.Map;

public class Rule {
    Condition condition;
    String nextDisplay;


    public String name;
    private Map<String, String> properties;

    @JsonAnySetter
    public void add(String key, String value) {
        properties.put(key, value);
    }

}
