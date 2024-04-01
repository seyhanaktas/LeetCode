class Solution {
    public int myAtoi(String s) {
        int i=0;
        int sign=1;
        int result=0;
        while(s.length()>i && s.charAt(i)==' ')
            i++;

        if(s.length()>i && s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }else if(s.length()>i && s.charAt(i)=='+')
            i++;

        boolean limitBreached= false;

        while(s.length()>i && (int)s.charAt(i)>=(int)'0' && (int)s.charAt(i)<=(int)'9'){
            int beforeMultiplication= result;
            result*=10;
            if(result/10!=beforeMultiplication || beforeMultiplication>result){
                limitBreached=true;
                break;
            }
            int beforeSum= result;
            result+=(int)s.charAt(i)-(int)'0';
            if(result-((int)s.charAt(i)-(int)'0')!=beforeSum|| beforeSum>result ){
                limitBreached=true;
                break;
            }


            i++;
        }
        if(limitBreached){
            if(sign==1)
                return (int)Math.pow(2,31);
            else
                return (int)Math.pow(-2,31);
        }else
            return result*sign;
    }
}