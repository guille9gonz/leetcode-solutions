class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs[0].length() - 1; i++){
            boolean matches = true;
            char checking = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if (strs[j].charAt(i) != checking){
                    matches = false;
                    break;
                }
            }
            if (matches){
                prefix += checking;
            } else {
                break;
            }
        }
        return prefix;
    }
}
