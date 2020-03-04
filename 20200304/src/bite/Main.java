package bite;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            List<String> list = new ArrayList<>();
            String s = sc.nextLine();
            String s1 = s.replaceAll("[a-z]"," ");//所有字母替换成空格
            String[] str = s1.split(" ");// 以空格分割字符串
            for (int i = 0; i < str.length ; i++) {
                if(str[i].length() != 0){
                    if (str[i].charAt(0) != ' ') {
                        list.add(str[i]);
                    }
                }
            }
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length())); }
            });
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).length() == list.get(list.size() - 1).length()){
                    sb.append(list.get(i));
                }
            }
            System.out.println(sb);
        }
    }
}
