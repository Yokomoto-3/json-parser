import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScreenRules {

    public Map<String, Rule> rules = new HashMap<>();

    @JsonAnySetter
    public void add(String key, Rule value) {
        rules.put(key, value);
    }
}
