class Solution {
    public String firstPalindrome(String[] words) {
        // O(m*n) - m: average length of each word, n: size of words array.
        for (int i = 0; i<words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            String arrString = words[i];
            String revString = sb.reverse().toString();

            if (arrString.equals(revString)) {
                return revString;
               
            } 
           // System.out.println(arrString + " " + revString);
        }
        return "";
    }
}