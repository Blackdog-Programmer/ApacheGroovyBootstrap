package com.blackdog

@groovy.transform.TypeChecked
@groovy.transform.ToString
class TypeCheckedExample {
	String lastName
	String firstName
	
	TypeCheckedExample(String _lastName, String _firstName) {
		this.lastName = _lastName;
		this.firstName = _firstName;
	}
}
