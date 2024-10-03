package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Time t = new Time(21, 21, 39);

		System.out.printf("%02d:%02d:%02d%n", t.getHour(), t.getMinute(), t.getSecond());
		t.setHour(22);
		t.setMinute(34);
		t.setSecond(0);
		System.out.printf("%02d:%02d:%02d%n", t.getHour(), t.getMinute(), t.getSecond());
	}
}


class Time {
	private String m_timeStr;
	//...

	public Time(int hour, int minute, int second)
	{
		//...
		m_timeStr = "%02d:%02d:%02d".formatted(hour, minute, second);
	}

	public int getHour()
	{
		return Integer.parseInt(m_timeStr.substring(0, 2));
	}

	public void setHour(int value)
	{
		//...
		m_timeStr = "%02d:%02d:%02d".formatted(value, getMinute(), getSecond());
	}

	//21:03:24
	public int getMinute()
	{
		return Integer.parseInt(m_timeStr.substring(3, 5));
	}

	public void setMinute(int value)
	{
		//...
		m_timeStr = "%02d:%02d:%02d".formatted(getHour(), value, getSecond());
	}

	public int getSecond()
	{
		return Integer.parseInt(m_timeStr.substring(6));
	}

	public void setSecond(int value)
	{
		//...
		m_timeStr = "%02d:%02d:%02d".formatted(getHour(), getMinute(), value);
	}

	//...
}