import java.util.*;

/**
 * 时间复杂度：O(n+klogk)
 * 空间复杂度：O(k)
 */
public class Test {
    public static Integer[] findKNum(int[] array,int k) {

        //1、建立大小为K的堆（小堆）
        PriorityQueue<Integer> minHeap = new PriorityQueue<>
                (k, new Comparator<Integer>() {
                    //调整的时候，比较
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);//大堆
                        //12  ,  4     ,6 ,17, 9, 51 ,21, 10, 45 ,31
                        // j-1   j   [j-1] > [j]  调整
                        //return o1.compareTo(o2);//小堆 《==》升序
                    }
                });

        for (int i = 0; i < array.length; i++) {
            if(minHeap.size() < k) {
                minHeap.add(array[i]);
            }else {
                Integer top = minHeap.peek();
                if(top != null && top > array[i]) {
                    minHeap.poll();
                    minHeap.add(array[i]);
                }
            }
        }

        Integer[] integers = new Integer[k];
        for (int i = 0; i < k; i++) {
            Integer top = minHeap.peek();
            integers[i] = top;
            minHeap.poll();
        }
        return integers;
    }

    public static List<String> topKFrequent(String[] words, int k) {
        //1、遍历words数组，将单词和每个单词出现的次数进行一一对应
        Map<String,Integer> map = new HashMap<>();

        for (String s : words) {
            //首先看当前字符串s,是否已经在map当中有对应关系
            if(map.get(s) == null) {
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
        }

        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>
                (k, new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        //在调整的时候，如果频率相同。
                        if(o1.getValue().equals(o2.getValue())) {
                            //o2 > o1调整
                            return o2.getKey().compareTo(o1.getKey());
                            // return o1.getKey().compareTo(o2.getKey());//
                        }
                        //j-1->o1     j->o2    [j-1] > [j]  交换-》调整
                        return o1.getValue().compareTo(o2.getValue());//按照频率升序
                    }
                });

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if(minHeap.size() < k) {
                minHeap.add(entry);
            }else {
                Map.Entry<String,Integer> top = minHeap.peek();
                //频率相同
                if(top!=null && top.getValue().equals(entry.getValue())) {
                    //字母小的入  bcdef         abcd
                    if(top.getKey().compareTo(entry.getKey()) > 0) {
                        minHeap.poll();
                        minHeap.add(entry);
                    }
                }else {
                    if(top != null && top.getValue() < entry.getValue()) {
                        minHeap.poll();
                        minHeap.add(entry);
                    }
                }
            }
        }

        System.out.println(minHeap);// love  i
        List<String> list = new ArrayList<>();
        for(int i = 0;i < k;i++) {
            String pop = minHeap.peek().getKey();
            list.add(0,pop);
            minHeap.poll();
        }
        return list;// i  love
    }


    public static void main(String[] args) {
        int[] array = {12,4 ,6 ,17, 9, 51 ,21, 10, 45 ,31};
        Integer[] ret = findKNum(array,4);
        System.out.println(Arrays.toString(ret));
    }
}
