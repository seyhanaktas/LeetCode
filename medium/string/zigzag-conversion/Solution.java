class Solution {
    public String convert(String s, int numRows) {
        String res ="";
        int resIndex = 0;
        if(numRows==1)
            return s;

        for(int r = 0; r<numRows; r++){
            int index = r;
            boolean odd = true;
            while(index <s.length()){
                char ch = s.charAt(index);
                res+=String.valueOf(ch);

                if(r==0 || r ==numRows -1){
                    index=index+(numRows-1)*2;
                }else{
                    if(odd){
                        index=index+(numRows-1-r)*2;
                    }else{
                        index=index+r*2;
                    }
                    odd =!odd;
                }
            }
        }
        return res;

    }
}


