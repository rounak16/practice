class Solution:
    def minCostClimbingStairs(self, cost):
        d = len(cost)  # Get the number of steps in the cost list
        d = d + 1  # Increment the number of steps by 1 to account for reaching the top

        arr = [0] * (d + 2)  # Create an array `arr` to store the minimum cost to reach each step, including two extra steps at the beginning
        arr[2] = 0  # Initialize the cost to reach the 2nd step as 0
        arr[1] = 0  # Initialize the cost to reach the 1st step as 0

        for i in range(3, d + 1):
            # Calculate the minimum cost to reach the current step (i)
            # The minimum cost can be either by taking a single step from the previous step (i - 1) or by taking two steps from the step before that (i - 2)
            # The cost is determined by the `cost` list, which stores the cost for each step
            arr[i] = min(cost[i - 3] + arr[i - 2], cost[i - 2] + arr[i - 1])

        return arr[d]  # Return the minimum cost to reach the top step (d)