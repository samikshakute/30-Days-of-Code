**Task:** </br>
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

**Input Format:** </br>
A single line containing a positive integer, n.

**Constraints:** </br>
1 <= n <= 100

**Output Format:** </br>
Print Weird if the number is weird; otherwise, print Not Weird.

**Sample Input 0:** </br>
3

**Sample Output 0:** </br>
Weird

**Sample Input 1:** </br>
24

**Sample Output 1:** </br>
Not Weird

**Explanation:** </br>
Sample Case 0: </br>
n = 3 </br>
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: </br>
n = 24 </br>
n > 20 and n is even, so it is not weird. Thus, we print Not Weird.