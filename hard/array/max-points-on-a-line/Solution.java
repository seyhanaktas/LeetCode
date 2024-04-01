class Solution {
    public int maxPoints(int[][] points) {
        if(points.length<=2)
            return points.length;

        HashMap<String, HashMap<String, Integer>> count =new HashMap<String, HashMap<String, Integer>>();

        for(int i=0;i<points.length-1; i++){
            int x1= points[i][0];
            int y1=points[i][1];
            String pointI= x1 +","+ y1;
            for(int j=0;j<points.length; j++){
                if(i==j)
                    continue;

                int x2= points[j][0];
                int y2=points[j][1];

                int rise= y2-y1;
                int run = x2-x1;

                double slope=Math.pow(10,4)+1;
                if(run!=0){
                    slope=(double)rise/(double)run;
                }

                String slopeKey= String.valueOf(slope).replace("-","");
                slopeKey=i+"+"+slopeKey;

                if(slope<0){
                    if(rise<0)
                    {
                        slopeKey=i+"-"+slopeKey;
                    }else{
                        slopeKey=i+"+"+slopeKey+"-";
                    }
                }else{
                    slopeKey=i+"+"+slopeKey;
                }

                String pointJ= x2 +","+ y2;
                if(count.containsKey(slopeKey)){
                    count.get(slopeKey).put(pointJ, 1);
                }else{
                    count.put(slopeKey, new HashMap<String, Integer>());
                    count.get(slopeKey).put(pointI, 1);
                    count.get(slopeKey).put(pointJ, 1);
                }
            }
        }

        int max = 0;

        for (String key : count.keySet()) {
            if(max<count.get(key).keySet().size())
                max = count.get(key).keySet().size();
        }

        return max;

    }
}