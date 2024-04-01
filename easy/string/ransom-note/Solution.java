class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0;i< ransomNote.length();i++){
            int indexOfLetter= magazine.indexOf(String.valueOf(ransomNote.charAt(i)));
            if(indexOfLetter==-1)
                return false;
            StringBuilder magazine1 = new StringBuilder(magazine);
            magazine1.setCharAt(indexOfLetter, '0');
            magazine=magazine1.toString();
        }
        return true;
    }
}