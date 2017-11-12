package com.danyfel80.imageanalysis.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestLibrarySpec {
	@Test
	public void givenValueWhenSquareOfThenValueSquared() {
		int value = 2;
		int expected = 4;
		assertThat(TestLibrary.squareOf(value), is(equalTo(expected)));
	}

}
