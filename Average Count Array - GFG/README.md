# Average Count Array
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You are given an integer '<strong>n</strong>' which denote the number of elements in&nbsp;an&nbsp;array <strong>a[ ]</strong> and an integer '<strong>x</strong>'. You have to calculate the average of element <strong>a[i]</strong> and <strong>x</strong> and find out if that number exist in array or not. Do it for all the elements of array and store the count result in another array for each index <strong>i</strong>.</span></p>

<p><span style="font-size:18px"><strong>Note:</strong> Always take the floor value of the average.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {2, 4, 8, 6, 2} and X = 2
<strong>Output :</strong> 2 0 0 1 2
<strong>Explanation:</strong>
value of n is 5 and that of x is 2. 
The array is 2 4 8 6 2. We take x 
i.e. 2 and take average with a[0] 
whch is equal to 2. We found&nbsp;2 resides 
in array&nbsp;at two&nbsp;positions (1st and 5th 
element) thus storing 2 in another 
array at 0th index. Similarly do for all 
elements and store the count in second 
array.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {9, 5, 2, 4, 0, 3} 
        and X = 3 <strong>
Output :</strong>  0 1 1 1 0 1 </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong></span><br>
<span style="font-size:18px">This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>countArray()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, an integer <strong>X,</strong> and return the resultant array in which you have to calculate the number of times the average of a[i] and x&nbsp;occurs in the array for each&nbsp;index i. The driver code takes care of the printing.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N<sup>2</sup>).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>

<p><br>
<br>
<span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 ≤ N&nbsp;≤ 100</span><br>
<span style="font-size:18px">1 ≤ X&nbsp;≤ 100</span><br>
<span style="font-size:18px">1 ≤ a[i] ≤ 100</span></p>
</div>