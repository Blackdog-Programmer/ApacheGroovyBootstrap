@groovy.transform.ToString
class Person {
    String first
    String last
    
    String getFullName() {
        "$first $last"
    }
    
    static String greeting() {
        "Hello Groovy World"
    }
    
    def concat(String... args) {
        println args.length
    }
}
Person me = new Person(first:"Liam",last:"Song")
println me.getFullName() // Liam Song
println Person.greeting() // Hello Groovy World

Person you = new Person()
you.concat("a", "b", "c", "d") // 4