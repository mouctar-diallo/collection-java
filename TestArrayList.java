import java.util.*;

public class TestArrayList{
  
  public static void main(String args[]){
    
    ArrayList<String> list = new ArrayList<String>();
    
    list.add("Java");
    list.add("PHP");
    list.add("Python");
    list.add("Pascal");
    list.add("PHP");
    String search = list.get(2);
    String modif = list.set(2, "mouctar");
    if(list.contains(search)){
      System.out.println("python est dans la liste et est modifié par" + modif);
    }

    list.removeIf(x -> x.equals("PHP"));

    System.out.println(list);
  }
}