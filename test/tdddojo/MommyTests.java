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
        assertEquals("babb", Mommy.mommify("babb"));
    }

    @Test
    public void testMommyShouldReplaceSingleVowelCharWhenVowelsMoreThan30Percent() throws Exception {
        assertEquals("bmommyb", Mommy.mommify("bab"));
        assertEquals("mommybb", Mommy.mommify("abb"));
        assertEquals("bbmommy", Mommy.mommify("bba"));
    }

    @Test
    public void testMommyShouldReplaceGroupedVowelsWithOneMommyWhenVowelsMoreThan30Percent() throws Exception {
        assertEquals("bmommyb", Mommy.mommify("baab"));
        assertEquals("bbmommy", Mommy.mommify("bbaa"));
        assertEquals("mommybb", Mommy.mommify("aabb"));
    }

    @Test
    public void testMommyShouldNotReplaceAnythingWhenVowelsIs30Percent() throws Exception {
        assertEquals("aaabbbbbbb", Mommy.mommify("aaabbbbbbb"));
    }

    @Test
    public void testMommyShouldReplaceAllVowelGroupsWhenVowelPercentageMoreThan30PercentAndMoreThanOneVowelGroup() throws Exception {
        assertEquals("bmommybmommyb", Mommy.mommify("baabaab"));
    }

    @Test
    public void testMommyShouldReplaceWithAllVowels() throws Exception {
        assertEquals("bmommyb", Mommy.mommify("baeiouAEIOUb"));
    }
}
