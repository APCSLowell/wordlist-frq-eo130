import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    int m = 0;
    for(int i = 0; i<myList.size(); i++){
    //String str = myList.get(i);
    if(myList.get(i).length == len){
      m++;
  }
  return m;
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */
    for(int j = 0; j<myList.size(); j++){
      String neutron = (String)myList.get(j);
      if(neutron.length() == len)
      myList.remove(j);
      j--;
    }
    System.out.print(myList);
    }
  }
}
