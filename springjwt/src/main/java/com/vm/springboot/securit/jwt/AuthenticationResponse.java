package com.vm.springboot.securit.jwt;

public class AuthenticationResponse {
String jwt;

/**
 * @param jwt
 */
public AuthenticationResponse(String jwt) {
	super();
	this.jwt = jwt;
}

/**
 * @return the jwt
 */
public String getJwt() {
	return jwt;
}


}
