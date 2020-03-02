// Array List
List firstList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
println firstList
println firstList.class.name

// Linked List
List secondList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] as LinkedList
println secondList
println secondList.class.name

// add 
firstList.push(11)
firstList.putAt(0,0)
println firstList

println firstList + [12, 13, 14, 15]

// shift
firstList << 16
println firstList

// remove
firstList.pop()
firstList.removeAt(0)
firstList.push(1)
def newList = firstList - 1
println newList

// get 
println firstList.getAt(4)
println firstList[4]
println firstList[4..5]

// loop
for (x in firstList) {
    print x + " "
}
println ""

// flatten
firstList << [3, 4, 5]
println firstList
println firstList.flatten()


// unique
firstList << 1
println firstList
println firstList.unique()

// set
secondList = [1, 1, 1, 1, 1, 1, 1]
println secondList
println secondList as Set

// sort
firstList = [10, 9, 8, 4, 2, 1, 3, 5, 6]
println firstList as SortedSet

// clear
firstList.clear()
println firstList

