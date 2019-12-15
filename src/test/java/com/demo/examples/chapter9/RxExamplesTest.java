package com.demo.examples.chapter9;

import com.demo.examples.chapter1.Artist;
import com.demo.examples.chapter1.SampleData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RxExamplesTest {

    @Test
    public void filtersAlbums() throws InterruptedException {
        RxExamples examples = new RxExamples(SampleData.getThreeArtists());
        Artist artist = examples.search("John", "UK", 5)
                                .toBlockingObservable()
                                .single();

        assertEquals(SampleData.johnLennon, artist);
    }

}
