package com.dvlcube.cli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class was created for demonstrating how custom classes are supported out
 * of the box. The only requirement is having an implementation of valueOf.
 * 
 * @since 23/03/2013
 * @author wonka
 */
public class DemoCustomType {
	private int number;
	private String string;
	private Date date;

	public DemoCustomType(int number, String string, Date date) {
		this.number = number;
		this.string = string;
		this.date = date;
	}

	/**
	 * @param string
	 *            The String to parse from.
	 * @throws ParseException
	 *             If the given date string cannot be parsed.
	 * @since 23/03/2013
	 */
	public DemoCustomType(String string) throws ParseException {
		String[] fields = string.split(";");
		number = Integer.parseInt(fields[0]);
		this.string = fields[1];
		date = new SimpleDateFormat("yyyy-MM-dd").parse(fields[2]);
	}

	/**
	 * @param string
	 *            The String to parse from.
	 * @return The resulting DemoCustomType.
	 * @throws ParseException
	 *             If the given date string cannot be parsed.
	 * @since 23/03/2013
	 */
	public static DemoCustomType valueOf(String string) throws ParseException {
		return new DemoCustomType(string);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "DemoCustomType [number=" + number + ", string=" + string
				+ ", date=" + date + "]";
	}
}
