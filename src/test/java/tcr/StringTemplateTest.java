package tcr;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class StringTemplateTest {
    @Test
    public void X() {
        StringTemplate template = new StringTemplate("");
        assertEquals("", template.replace(Collections.emptyList()));
    }

    private class StringTemplate {
        public StringTemplate(String s) {

        }

        public String replace(List<Object> emptyList) {
            return "";
        }
    }
}
