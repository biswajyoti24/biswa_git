package programming.collectionpractice;

import programming.comparablecomparator.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapInterfaceProgramming {

    public static void main(String[] args){
        Map<Integer,String> emp = new HashMap<Integer,String>();
        emp.put(1,"rty");
        emp.put(2,"rtyfhgf");
        emp.put(3,"ghjj");
        emp.put(4,"njknhjf");
        emp.put(5,"vbhjj");
        emp.put(6,"fgfjhf");
        emp.put(7,"fghfthhng");
        emp.put(8,"bnmbj");
        emp.put(9,"asdftr");
        emp.put(10,"rtcfhy");
        emp.put(11,"opiorty");
        emp.put(12,"qweretgdr");

       Iterator< Map.Entry<Integer,String>> st = emp.entrySet().iterator();
       while (st.hasNext()){
           Map.Entry<Integer, String> entry = st.next();
           System.out.println(entry.getKey()+" -> "+entry.getValue());
       }
    }



}
