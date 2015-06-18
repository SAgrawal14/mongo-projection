package com

class User {

	String email
	Address address

	static embedded = ["address"]

    static constraints = {
    }
}
