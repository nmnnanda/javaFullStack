package com.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.mockitotest.StudentService;
import com.mockitotest.utility.StudentUtility;

public class MockitoTest {
    StudentService service = Mockito.mock(StudentService.class);
	StudentUtility utility;
    @Before
    public void setUp(){
    utility = new StudentUtility(service);
    }
	@Test
	public void testgetAverage(){
		Mockito.when(service.getTotalMarks()).thenReturn(500);
		Mockito.when(service.getTotalStudents()).thenReturn(10);
		int expectedOutput = 50;
		assertEquals(expectedOutput,utility.getAverage());
		
		
	}
}
