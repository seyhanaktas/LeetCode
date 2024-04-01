class Solution {
    public boolean isHappy(int n) {
        Set<Integer> vals= new HashSet<Integer>();

        while(n!=1){
            if(vals.contains(n))
                return false;
            vals.add(n);
            int tempN= 0;
            while(n>0){
                int tmp= n%10;
                tempN+=tmp*tmp;
                n/=10;
            }
            n= tempN;
        }
        return true;
    }
}