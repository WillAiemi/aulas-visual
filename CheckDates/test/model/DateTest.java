/*
 * The MIT License
 *
 * Copyright 2019 Teste.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WillAiemi
 * @since 17/05/2019 - 16:19
 * @version 1.0
 */
public class DateTest {
    
    private static final Date DATE = new Date();
    
    public DateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        DATE.setDay((byte) 10);
        DATE.setMonth((byte) 01);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.print(DATE.toString());
    }
    
    @Before
    public void setUp() {
        DATE.setDay((byte) 10);
        DATE.setMonth((byte) 01);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDay method, of class Date.
     */
    @Test
    public void testGetDay() {
    }

    /**
     * Test of setDay method, of class Date.
     */
    @Test
    public void testSetDay() {
    }

    /**
     * Test of getMonth method, of class Date.
     */
    @Test
    public void testGetMonth() {
    }

    /**
     * Test of setMonth method, of class Date.
     */
    @Test
    public void testSetMonth() {
    }

    /**
     * Test of toString method, of class Date.
     */
    @Test
    public void testToString() {
        assertEquals(DATE.toString(), "January 10th\nIs valid: true");
        DATE.setMonth((byte) 5);
        DATE.setDay((byte) 1);
        assertEquals(DATE.toString(), "May 1st\nIs valid: true");
        DATE.setDay((byte) 3);
        DATE.setMonth((byte) 13);
        assertEquals(DATE.toString(), "Invalid 3rd\nIs valid: false");
    }
    
    /**
     * Test of getNameOfTheMonth method, of class Date.
     */
    @Test
    public void testGetNameOfTheMonth() {
        assertEquals(DATE.getNameOfTheMonth(), "January");
        DATE.setMonth((byte) 5);
        assertEquals(DATE.getNameOfTheMonth(), "May");
        DATE.setMonth((byte) 13);
        assertEquals(DATE.getNameOfTheMonth(), "Invalid");
    }
    
    /**
     * Test of validateDate method, of class Date.
     */
    @Test
    public void testValidateDate() {
        DATE.toString();
        assertEquals(DATE.validateDate(), true);
        
        DATE.setMonth((byte) 5);
        DATE.setDay((byte) 32);
        DATE.toString();
        assertEquals(DATE.validateDate(), false);
        
        DATE.setMonth((byte) 5);
        DATE.setDay((byte) 31);
        DATE.toString();
        assertEquals(DATE.validateDate(), true);
        
        DATE.setMonth((byte) 2);
        DATE.setDay((byte) 30);
        DATE.toString();
        assertEquals(DATE.validateDate(), false);
        
        DATE.setMonth((byte) 2);
        DATE.setDay((byte) 29);
        DATE.toString();
        assertEquals(DATE.validateDate(), true);
    }
    
    
}