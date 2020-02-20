package com.blackdog

// java sample pattern
import java.util.regex.*;
Pattern javaPattern = Pattern.compile("a\\\\b");
println javaPattern
println javaPattern.getClass().getName()


// in Groovy
String slashy = /a\b/
String url = $/https://hanyang.ac.kr/$

println slashy.getClass().getName()

def groovyPattern = ~/a\b/
println groovyPattern.getClass().getName()

// Find 
def text = "If you cat't explain it simply, you don't understant it well enough!"
def pattern = ~/explain it simply/
def finder = text =~ pattern

println finder
println finder.size()

// Replace
pattern = ~/understant/
text = text.replaceFirst(pattern, "understand")
println text

// Match
def sentence = "iotex"
mathcher = ~/iotex/
if (sentence ==~ mathcher) {
	println mathcher
}

