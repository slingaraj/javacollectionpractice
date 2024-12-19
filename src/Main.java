import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"Hasrshit");
        map.put(2,"Lingaraj");
        map.put(3,"Neha");
//        System.out.println(map);


        Set<Map.Entry<Integer,String>> entries= map.entrySet();
        for (Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

    }
}