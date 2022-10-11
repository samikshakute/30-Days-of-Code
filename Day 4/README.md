~~**Task:** </br>
Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter. The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative; if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0. In addition, you must write the following instance methods:

* yearPasses() should increase the age instance variable by 1.
* amIOld() should perform the following conditional actions:
    * If age < 13, print You are young..
    * If age >= 13 and age < 18, print You are a teenager..
Otherwise, print You are old.

**Input Format:** </br>

The first line contains an integer, T(the number of test cases), and the  subsequent lines each contain an integer denoting the age of a Person instance.

**Constraints:** </br>
1 <= T <=4 </br>
-5 <= age <= 30

**Sample Input:** </br>
4 </br>
-1 </br>
10 </br>
16 </br>
18

**Sample Output:** </br>
Age is not valid, setting age to 0. </br>
You are young.  </br>
You are young. </br>

You are young. </br>
You are a teenager. </br>

You are a teenager. </br>
You are old. </br>

You are old. </br>
You are old.~~
