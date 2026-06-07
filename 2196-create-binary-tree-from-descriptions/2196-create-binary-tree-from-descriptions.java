 class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map= new HashMap<>();
        HashSet<Integer> childSet=new HashSet<>();

        //Creating nodes and setting up parent-child relationship

        for(int[] desc:descriptions){
            int parent=desc[0];
            int child=desc[1];
            boolean isLeft=desc[2]==1;

            map.putIfAbsent(parent,new TreeNode(parent));
            map.putIfAbsent(child,new TreeNode(child));

            if(isLeft){
                map.get(parent).left=map.get(child);
            }else{
                map.get(parent).right=map.get(child);
            }

            childSet.add(child);
        }

        for(int[] desc: descriptions){
            int parent=desc[0];
            if(!childSet.contains(parent)){
                return map.get(parent);
            }
        }
        return null;
    }
}