class Solution {
    public boolean isPalindrome(String s) {
        boolean resp = true;

        int l = 0;
        int r = s.length()-1;

        int lowerS = (int)'a';
        int lowerE = (int)'z';

        int upperS = (int)'A';
        int upperE = (int)'Z';

        int toLower= upperS-lowerS;

        int numS = (int)'0';
        int numE=(int)'9';

        while(l<r){
            int lv = (int)s.charAt(l);
            int rv = (int)s.charAt(r);
            boolean lB= false;
            if(lv>=lowerS && lv<=lowerE){
                lB=true;
            }
            if(lv>=upperS && lv<=upperE){
                lB=true;
                lv-=toLower;
            }
            if(lv>=numS && lv<=numE){
                lB=true;
            }
            boolean rB= false;
            if(rv>=lowerS && rv<=lowerE){
                rB=true;
            }
            if(rv>=upperS && rv<=upperE){
                rB=true;
                rv-=toLower;
            }
            if(rv>=numS && rv<=numE){
                rB=true;
            }

            if(rB&&lB){
                if(rv!=lv)
                {
                    resp=false;
                    break;
                }
                l++;
                r--;
            }

            if(!rB)
                r--;
            if(!lB)
                l++;

        }

        return resp;
    }
}