package edu.ycp.cs481.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs481.model.SOP;

public class SOPTest{
	private SOP sop;
	
	@Before
	public void setup(){
		sop = new SOP();
		sop.setTitle("How to Avoid Sexual Harassment");
		sop.setDescription("A how-to guide for men on avoiding sexually harassing women in the workplace environment.");
		sop.setPriority(1);
		sop.setID(5);
		sop.setAuthorID(70);
		sop.setVersion(2);
		sop.setComplete(false);
	}
	
	@Test
	public void testGetTitle(){
		assertEquals("How to Avoid Sexual Harassment", sop.getTitle());
	}
	
	@Test
	public void testGetDescription(){
		assertEquals("A how-to guide for men on avoiding sexually harassing women in the workplace environment.", 
				sop.getDescription());
	}
	
	@Test
	public void testGetPriority(){
		assertEquals(1, sop.getPriority());
	}
	
	@Test
	public void testGetID(){
		assertEquals(5, sop.getID());
	}
	
	@Test
	public void testGetAuthorID(){
		assertEquals(70, sop.getAuthorID());
	}
	
	@Test
	public void testGetVersion(){
		assertEquals(2, sop.getVersion());
	}
	
	@Test
	public void testSetTitle(){
		// Ensure that name was set correctly in constructor.
		testGetTitle();
		
		// Change name
		sop.setTitle("How to Avoid Sexual Harassment (For Men)");
		
		// Test new name
		assertEquals("How to Avoid Sexual Harassment (For Men)", sop.getTitle());
	}
	
	@Test
	public void testSetDescription(){
		// Ensure that description was set correctly in constructor.
		testGetDescription();
		
		// Change description
		sop.setDescription("A how-to guide for men on avoiding sexually harassing women in the workplace environment, "
				+ "Sixty-Ninth Edition");
		
		// Test new description
		assertEquals("A how-to guide for men on avoiding sexually harassing women in the workplace environment, "
				+ "Sixty-Ninth Edition", sop.getDescription());
	}
	
	@Test
	public void testSetPriority(){
		// Ensure that priority was set correctly in constructor.
		testGetPriority();
		
		// Change priority
		sop.setPriority(100);
		
		// Test new priority
		assertEquals(100, sop.getPriority());
	}
	
	@Test
	public void testSetID(){
		// Ensure that ID was set correctly in constructor.
		testGetID();
		
		// Change ID
		sop.setID(1);
		
		// Test new ID
		assertEquals(1, sop.getID());
	}
	
	@Test
	public void testSetAuthorID(){
		// Ensure that Author ID was set correctly in constructor.
		testGetAuthorID();
		
		// Change Author ID
		sop.setAuthorID(25);
		
		// Test new Author ID
		assertEquals(25, sop.getAuthorID());
	}
	
	@Test
	public void testSetVersion(){
		//Ensure SOP version was set correctly in the constructor 
		//testSetVersion(); 
		
		//set a new revision
		sop.setVersion(4);
		
		//test the new revision 
		assertEquals(4, sop.getVersion());
		
	}
	
	@Test
	public void testComplete() {
		assertFalse(sop.isComplete());
	}
	
	@Test
	public void testSetAsComplete() {
		sop.setComplete(true);
		assertTrue(sop.isComplete());
	}
	
}

