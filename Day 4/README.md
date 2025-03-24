### Day 4: Class vs. Instance
**Task:** \
Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter. The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative; if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0. In addition, you must write the following instance methods:

* yearPasses() should increase the age instance variable by 1.
* amIOld() should perform the following conditional actions:
    * If age < 13, print You are young..
    * If age >= 13 and age < 18, print You are a teenager..
Otherwise, print You are old.

**Input Format:** \
The first line contains an integer, T(the number of test cases), and the  subsequent lines each contain an integer denoting the age of a Person instance.

**Constraints:**
- 1 <= T <=4
- -5 <= age <= 30

**Sample Input:**
```
4
-1
10
16
18
```

**Sample Output:**
```
Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.
```

**Explanation:**
1. Test Case 0: initial Age = -1 \
Because initialAge < 0, our code must set age to 0 and print the "Age is not valid..." message followed by the young message. Three years pass and age = 3, so we print the young message again.
2. Test Case 1: initialAge = 10 \
Because initialAge < 13, our code should print that the person is young. Three years pass and age = 13, so we print that the person is now a teenager.
3. Test Case 2: initialAge = 16 \
Because 13 ≤ initialAge < 18, our code should print the the person is a teenager. Three years pass and age = 19, so we print that the person is old.
4. Test Case 3: initialAge = 18 \
Because initialAge ≥ 18, our code should print that the person is old. Three years pass and the person is still old at age 21, so we print the old message again.

The extra line at the end of the output is supposed to be there and is trimmed before being compared against the test case's expected output. If you're failing this challenge, check your logic and review your print statements for spelling errors.
