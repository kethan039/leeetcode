class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> al=new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                hm.put(nums[i][j],hm.getOrDefault(nums[i][j],0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> map:hm.entrySet()){
            if(map.getValue()==nums.length){
                al.add(map.getKey());
            }
        }
        Collections.sort(al);
        return al;
    }
}