/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phtos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dorpon
 */
public class NewJFrameTest {
    
    public NewJFrameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getImages method, of class NewJFrame.
     */
    @Test
    public void testGetImages() {
        System.out.println("getImages");
        NewJFrame instance = new NewJFrame();
        String[] expResult = null;
        String[] result = instance.getImages();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showImage method, of class NewJFrame.
     */
    @Test
    public void testShowImage() {
        System.out.println("showImage");
        int index = 0;
        NewJFrame instance = new NewJFrame();
        instance.showImage(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class NewJFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewJFrame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
