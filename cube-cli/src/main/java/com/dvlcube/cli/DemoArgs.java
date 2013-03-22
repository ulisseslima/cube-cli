package com.dvlcube.cli;

import java.util.Date;

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
