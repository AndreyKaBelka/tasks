## Problem situation
***
Consider the following algorithm for generating a sequence of numbers. Let's start with an integer **n**. 
If **n** is even, then divide it by 2. If **n** is odd, then multiply it by 3 and add 1. 
We will repeat this process with the new received number until it becomes equal to 1. 
For example, for n = 22, the following sequence of numbers will be generated:

22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1

It is believed (but not yet proven) that this algorithm will reduce to n = 1 for any integer **n**. At least, 
this assumption is true for all integers up to 1,000,000.

For a given **n**, the length of the cycle **n** will be the number of generated numbers up to 1(including). 
In the example above, the length of loop 22 is 16. For two given numbers *i* and *j*, 
you must determine the maximum loop length for all numbers between *i* and *j*, including both endpoints.
***
The programm was written using Java and JUnit tests, also I used Maven framework.
