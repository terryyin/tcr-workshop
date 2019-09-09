package tcr;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.*;
import static java.util.Collections.emptyList;
import static junit.framework.TestCase.assertEquals;

public class StringTemplateTest {
    @Test
    public void empty() {
        StringTemplate template = new StringTemplate("");
        assertEquals("", template.replace(emptyMap()));
    }

    @Test
    public void noReplacement() {
        StringTemplate template = new StringTemplate("hello");
        assertEquals("hello", template.replace(emptyMap()));
    }

    @Test
    public void replaceOne() {
        StringTemplate template = new StringTemplate("h $name");

        Map<String, String> attributes = new HashMap<>();
        attributes.put("name", "Eva");

        assertEquals("hello Eva", template.replace(attributes));
    }
}
