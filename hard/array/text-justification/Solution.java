class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res =new ArrayList<String>();
        List<String> item =new ArrayList<String>();
        int length=0;
        for(String word: words){
            if(length+item.size()+word.length()>maxWidth){
                int space =maxWidth- length;

                int i =0;
                while(space>0){
                    item.set(i, item.get(i)+" ");
                    if(item.size()>1){
                        i++;
                        i%=(item.size()-1);
                    }
                    space--;
                }
                String newWord = "";
                for(String word2:item){
                    newWord+=word2;
                }
                res.add(newWord);
                item=new ArrayList<String>();
                length=0;
            }
            item.add(word);
            length += word.length();

        }
        int space =maxWidth- length;

        String newWord = "";
        for(String word2:item){
            newWord+=word2+" ";
            space--;
        }

        if(space==-1){
            newWord=newWord.trim();
        }
        while(space>0){
            newWord+=" ";
            space--;
        }

        res.add(newWord);

        return res;
    }
}