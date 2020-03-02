Map map = [:]
println map
println map.getClass().getName() // Linked Hash Map

def person = [first:"Liam", last:"Song", email:"blackdogcode@gmail.com"]
println person

println person.first + ", " + person.last + ": " + person.email

person.twitter = "@blackdogcode"
println person

def hobby = "hobby"
person = [(hobby):"drum"]
println person

println person.size()
person = [first:"Liam", last:"Song", email:"blackdogcode@gmail.com"]
println person.sort()

for ( key in person.keySet() ) {
    println "$key:${person[key]}"
}

for ( entry in person ) {
    println entry
}