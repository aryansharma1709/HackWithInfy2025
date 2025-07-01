# Greedy Algorithm Problems

## 1. Maximum Units on Truck

### Brute Force Approach
**Solution Steps:**
1. Generate all possible combinations of boxes that can fit in the truck
2. For each valid combination, calculate the total units
3. Keep track of the maximum units found
4. Return the maximum units

**Time Complexity:** O(2^n)  
**Space Complexity:** O(n)

### Optimized Approach (Greedy)
**Solution Steps:**
1. Sort the box types in descending order based on units per box
2. Initialize sum = 0 to track total units
3. Iterate through sorted box types:
   - If truck can accommodate all boxes of current type, take all boxes
   - Add (number of boxes × units per box) to sum
   - Reduce truck size by number of boxes taken
   - If truck has some space but less than total boxes, take remaining capacity
   - Add (remaining capacity × units per box) to sum and stop
4. Return the total sum

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)

---

## 2. Maximum Length of Pair Chain

### Brute Force Approach
**Solution Steps:**
1. Generate all possible subsequences of pairs
2. For each subsequence, check if it forms a valid chain by verifying:
   - Each pair's second element is less than the next pair's first element
3. Keep track of the length of the longest valid chain found
4. Return the maximum length

**Time Complexity:** O(2^n)  
**Space Complexity:** O(n)

### Optimized Approach (Greedy)
**Solution Steps:**
1. Sort all pairs by their ending time (second element) in ascending order
2. Initialize count = 1 (select the first pair)
3. Set lastEnd = ending time of first pair
4. Iterate through remaining pairs:
   - If current pair's start time > lastEnd:
     - Increment count (select this pair)
     - Update lastEnd to current pair's ending time
5. Return the count

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)