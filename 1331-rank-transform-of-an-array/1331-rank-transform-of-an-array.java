class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] dup= new int[arr.length];
        for(int i=0;i<dup.length;i++){
            dup[i]=arr[i];
        }

        Arrays.sort(dup);

        HashMap<Integer,Integer> map= new HashMap<>();
        int count=1;
        for(int i=0;i<dup.length;i++){
            if(!map.containsKey(dup[i])){
                map.put(dup[i],count);
                count++;
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

        return arr;
    }
}