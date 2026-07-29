class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        String sa[] = s.split("[^a-z0-9]");
        for(String t: sa)sb.append(t);
        String sf = sb.toString();
        int i = 0 , j = sf.length()-1;
        while(i<j){
            if(sf.charAt(i)!=sf.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
