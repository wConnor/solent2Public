/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.ood.example2.test;

import org.junit.Assert;

import org.junit.Test;
import org.solent.com504.ood.example2.SimpleMathClass;

/**
 *
 * @author cgallen
 */
public class SimpleMathClassTest {
    
    @Test
    public void testMain() {
        String[] args = {"add","1.5", "300"};
        SimpleMathClass.main(args);
    }

	// add
    @Test
    public void testAdd() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        double result = simpleMathClass.add(1.5, 300);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }
    
    @Test
    public void testParseAdd() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        
        String[] args = {"add","1.5", "300"};
        double result = simpleMathClass.parseArguments(args);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }
    

	// subtract
    @Test
    public void testSubract() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        double result = simpleMathClass.subtract(500, 503.2);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }

    @Test
    public void testParseSubtract() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        
        String[] args = {"subtract","302.5", "1"};
        double result = simpleMathClass.parseArguments(args);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }

	// multiply
	@Test
    public void testMultiply() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        double result = simpleMathClass.multiply(62, 3);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }
    
    @Test
    public void testParseMultiply() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        
        String[] args = {"multiply","62", "3"};
        double result = simpleMathClass.parseArguments(args);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }

	// divide
	@Test
    public void testDivide() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        double result = simpleMathClass.divide(301.5, 1);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }
    
    @Test
    public void testParseDivide() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        
        String[] args = {"divide","500", "0"};
        double result = simpleMathClass.parseArguments(args);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }


}
