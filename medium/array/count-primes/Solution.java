class Solution {

    public int countPrimes(int n) {
        int m = (int)Math.sqrt(n)+1;
        boolean[] p = new boolean[n];
        for(int i=2;i<=m;i++){
            for(int j=i*2;j<p.length;j+=i){
                p[j]=true;
            }
        }

        int primeCount=0;
        for(int i =2;i<p.length; i++){
            if(!p[i])
                primeCount++;
        }

        return primeCount;

    }

}