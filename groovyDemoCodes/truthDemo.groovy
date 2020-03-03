if ( true ) {
    println "true"
}

// Matcher
assert ('a' =~ /a/)
assert !('a' =~ /b/)

// Collection
assert [1]
assert ![]

// Map
assert [num:1]
assert ![:]

// String
assert 'a'
assert !''

// Number
assert 1
assert 3.5
assert !0

// None of above
assert new Object()
assert !null