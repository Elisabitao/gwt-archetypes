#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.server;

import org.springframework.stereotype.Service;
 
@Service
public class SpringService {

	public String echo(String input) {
		return "Hello " + input + " from Spring 3.1!";
	}
}