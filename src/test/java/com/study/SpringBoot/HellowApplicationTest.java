package com.study.SpringBoot;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HellowApplicationTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HellowApplicationTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HellowApplicationTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
