package modelTests;
 
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import model.Position;
import model.SOP;

public class PositionTest {
	private Position p1, p2, p3, p4;
	private SOP req1, req2, req3, req4;
	private ArrayList<Position> positionList; 
	
	@Before
	public void setUp() {
		
		p1 = new Position();
		p2 = new Position();
		p3 = new Position();
		p4 = new Position();
		positionList = new ArrayList<Position>();
		
		p1.setID(1);
		p1.setPriority(1);
		p1.setRequirements(req1);
		p1.setTitle("CEO");
		
		p2.setID(10);
		p2.setPriority(4);
		p2.setRequirements(req2);
		p2.setTitle("Manager");
		
		p3.setID(0);
		p3.setPriority(0);
		p3.setRequirements(req3);
		p3.setTitle("Admin");
		
		p4.setID(999);
		p4.setPriority(8);
		p4.setRequirements(req4);
		p4.setTitle("Maintenance");
		
		positionList.add(p3);
		positionList.add(p4);
	}
	
	@Test
	public void testID() {
		assertEquals(1, p1.getID());
		assertEquals(10, p2.getID());
		assertEquals(0, positionList.get(0).getID());
		assertEquals(999, positionList.get(1).getID());
	}
	
	@Test
	public void testPriority() {
		assertEquals(1, p1.getPriority());
		assertEquals(4, p2.getPriority());
		assertEquals(0, positionList.get(0).getPriority());
		assertEquals(8, positionList.get(1).getPriority());
	}
	
	@Test 
	public void testRequirements() {
		assertEquals(req1, p1.getRequirements());
		assertEquals(req2, p2.getRequirements());
		assertEquals(req3, positionList.get(0).getRequirements());
		assertEquals(req4, positionList.get(1).getRequirements());
	}
	
	@Test
	public void testTitle() {
		assertEquals("CEO", p1.getTitle());
		assertEquals("Manager", p2.getTitle());
		assertEquals("Admin", positionList.get(0).getTitle());
		assertEquals("Maintenance", positionList.get(1).getTitle());
	}
}