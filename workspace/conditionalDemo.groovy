// terneray operator
def firstMsg
def output = (firstMsg != null) ? firstMsg : "Hello World!"

def secondMsg = firstMsg ?: "Hello Groovy!"

println firstMsg
println output
println secondMsg

// switch
def num = 3.toFloat()
switch (num) {
    case 1:
        println "1"
        break
    case 2:
        println "2"
        break
    case 3..5:
        println "in range 3..5"
        break;
    case [6, 7, 8]:
        println "num is in list[6, 7, 8]"
        break;
    case Integer:
        println "integer number"
        break;
    case Float:
        println "float number"
        break;
    default:
        println "Not match number found"
}

// in
def validAges = 18..35
println validAges.getClass().getName() //groovy.lang.IntRange
println 20 in validAges