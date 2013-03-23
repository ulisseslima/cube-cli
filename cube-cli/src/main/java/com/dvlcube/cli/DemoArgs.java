package com.dvlcube.cli;

import java.util.Date;

/**
 * This is a class created to demonstrate how command line arguments are mapped
 * when using CLArgs.
 * <p>
 * For simplicity, the class is a normal class with only public fields.
 * 
 * @since 23/03/2013
 * @author wonka
 */
public class DemoArgs extends CLArgs {
	public Boolean debug = false;
	public Boolean activated = true;
	public Integer verbosity = 1;
	public Double money;
	public Double moreMoney;
	public Date date;
	public String fileName;
	public String[] dirs;
	public Integer[] random;
	public DemoCustomType custom;

	public static DemoArgs init(String[] args) {
		return (DemoArgs) new DemoArgs().process(args);
	}
}
