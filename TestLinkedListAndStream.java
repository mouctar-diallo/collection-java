import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TestLinkedListAndStream {
    public static void main(String args[]){
    
        LinkedList<String> lk = new LinkedList<String>();
        
        lk.add("Java");
        lk.add("PHP");
        lk.add("Python");
        lk.add("Pascal");

        String distinctCsv = lk.stream()
            .distinct().collect(Collectors.joining(","));

        System.out.println("la liste distinct sous format csv = "+ distinctCsv);
        //Recupère l'élément de la position 1 de la liste (PHP)
        String search = lk.get(1);
        //modification valeur a la position 2 (python en Ruby)
        lk.set(2, "Ruby");
        if(lk.contains(search)) {
            System.out.println("PHP se triuve dans la liste lk");
        }
        System.out.println(lk);
        System.out.println("*********************************************");

        //Stream using filter()
        System.out.println("filtre les elements respectant les predicats (conditions)");
        List<String> startsWithP = lk.stream().filter(x -> x.startsWith("P"))
        .collect(Collectors.toList());
        System.out.println(startsWithP);
        System.out.println("*********************************************");

        //Stream using map()
        //filtre les nombres pairs et les multiplies par 10
        List<Integer> integerList = Arrays.asList(2, 1, 3, 4, 6, 5);
        System.out.println("affiche les nombres paires");
        integerList.stream().filter((number -> number % 2 == 0))
        .map(pairNumber -> pairNumber * 10)
        .forEach(System.out::println);
        System.out.println("*********************************************");

        //tri croissant en utilisant sorted()
        System.out.println("Tri les elements de la liste");
        List<Integer> triCroissant = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(triCroissant);
        System.out.println("*********************************************");
        
        /**
         * reduce()
            La méthode reduce est utilisée pour réduire les éléments d’un flux à une seule valeur. 
            La méthode reduce prend un BinaryOperator comme paramètre.
         */
        Integer somme = integerList.stream().reduce(0, ( x, y ) -> x + y);
        System.out.println("la somme des elements de la liste est : "+ somme);
      }
}
