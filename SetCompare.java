import java.util.*;
class SetCompare{
  public static void main(String[] args){
HashSet<String> hs= new HashSet<String>();
 hs.add("komal");
 hs.add("ipsa");
 hs.add("diksha");
 hs.add("poonam");

 HashSet<String> subset= new HashSet<String>();
 subset.add("diksha");
 subset.add("abhi");
 subset.add("komal");
 subset.add("preet");
 hs.retainAll(subset);
 System.out.print(hs); 
 


}




}