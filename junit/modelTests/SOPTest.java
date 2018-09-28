package modelTests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.SOP;

public class SOPTest{
	private SOP sop;
	
	@Before
	public void setup(){
		sop = new SOP("How to Avoid Sexual Harassment", "A how-to guide for men on avoiding sexually harassing women in "
				+ "the workplace environment.", 1, 5, 70);
	}
	
	@Test
	public void testGetName(){
		assertEquals("How to Avoid Sexual Harassment", sop.getName());
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
	public void testSetName(){
		// Ensure that name was set correctly in constructor.
		testGetName();
		
		// Change name
		sop.setName("How to Avoid Sexual Harassment (For Men)");
		
		// Test new name
		assertEquals("How to Avoid Sexual Harassment (For Men)", sop.getName());
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
}