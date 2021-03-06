package com.demo.examples.chapter3;

import com.demo.examples.chapter1.SampleData;
import org.junit.Test;

public class IterationTest {

    @Test
    public void lazyPrintOuts() {
        Iteration iteration = new Iteration();
        iteration.filterArtistsFromLondonPrinted(SampleData.membersOfTheBeatles);
    }

    @Test
    public void evaluatedPrintOuts() {
        Iteration iteration = new Iteration();
        iteration.internalCountArtistsFromLondonPrinted(SampleData.membersOfTheBeatles);
    }
}
