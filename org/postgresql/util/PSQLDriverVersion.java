/*-------------------------------------------------------------------------
 *
 * Copyright (c) 2004, PostgreSQL Global Development Group
 *
 * IDENTIFICATION
 *	  $PostgreSQL$
 *
 *-------------------------------------------------------------------------
 */
package org.postgresql.util;

import org.postgresql.Driver;

/**
 * This class holds the current build number and a utility program to print
 * it and the file it came from.  The primary purpose of this is to keep
 * from filling the cvs history of Driver.java.in with commits simply
 * changing the build number.  The utility program can also be helpful for
 * people to determine what version they really have and resolve problems
 * with old and unknown versions located somewhere in the classpath.
 */
public class PSQLDriverVersion {

	public static int buildNumber = 307;

	public static void main(String args[]) {
		Driver driver = new Driver();
		java.net.URL url = driver.getClass().getResource("/org/postgresql/Driver.class");
		System.out.println(driver.getVersion());
		System.out.println("Found in: " + url);
	}

}