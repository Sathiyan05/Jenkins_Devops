package com.rts.JenkinsDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorkLog {
	
	WorkLog w1=new WorkLog();
	
	@Test
	public void testAddToLog1(){
		assertEquals("Added Log for Remo", w1.addToLog("Remo"));
	}
	
	@Test
	public void testAddToLog2(){
		assertEquals("Added Log for Sathya", w1.addToLog("Sathya"));	
	}
	
	@Test
	public void testLogin1(){
		assertEquals("added Login for Remo", w1.addToLogins("Remo"));
	}
	
	@Test
	public void testLogin2(){
		assertEquals("added Login for Sathya", w1.addToLogins("Sathya"));
	}
}
