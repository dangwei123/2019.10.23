1.
给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
class Solution {
    public int findLength(int[] A, int[] B) {
        int maxlen=0;
       for(int i=0;i<A.length-maxlen;i++){
           for(int j=0;j<B.length;j++){
               int len=0;
               int a=i;
               int b=j;
               while(a<A.length&&b<B.length&&B[b]==A[a]){
                   len++;
                   a++;
                   b++;
               }if(len>maxlen){
                   maxlen=len;
               }
           }
       }
        return maxlen;
    }
}

2.
