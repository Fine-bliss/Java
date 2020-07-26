import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input.length < k || k == 0){
            return list;
        }
        Queue<Integer> queue = new PriorityQueue<>(k,Collections.reverseOrder());
        for (int i = 0; i < input.length ; i++) {
            if (queue.size() <k){
                queue.add(input[i]);
            }else {
                if(input[i] < queue.peek()){
                    queue.remove();
                    queue.add(input[i]);
                }
            }
        }
        while (!queue.isEmpty()){
            list.add(queue.remove());
        }
        return list;
    }
}
