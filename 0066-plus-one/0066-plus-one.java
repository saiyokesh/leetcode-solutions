class Solution {
    public int[] plusOne(int[] digits) {
       int[] res;
       boolean allnines = true;
       for(int n: digits){
        if(n!=9){
            allnines = false;
            break;
        }
       }
       if(allnines){
        res = new int[digits.length+1];
       }else{
        res = new int[digits.length];
       }
       int carry = 1;
       for(int i=digits.length-1;i>=0;i--){
        res[i] = (digits[i]+carry)%10;
        carry = (digits[i]+carry)/10;
       }
       if(res.length>digits.length){
            res[0] = 1;
       }
       return res;
    }
}