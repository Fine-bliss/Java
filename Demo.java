import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民老公","王思聪");
        map.put("国民男友","胡歌");
        map.put("王哲林老公","朱亚文");
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        String str = map.getOrDefault("国民女神","高圆圆");
        System.out.println(map.containsKey("国民男友"));
        System.out.println(map.containsValue("朱亚文"));
    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("java");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        System.out.println(collection);
        collection.remove("java");
        System.out.println(collection);
        collection.add("2019");
        collection.add("1208");
        /*Object[] string = collection.toArray();
        System.out.println(Array.toString);*/
        for (String s : collection){
            System.out.println(s);
        }
    }
}
