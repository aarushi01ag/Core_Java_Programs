/*
package interviewquestions;
*/
/*
Find index where first bad version occurred with minimum api calls. O(logN). We have isBadVersionApi whoch checks the version
 Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement
a function to find the first bad version. You should minimize the number of calls
to the API.
 *//*

public class FindFirstBadVersionLeetCode {

    public static void main(String[] args){

      int n=6; //no of versions
      int left =0;
      int mid;
      int right=n;
      int result=n;
      while(left<=right){
          mid=(left+right)/2;
          if(isBadVersion(mid));
          {right=mid-1;}
          else{
              left=mid+1;
          }
          System.out.println(left);
      }
       }

}
*/
