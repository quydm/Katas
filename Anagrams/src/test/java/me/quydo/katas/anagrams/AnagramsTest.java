package me.quydo.katas.anagrams;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AnagramsTest {

    @Test
    public void test1() {
        List<String> expected = Arrays.asList("a");
        List<String> actual = Anagrams.anagramsOf("a");

        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void test2() {
        List<String> expected = Arrays.asList("ab", "ba");
        List<String> actual = Anagrams.anagramsOf("ab");

        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void test3() {
        List<String> expected = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
        List<String> actual = Anagrams.anagramsOf("abc");

        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void test4() {
        List<String> expected = Arrays.asList(
                "biro", "bior", "brio", "broi", "boir", "bori",
                "ibro", "ibor", "irbo", "irob", "iobr", "iorb",
                "rbio", "rboi", "ribo", "riob", "roib", "robi",
                "obir", "obri", "oibr", "oirb", "orbi", "orib"
                );
        List<String> actual = Anagrams.anagramsOf("biro");

        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void test5() {
        List<String> expected = null;
        List<String> actual = Anagrams.anagramsOf(null);

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        List<String> expected = Arrays.asList("");
        List<String> actual = Anagrams.anagramsOf("");

        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

}
