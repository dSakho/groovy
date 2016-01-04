package com.dsakho.rally.dao

import java.sql.Connection

/*
 * A closure in Groovy is an open, anonymous, block of code that can take arguments, 
 * return a value and be assigned to a variable. A closure may reference variables declared in its surrounding scope. 
 * In opposition to the formal definition of a closure, 
 * Closure in the Groovy language can also contain free variables which are defined outside of its surrounding scope
 */
class Connect {
	
	Connection conn;

	def start_connection = {
		Class.forName("org.h2.Driver")
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")
	}

	def close_connection = {
		if (conn != null && !conn.isClosed()) {
			conn.close()
		}
	}
}
