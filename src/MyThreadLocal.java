import java.util.HashMap;
import java.util.Map;

public class MyThreadLocal {


    public static void main(String[] args) {

        ThreadLocal<Map> threadLocal = new ThreadLocal();
        Map<String, String> map = new HashMap<>();
        map.put("ok", "ok");
        map.put("ok1", "ok");
        map.put("ok2", "ok");
        map.put("ok3", "ok");
        map.put("o4", "ok");
        threadLocal.set(map);
        System.out.println(threadLocal.get());

    }
}
