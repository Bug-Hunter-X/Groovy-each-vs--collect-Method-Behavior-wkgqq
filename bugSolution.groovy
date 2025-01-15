def list = [1, 2, 3, 4, 5]

// Using each (doesn't modify the original list)
println list.each { println it * 2 } // Prints each element multiplied by 2, but doesn't change the original list
println "Original list after each: "+ list

// Using collect (creates a new list with modifications)
println "Modified list after collect: "+ list.collect { it * 2 } // Creates a new list with each element multiplied by 2
println "Original list after collect: "+ list