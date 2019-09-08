package tcr;

import org.junit.Test;

import java.util.Collections;

import static java.util.Collections.emptyList;
import static junit.framework.TestCase.assertEquals;

public class StringTemplateTest {
    @Test
    public void X() {
        StringTemplate template = new StringTemplate("");
        assertEquals("", template.replace(emptyList()));
    }

}
