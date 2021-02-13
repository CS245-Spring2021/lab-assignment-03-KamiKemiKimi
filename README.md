# Lab_Assignment_03 Analysis


Debrief:
Used insertion sort method to sort.
Then used wiggle sort by taking the lowest and 
highest values of the array alternatively.


Analysis:
The runtime of wiggle sort is O(n^2). This is because
I put insertion sort in the same function as wiggle sort.
And the worst case scenario is that all of the numbers were
reversed from greatest to least.
If insertion sort was a separate function, then wiggle sort
would be O(1) assuming that the array of random numbers
were sorted by insertion sort first.
The space analysis (although not required to mention) 
would be O(n) as there is an array declaration.
