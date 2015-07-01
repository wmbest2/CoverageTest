package com.wmbest.myapplicationtest;

import android.app.Application;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;

import junit.framework.Assert;
import junit.framework.TestResult;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

@RunWith(AndroidJUnit4.class)
public class ApplicationTest extends Assert {

    @Test
    public void checkSomething() {
        assertTrue(MainActivity.checkTheseLines());
    }
}