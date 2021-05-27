package ro.ase.csie.cts.g1092.testing.tests;

import ro.ase.csie.cts.g1092.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongGradesException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1092.testing.models.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;



public class TestStudent {

	// test fixture
    static Student student;
    static ArrayList<Integer> grades;
    static String initialName;
    static int initialAge;

    @BeforeClass 
    public static void beforeClass() throws Exception {
        grades = new ArrayList<>();
        grades.add(9);
        grades.add(10);
        initialName = "John";
        initialAge = 21;
    }

    @AfterClass 
    public static void tearDownAfterClass() throws Exception {
    	grades.clear();
    	grades=null;

    }

    @Before 
    public void setUp() throws Exception {
    	student = new Student(initialName, initialAge, grades);
    }

    @After 
    public void tearDown() throws Exception {
    	student = null;
    }

    @Ignore
    @Test
    public void test() {
        fail("not implemented");
    }

    @Test
    public void testSetNameRightValues() throws WrongNameException {


        String newName = "Alice";
        
        student.setName(newName);

        assertEquals("Testing with proper name", newName, student.getName());
    }

    @Test
    public void setAgeRightValues() {
    	int newAge = initialAge +1;
    	try {
			student.setAge(newAge);
			assertEquals("Testing for proper age value", newAge, student.getAge());
		} catch (WrongAgeException e) {
			fail("We got an exception when that was not expected");
		}
    }
    
    @Test
    public void testSetNameErrorCondition() {
    	String newName = "Io";
    	try {
			student.setName(newName);
			fail("We didn't get the expected exception");
		} catch (WrongNameException e) {
			assertTrue(true);
		}
    }
    
    // equivalent of the previous one
    @Test(expected = WrongAgeException.class)
    public void testSetAgeErrorCondition() throws WrongAgeException {
    	int newAge = -4;
    	student.setAge(newAge);
    }
    
    @Test
    public void testGetMinGradeOrderingAsc() throws WrongGradesException {
    	ArrayList<Integer> orederedGrades = new ArrayList<>();
    	orederedGrades.add(7);   	
    	orederedGrades.add(8);   	
    	orederedGrades.add(9);   	
    	
    	student.setGrades(orederedGrades);
    	
    	int expectedGrade = 7;
    	int minGrade = student.getMinGrade();
    	
    	assertEquals("Testing with an ordered array of grades",  expectedGrade, minGrade);
    }
    
	@Test 
	public void testGetMinGradeCardinalityZero() throws WrongGradesException {
		ArrayList<Integer> emptyGrades = new ArrayList<>();
		student.setGrades(emptyGrades);
		
		int expectedGrade = 0;
		int minGrade = student.getMinGrade();
		
		assertEquals("Testing with zero grades", expectedGrade, minGrade);
	}
	 
	@Test 
	public void testGetMinGradeCardinalityOne() throws WrongGradesException {
		int singleGrade = 9;
		ArrayList<Integer> oneGrade = new ArrayList<>();
		oneGrade.add(singleGrade);
		student.setGrades(oneGrade);
		
		int expectedGrade = singleGrade;
		int minGrade = student.getMinGrade();
		
		assertEquals("Testing with one grade", expectedGrade, minGrade);
	}
	
	@Test
	public void testSetNameInverseRelation() throws WrongNameException {
		String newName = "Alice";
		student.setName(newName);
		
		assertNotEquals(initialName, student.getName());
	}
}