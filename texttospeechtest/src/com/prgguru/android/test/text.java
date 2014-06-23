/**
 * 
 */
package com.prgguru.android.test;

import com.textspeech.android.TexttoSpeechActivity;

import android.test.ActivityInstrumentationTestCase2;

/**
 * @author bsauniv18
 *
 */
public class text extends ActivityInstrumentationTestCase2<TexttoSpeechActivity> {

	/**
	 * @param name
	 */
	public text(String name) {
		super("com.prgguru.android.TexttoSpeech",TexttoSpeechActivity.class);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

}
