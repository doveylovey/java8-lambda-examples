package com.demo.answers.chapter9;

import com.demo.examples.chapter1.Artist;
import com.demo.examples.chapter1.SampleData;

public class FakeLookupService {

    public Artist lookupArtistName(String name) {
        sleepToSimulateLookupLatency();

        switch (name) {
            case "The Beatles":
                return SampleData.theBeatles;

            case "John Coltrane":
                return SampleData.johnColtrane;

            default:
                throw new IllegalArgumentException("Unknown artist: " + name);
        }
    }

    private void sleepToSimulateLookupLatency() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
