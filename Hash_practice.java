import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class Hash_practice {

	public static void main(String[] args) {
	

	
		Hash_practice pc=new Hash_practice();	
				pc.practice();
			}
			public void practice() {
			HashMap hm = new HashMap(); 
			
			hm.put("Tamil I" , 10); 
			hm.put("Tamil II" , 10); 
			hm.put("English I" , 2); 
			hm.put("English II" , 3); 
			hm.put("Mathematics" , 11); 
			Set entry=hm.entrySet();
			Iterator i=entry.iterator();
			while(i.hasNext()) {
				
				Entry en=(Entry) i.next();
				
		Integer in=(Integer)en.getValue();
		if(in==10) {
			System.out.println(en.getKey());
		}
			}

	}

}
