class Solution {
    public boolean isAnagram(String s, String t) {
        char c[] = s.toCharArray();
        char d[]= t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(c.length!= d.length)return false;
        for(int i = 0 ; i<c.length;i++){
            if(c[i]!=d[i])return false;
        }
        return true;
        
    }
}
