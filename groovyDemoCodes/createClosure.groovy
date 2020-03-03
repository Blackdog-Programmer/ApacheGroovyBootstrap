// create Clsoure
Closure c = { }

println c.class.name
println c instanceof Closure

// anonymous fuction
def sayHello = { name -> 
    println "Hello, $name"
}

sayHello("Liam Song")

println("------------------------------------------------")

// 
List nums = [1, 4, 7, 4, 30, 2]
nums.each({ num -> 
    println num
})

println("------------------------------------------------")

// Closure are objects and last param
def timesTen(num, Closure) {
    Closure(num * 10)
}

timesTen(10, { println it })

println("------------------------------------------------")

10.times {
    println it
}

println("------------------------------------------------")

import java.util.Random
Random rand = new Random()
3.times {
    println rand.nextInt()
}