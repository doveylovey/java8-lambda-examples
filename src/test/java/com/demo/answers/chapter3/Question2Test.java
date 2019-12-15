package com.demo.answers.chapter3;

import com.demo.examples.chapter1.SampleData;
import org.junit.Test;

import java.util.Arrays;

import static com.demo.answers.chapter3.Question2.countBandMembersInternal;
import static org.junit.Assert.assertEquals;

public class Question2Test {

    @Test
    public void internal() {
        assertEquals(4, countBandMembersInternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
    }

}
