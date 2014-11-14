/**
 * @author Mikhail Andrenkov
 * Course Information
 */
public class Course {
	
	private String [] courseInfo = new String [7];
	private String [] courseDays;

	/* courseInfo:
	 * 0: Code
	 * 1: Department
	 * 2: Name
	 * 3: Term
	 * 4: Component
	 * 5: Instructor
	 * 6: Location
	*/
	
	/* courseDays
	 * [0 -> -3]: Days
	 * [-2 -> -1]: Times
	 */
	
	/**
	 * 
	 * @param info
	 * @param days
	 * 
	 * Constructor
	 */
	public Course(String [] info, String [] days)
	{
		courseDays = new String [days.length];
		
		courseInfo = info.clone();
		courseDays = days.clone();
		
		for (byte a = 0 ; a < 7 ; a ++)
		{
			System.out.println(courseInfo[a]);
		}
	}
	
	protected String getCode()
	{
		return courseInfo[0];
	}
	
	protected String getDepartment()
	{
		return courseInfo[1];
	}

	protected String getName()
	{
		return courseInfo[2];
	}
	
	protected String getTerm()
	{
		return courseInfo[3];
	}

	protected String getComponent()
	{
		return courseInfo[4];
	}
	
	protected String getInstructor()
	{
		return courseInfo[5];
	}

	protected String getLocation()
	{
		return courseInfo[6];
	}
	
	protected void getDays(String [] days)
	{
		for (byte day = 0; day < courseDays.length - 2; day ++)
		{
			days [day] = courseDays[day];
		}
	}
	
	protected void getTimes(String [] times)
	{
		times [0] = courseDays[courseDays.length-1];
		times [1] = courseDays[courseDays.length-2];
	}
	
	protected void getCourseInfoArray(String [] info)
	{
		info = courseInfo.clone();
	}
	
	protected String getCourseInfo(byte infoIndex)
	{
		return courseInfo[infoIndex];
	}
}
