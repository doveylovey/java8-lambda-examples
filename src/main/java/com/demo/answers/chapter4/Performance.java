package com.demo.answers.chapter4;

import com.demo.examples.chapter1.Artist;

import java.util.stream.Stream;

/** A Performance by some musicians - e.g., an Album or Gig. */
public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();

}