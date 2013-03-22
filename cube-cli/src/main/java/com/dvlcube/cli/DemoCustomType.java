package com.dvlcube.cli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoCustomType {
	private int a;
	private String b;
	private Date c;

	public DemoCustomType(int a, String b, Date c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public DemoCustomType(String string) {
		String[] fields = string.split(";");
		a = Integer.parseInt(fields[0]);
		b = fields[1];
		try {
			c = new SimpleDateFormat("yyyy-MM-dd").parse(fields[2]);
		} catch (ParseException e) {
		}
	}

	public static DemoCustomType valueOf(String string) {
		return new DemoCustomType(string);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public Date getC() {
		return c;
	}

	public void setC(Date c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "DemoCustomType [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
