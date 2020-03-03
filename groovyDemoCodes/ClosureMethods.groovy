// each and eachWithIndex
List favNums = [2, 21, 44, 35, 4]
for (num in favNums) {
    print num + " "
}
println("")

favNums.each {print it + " "}
println("")

for (int i = 0; i < favNums.size(); ++i) {
    print "$i:${favNums[i]}" + " "
}
println("")

favNums.eachWithIndex { idx, num ->
    print "$idx:$num"
}
println("")

// findAll
List days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
List weekend = days.findAll { it.startsWith("S") }

println days
println weekend

// collect
List nums = [1, 2, 2, 7, 2, 8, 2, 4, 6, 2]
List numsTimesTen = []
nums.each { num ->
    numsTimesTen << num * 10
}
println nums
println numsTimesTen

List numTimesTen = nums.collect { num -> num * 10 }
println numTimesTen