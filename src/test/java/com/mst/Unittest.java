package com.mst;

import org.junit.Test;

import org.junit.Assert;
public class Unittest
{

@Test
public void test()
{
	DisplayData obj=new DisplayData();
	obj.rollno=0;
	//obj.getRollno();
	if(obj.rollno!=0)
	{
		
		System.out.println(obj.rollno);
		Assert.assertEquals(4444,obj.rollno);
	}
	else
	{
		Assert.fail("Rollno should not be Null");
	}
}


@Test
public void test1()
{
	DisplayData obj1=new DisplayData();
	obj1.stname="kalai";
	//obj.getRollno();
	if(obj1.stname!="null")
	{
		
		System.out.println(obj1.stname);
		Assert.assertEquals("kalai",obj1.stname);
	}
	else
	{
		Assert.fail("Name should not be Null");
	}
}

@Test
public void test2()
{
	DisplayData obj2=new DisplayData();
	obj2.course="MCA";
	//obj.getRollno();
	if(obj2.course!=null)
	{
		
		System.out.println(obj2.course);
		Assert.assertEquals("MCA",obj2.course);
	}
	else
	{
		Assert.fail("Course should not be Null");
	}
}

@Test
public void test4()
{
	DisplayData obj4=new DisplayData();
	obj4.fees=12000;
	//obj.getRollno();
	if(obj4.fees!=0)
	{
		
		System.out.println(obj4.fees);
		Assert.assertEquals(12000,obj4.fees);
	}
	else
	{
		Assert.fail("Course should not be Null");
	}
}
}


