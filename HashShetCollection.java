import java.util.HashSet;

public class HashShetCollection {

    public static void main(String args[]){
    
        HashSet<String> hash = new HashSet<String>();
        
        hash.add("Java");
        hash.add("PHP");
        hash.add("Python");
        hash.add("Pascal");
        String found = "";
        for (String h : hash) {
            if(h.equals("PHP")) {
                found = h;
            }
        }
        System.out.println(found);

        hash.removeIf(x -> x.equals("Pascal"));
        
        hash.forEach(System.out::println);
      }
}