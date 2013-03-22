package com.dvlcube.cli;

/**
 * Try running with these arguments:
 * <p>
 * --debug --verbosity 5 --activated false --money .5 --more-money 1.6
 * --file-name foo.txt --dirs H:\tmp\a H:\tmp\b "H:\tmp\c_ _space" --random 1 6
 * 8 99 --custom 1;foo;2013-03-22
 * 
 * @since 22/03/2013
 * @author wonka
 */
public class DemoApp {
	private static DemoArgs options;

	public static void main(String[] args) {
		options = DemoArgs.init(args);
		log(options);
	}

	public static void log(Object object) {
		System.out.println(object);
	}
}
