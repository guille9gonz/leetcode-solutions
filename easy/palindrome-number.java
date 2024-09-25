class Solution {
    public boolean isPalindrome(int x) {
        String numberStr = Integer.toString(x);
        for (int i = 0; i < numberStr.length()/2; i++){
            if (numberStr.charAt(i) != numberStr.charAt(numberStr.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
