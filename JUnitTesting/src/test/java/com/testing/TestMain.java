package com.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.code.Demo;
import com.code.Employee;
import com.code.EmployeeUtility;
import com.code.Key_Value;

public class TestMain {
   
	Demo demo;
	List<Employee> list;
	EmployeeUtility utility;
	@Before
	public void setUp(){
		demo = new Demo();
		list = new ArrayList();
		list.add(new Employee(101,"Kumar"));
		list.add(new Employee(102,"Vikram"));
		list.add(new Employee(103,"Ankit"));
		list.add(new Employee(104,"Mayank"));
		list.add(new Employee(105,"Ravi"));
		
		utility = new EmployeeUtility();
	}
	
	//assertEquals
	
	@Test
	public void testsumOfElements(){
		int num = -10;
		int expectedOutput = -1;
		assertEquals(expectedOutput,demo.sumOfDigit(num));
	}
	
	//assertTrue
	//assertFalse
	
	@Test
	public void testisEven(){
		int num= 13;
		//assertTrue(demo.isEven(num));
		assertFalse(demo.isEven(num));
	}
	
	//assertArrayEquals: 
	@Test
	public void testgetSortedName(){
		String[] expectedArray = {"Ankit","Kumar","Mayank","Ravi","Vikram"};
		assertEquals(expectedArray,utility.getSortedName(list));
	}
	
	//assertSame
	//assertNotSame
	@Test
	public void checkString(){
		String str = new String("Java");
		String str2 = "Java";
		String str3 = "Java";
		String str4 = str.intern();
		//assertSame(str4,str2);
		assertNotSame(str,str3);
	}
	
	//assertNull
	//assertNotNull
	
	@Test
	public void testgetValue(){
		String key = "key3";
		//assertNull(Key_Value.getValue(key));
		assertNotNull(Key_Value.getValue(key));
	}
}
