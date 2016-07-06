import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Joiner {
    @Test
    public void testMapJoiner() {
    //Using LinkedHashMap so that the original order is preserved
        String expectedString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";
        Map<String,String> testMap = Maps.newLinkedHashMap();
        testMap.put("Washington D.C","Redskins");
        testMap.put("New York City","Giants");
        testMap.put("Philadelphia","Eagles");
        testMap.put("Dallas","Cowboys");
        String returnedString = com.google.common.base.Joiner.on("#").
                withKeyValueSeparator("=").join(testMap);
        assertThat(returnedString, is(expectedString));
    }
}
