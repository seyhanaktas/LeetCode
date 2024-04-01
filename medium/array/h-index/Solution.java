class Solution {
    public int hIndex(int[] citations) {
        int maxCite = citations.length<=1000?citations.length:1000;
        int[] cites = new int[maxCite+1];
        for(int i=0;i<maxCite+1; i++)
            cites[i]=0;

        for(int i=0;i< citations.length; i++){
            for(int j=0;j<=citations[i] && j<cites.length; j++){
                cites[j]++;
            }
        }
        for(int i=cites.length-1; i>0; i--){
            if(cites[i]>=i)
                return i;
        }
        return 0;
    }
}