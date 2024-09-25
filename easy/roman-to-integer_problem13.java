class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int now = 0;
        int prev = 0;
        for (int i = s.length()-1; i >= 0; i--){
            switch (s.charAt(i)){
                case 'I':
                    now = 1;
                    break;
                case 'V':
                    now = 5;
                    break;
                case 'X':
                    now = 10;
                    break;
                case 'L':
                    now = 50;
                    break;
                case 'C':
                    now = 100;
                    break;
                case 'D':
                    now = 500;
                    break;
                case 'M':
                    now = 1000;
                    break;
            }

            if (now < prev){
                num -= now;
            } else {
                num += now;
            }

            prev = now;
        }
        return num;
    }
}
