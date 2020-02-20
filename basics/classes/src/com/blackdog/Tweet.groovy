package com.blackdog

@groovy.transform.ToString()
class Tweet {
	int likes
	int retweets
	String head
	String content
	
	Tweet() {
		likes = retweets = 0;
		head = content = null;
	}
}
