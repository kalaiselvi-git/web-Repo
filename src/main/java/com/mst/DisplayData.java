package com.mst;


import java.io.Serializable;

/**
 * Servlet implementation class DisplayData
 */
public class DisplayData implements Serializable{
	private static final long serialVersionUID = 1L;
	public String stname,course;
	public int rollno,fees;
	public String getName()
	{
		return stname;
	}
	public String setName(String stname)
	{
		this.stname=stname;
		return stname;
	}
	public int getRollno()
	{
		return rollno;
	}
	public int setRollno(int rollno)
	{
		this.rollno=rollno;
		return rollno;
	}
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public int getFees()
	{
		return fees;
	}
	public int setFees(int fees)
	{
		this.fees=fees;
		return fees;
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayData() {
        super();
        // TODO Auto-generated constructor stub
    }

}
