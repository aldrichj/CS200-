/**
 * Interface for term index.
 * 
 * 
 * @author Jeremy Aldrich
 * @version 1
 */
 public interface TermIndex {
	 
	 //	  
     public void add(String filename, String newWord);
     public int size();
     public void delete(String word);
     public Term get(String word, Boolean printP);
}
