package base;

import static org.junit.Assert.*;


import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class PersonTest {
	
private static PersonDomainModel person1 = new PersonDomainModel();
private static PersonDomainModel person2 = new PersonDomainModel();
private static  LocalDate perbirth = LocalDate.of(1995, 12, 6);	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		person1 = new PersonDomainModel();
		person1.setFirstName("Lori");
		person1.setLastName("Blake");
		person1.setBirthday(perbirth);
		person1.setCity("Browntown");
		person1.setPostalCode(19048);
		person1.setStreet("1160 Philadelphia Pike");
		
		person2 = new PersonDomainModel();
		person2.setFirstName("Kilia");
		person2.setLastName("Jones");
		person2.setBirthday(perbirth);
		person2.setCity("Atlanta");
		person2.setPostalCode(86122);
		person2.setStreet("2008 Boom Blvd");
	
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		person1=null;
		person2=null;
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void addtest() throws Exception {
		PersonDAL.addPerson(person1);
		PersonDAL.addPerson(person2);
	}

	@Test
	public void gettest() throws Exception{
		String LastName1 = person1.getLastName();
		String LastName2 = person2.getLastName();
		assertEquals("Lori",LastName1);
		assertEquals("Kilia",LastName2);
	}
	
	@Test
	public void updatetest() throws Exception{
		
		person1.setFirstName("Lori");
		person2.setFirstName("Kilia");
		PersonDAL.updatePerson(person1);
		PersonDAL.updatePerson(person2);
	}
	
	@Test
	public void DeletePersonTest() throws Exception{
		PersonDAL.addPerson(person1);
}
}