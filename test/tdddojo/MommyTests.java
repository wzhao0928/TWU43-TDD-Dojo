package tdddojo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wbzhao on 15/5/13.
 */
public class MommyTests {

    @Test
    public void testMommyShouldNotReplaceAnyCharWhenVowelsLessThan30Percent() throws Exception {
        assertEquals("abbb", Mommy.mommify("abbb"));
    }
}