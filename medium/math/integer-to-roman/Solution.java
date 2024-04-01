class Solution {
    public String intToRoman(int num) {
        String res= "";
        while(num>=1000)
        {
            res+="M";
            num-=1000;
        }
        int countC=num/100;
        num=num-countC*100;
        if(countC==9){
            res+="CM";
        }else if(countC==4){
            res+="CD";
        }else{
            if(countC>=5){
                res+="D";
                countC-=5;
            }
            while(countC>0){
                res+="C";
                countC--;
            }
        }

        int countX=num/10;
        num=num-countX*10;
        if(countX==9){
            res+="XC";
        }else if(countX==4){
            res+="XL";
        }else{
            if(countX>=5){
                res+="L";
                countX-=5;
            }
            while(countX>0){
                res+="X";
                countX--;
            }
        }

        int countI=num;
        if(countI==9){
            res+="IX";
        }else if(countI==4){
            res+="IV";
        }else{
            if(countI>=5){
                res+="V";
                countI-=5;
            }
            while(countI>0){
                res+="I";
                countI--;
            }
        }
        return res;
    }
}