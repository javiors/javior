import java.util.*;

/**
 * Created by javior on 15/5/27.
 */
public class TimeCost {
    public static void main(String []args){
        List<Map<String,Object>> mapList=new ArrayList<Map<String, Object>>();
        for(int j=0;j<1000;j++){
            long l1 = System.nanoTime();

            Map<String,Object> map = new HashMap<String,Object>();
            long l2 = System.nanoTime();
            System.out.println(l2-l1);
            for(int i=0;i<10;i++){
                map.put(i+"a",i);
                mapList.add(map);
            }

            StringTokenizer st = new StringTokenizer("hshshhshss");


        }


    }


    private void find(String s){

    }
}
