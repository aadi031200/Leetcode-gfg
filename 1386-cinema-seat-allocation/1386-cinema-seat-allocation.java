class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,Set<Integer>> map= new HashMap<>();

        for(int [] reserve : reservedSeats){
            int row=reserve[0];
            int seat=reserve[1];
            map.computeIfAbsent(row,k->new HashSet<>()).add(seat);      
        }

        int result=(n-map.size())*2;

        for(Map.Entry<Integer,Set<Integer>> entry:map.entrySet()){
            Set<Integer> bookedseat=entry.getValue();

            boolean grpA=!bookedseat.contains(2)&&!bookedseat.contains(3)&&!bookedseat.contains(4)&&!bookedseat.contains(5);
            boolean grpB=!bookedseat.contains(4)&&!bookedseat.contains(5)&&!bookedseat.contains(6)&&!bookedseat.contains(7);
            boolean grpC=!bookedseat.contains(6)&&!bookedseat.contains(7)&&!bookedseat.contains(8)&&!bookedseat.contains(9);

            if(grpA && grpC){
                result+=2;
            }else if(grpA || grpB|| grpC){
                result+=1;
            }
        }
        return result;
    }
}