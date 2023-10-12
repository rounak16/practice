/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
public int findInMountainArray(int target, MountainArray arr) {
	var peak = getPeakIndex(arr);
	var idx = binarySearch(arr, 0, peak, target, true);
	return idx == -1 ? binarySearch(arr, peak + 1, arr.length() - 1, target, false) : idx;
}


private int getPeakIndex(MountainArray arr) {
	var low = 0;
	var high = arr.length() - 1;

	while (low < high) {
		var mid = low + (high - low) / 2;
		if (arr.get(mid) > arr.get(mid + 1))
			high = mid;
		else
			low = mid + 1;
	}
	return low;
}


private int binarySearch(MountainArray arr, int low, int high, int target, boolean isAscending) {
	while (low <= high) {
		var mid = low + (high - low) / 2;
		if (arr.get(mid) == target)
			return mid;
		if (isAscending) {
			if (arr.get(mid) < target)
				low = mid + 1;
			else
				high = mid - 1;
		} else {
			if (arr.get(mid) < target)
				high = mid - 1;
			else
				low = mid + 1;
		}
	}
	return -1;
}
}
