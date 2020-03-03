// implicit parameters
def foo = {
    println it
}
foo("dan")

// no parameters
def bar = {
    println "no parameters"
}

// mutiple paremters
def sayHello = { first, last ->
    println "Hello $first $last"
}

sayHello("Liam", "Song")

// explicit parameters and default parameter
def greeting = { String first, String last ->
    println "Hello $first, $last"
}
greeting("Liam", "Song")

// var-args
def concat = {String... args -> 
    args.join('')
}
println concat('abc', 'def', 'ghi', 'jkl')

// Closure Properties
def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = {int x, int y -> x + y}
someMethod(someClosure)
