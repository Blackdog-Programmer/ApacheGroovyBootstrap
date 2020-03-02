Range r = 1..<10
println r
println r.class.name
println r.from
println r.to

assert (0..10).contains(0)
assert (0..10).contains(10) == true // exist
assert (0..10).contains(-1) == false // not exist


Date today = new Date()
Date oneWeekAway = today + 7
println today
println oneWeekAway

Range days = today..oneWeekAway
println days

Range letters = 'a'..'z'
println letters