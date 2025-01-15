def list = [1, 2, 3, 4, 5]

println list.each { it * 2 } //this will print the list and not the modified list

println list.collect { it * 2 } //this will return the modified list