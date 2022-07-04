import java.util.*;

public class Call{
    public static void main(String[] args){
        ArrayList m = new ArrayList();
        m.add(100);
        m.add("sk");
        m.add(true);
        m.add(10.6);
        m.add(new Date());
        m.add(new Thread());

        Iterator i = m.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(m);
		System.out.println(m.contains(999));
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println("Removed : "+m.remove(true));
		System.out.println(m.contains(10.6));
    }
}