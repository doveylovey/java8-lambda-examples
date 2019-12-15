package com.demo.exercises.chapter5;

import com.demo.examples.chapter1.Artist;
import com.demo.examples.chapter1.SampleData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestNameTest {

    @Test
    public void findsLongestNameByReduce() {
        Artist artist = LongestName.byReduce(SampleData.getThreeArtists());
        assertEquals(SampleData.johnColtrane, artist);
    }

    @Test
    public void findsLongestNameByCollecting() {
        Artist artist = LongestName.byCollecting(SampleData.getThreeArtists());
        assertEquals(SampleData.johnColtrane, artist);
    }

}
