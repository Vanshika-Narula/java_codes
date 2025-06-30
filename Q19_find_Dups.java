import java.util.*;

public class Q19_find_Dups {

    public static List<Integer> find_duplicates(int[] arr){
        int n = arr.length;
        List<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0 )+1);
        }

        for(Map.Entry<Integer, Integer> en : map.entrySet() ){
            if(en.getValue()==2)
            al.add(en.getKey());
        }
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> al = find_duplicates(arr);
        System.out.println(al);

    }
}
