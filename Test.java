1.
假设按照升序排序的数组在预先未知的某个点上进行了旋转。

( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。

你可以假设数组中不存在重复的元素。

你的算法时间复杂度必须是 O(log n) 级别。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>=nums[l]){
                if(target<nums[mid]&&target>=nums[l]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(target>nums[mid]&&target<=nums[r]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}

2.
给定一个只包含整数的有序数组，每个元素都会出现两次，
唯有一个数只会出现一次，找出这个数。
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            if(mid!=0&&nums[mid]==nums[mid-1]){
                if((mid-l)%2==0){
                    r=mid-2;
                }else{
                    l=mid+1;
                }
            }else if(mid!=nums.length-1&&nums[mid]==nums[mid+1]){
                if((r-mid)%2==0){
                    l=mid+2;
                }else{
                    r=mid-1;
                }
            }else{
                return nums[mid];
            }
        }
        return -1;
    }
}