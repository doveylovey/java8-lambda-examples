package com.demo.examples.chapter4;

import com.demo.examples.chapter1.SampleData;
import org.junit.Test;

public class PrimitivesTest {

    @Test
    public void albumStatistics() {
        Primitives.printTrackLengthStatistics(SampleData.aLoveSupreme);
    }

}
