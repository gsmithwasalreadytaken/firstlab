"3 Discussion Questions"

1.) What would be a really simple solution if n were not an argument, i.e., if it were always 17?

A.) if n== 17{
System.out.println("1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizz buzz, 16, 17"
} 

2.) How could you have automatically tested your initial solution from part 2?

Use the assert.Equals() function to test if the output matches the example from part 2. 

3.) What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?

Part 2 is an if-else statement with a for-loop with nested if-else statements.
Part 3 is an Array with the same characteristics.
Part 4 is an ArrayList with the same characteristics.
Part 2 and Part 3 would be the best option. An ArrayList is slower than an Array because an Array has a fixed set of numbers to work with. The Array (Part 3) should be as fast as the raw code in Part 2.
