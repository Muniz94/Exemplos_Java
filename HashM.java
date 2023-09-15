import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashM {
public static void main(String[] args) {
Map<Integer, String> produto = new HashMap<Integer, String>();
produto.put(1, "Camisa");
produto.put(2, "Calça");


for (Map.Entry p:produto.entrySet()) {
System.out.println(p.getValue());
}

Iterator<Map.Entry<Integer, String>> produtos = produto.entrySet().iterator();
while (produtos.hasNext()) {
Map.Entry<Integer, String> p = produtos.next();
System.out.println(p.getValue());
}
}
}


