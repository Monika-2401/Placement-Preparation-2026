class Solution {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int number) {
        // code here
         int sum =0;
         for(int i=1;i<=number;i++){
             sum = sum+(i*i);
         }
         return sum;
         
    }
}