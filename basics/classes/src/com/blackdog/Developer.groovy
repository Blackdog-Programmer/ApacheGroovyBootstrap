package com.blackdog

class Developer {
	String first
	String last
	
	def languages = []
	
	void work() {
		println "$first $last is working"
	}
}
