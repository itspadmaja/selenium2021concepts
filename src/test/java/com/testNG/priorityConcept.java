package com.testNG;

import org.testng.annotations.Test;

public class priorityConcept {
	
	@Test
	public void aTest() {
		System.out.println("a");
	}
	@Test
	public void bTest() {
		System.out.println("b");
	}
	@Test(priority = 3)
	public void cTest() {
		System.out.println("c");
	}
	@Test(priority = 1)
	public void dTest() {
		System.out.println("d");
	}
	@Test(priority = 2)
	public void eTest() {
		System.out.println("e");
	}

}
