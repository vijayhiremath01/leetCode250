# Two Sum – HashMap & Complement Concept (Complete Notes)

## 1. Problem Overview

The **Two Sum** problem asks us to find two different indices in an array such that the numbers at those indices add up to a given target. A solution is guaranteed to exist, and we cannot use the same element twice. The goal is not just to solve the problem, but to solve it **efficiently**.

---

## 2. Why Brute Force Is Not Ideal

The most basic approach is to check every possible pair of numbers using two nested loops. While this works, it has a time complexity of **O(n²)**, which becomes very slow for large arrays. This inefficiency forces us to think differently:

> Can we avoid checking the same pairs again and again?

This question leads to two key ideas:

* Remembering previously seen values
* Quickly checking whether a needed value already exists

---

## 3. The Complement Concept (Core Idea)

If two numbers add up to a target, then:

```
a + b = target
b = target − a
```

Here, **b** is called the **complement** of **a**.

### Meaning of Complement

For any current number `x`, its complement is the **missing number** needed to reach the target:

```
complement = target − x
```

Instead of searching for pairs, we ask one simple question for every number:

> “Have I already seen the number that completes the target with this value?”

If yes, the problem is solved.

---

## 4. Why HashMap Is Used

A **HashMap** stores data in **key–value pairs** and allows:

* Very fast insertion
* Very fast lookup (average **O(1)** time)

### What We Store in the HashMap

```
key   → number from array
value → index of that number
```

Example:

```
{ 2 → 0, 7 → 1 }
```

This allows us to instantly check whether a complement already exists and retrieve its index.

---

## 5. One-Pass Strategy (Why It Works)

We scan the array **from left to right only once**.

For each element:

1. Compute its complement (`target − currentNumber`)
2. Check if the complement already exists in the HashMap
3. If yes → return the stored index and current index
4. If no → store the current number and its index in the map

### Important Rule

**Always check before inserting.**
This prevents using the same element twice and correctly handles cases like `[3, 3]`.

---

## 6. Step-by-Step Example

### Input

```
nums = [2, 7, 11, 15]
target = 9
```

### Execution

* Start with empty HashMap

| Current Number | Complement | HashMap Before | Action               |
| -------------- | ---------- | -------------- | -------------------- |
| 2 (index 0)    | 7          | {}             | Store 2 → 0          |
| 7 (index 1)    | 2          | {2 → 0}        | Found → return [0,1] |

The solution is found immediately without checking all pairs.

---

## 7. Code (Optimal HashMap Solution)

```java
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

---

## 8. Time and Space Complexity

* **Time Complexity:** O(n)

    * Each element is processed once
* **Space Complexity:** O(n)

    * Extra space used by the HashMap

This is the most efficient possible solution for this problem.

---

## 9. Key Takeaways (Very Important)

* Complement = `target − currentNumber`
* HashMap is used for fast lookup of previously seen values
* Check for complement **before** inserting into the map
* Converts an O(n²) brute-force solution into an O(n) solution
* This pattern appears in many future DSA problems

---

## 10. What This Problem Teaches Beyond Two Sum

By solving Two Sum optimally, you learn:

* How to trade space for time
* How to use HashMaps effectively
* How to think in terms of “missing values”
* How to optimize naive solutions

This single concept is reused in problems like:

* Contains Duplicate
* Valid Anagram
* Subarray Sum Equals K
* Two Sum II
* 3Sum

---

### Final Mental Model

> For each number, don’t search for pairs — search for its missing partner.

This is the essence of **Two Sum using HashMap + Complement**.
