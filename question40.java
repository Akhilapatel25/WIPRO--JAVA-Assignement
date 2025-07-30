package javaassignment;


import java.util.*;

//CD class implementing Comparable
class CD implements Comparable<CD> {
 private String title;
 private String singer;

 public CD(String title, String singer) {
     this.title = title;
     this.singer = singer;
 }

 public String getTitle() {
     return title;
 }

 public String getSinger() {
     return singer;
 }

 // Comparable implementation to sort by singer name
 @Override
 public int compareTo(CD other) {
     return this.singer.compareToIgnoreCase(other.singer);
 }

 @Override
 public String toString() {
     return "Title: " + title + ", Singer: " + singer;
 }
}

//Main class to test
public class question40 {
 public static void main(String[] args) {
     List<CD> cds = new ArrayList<>();
     cds.add(new CD("Melody Magic", "Arijit Singh"));
     cds.add(new CD("Heartbeats", "Shreya Ghoshal"));
     cds.add(new CD("Rock On", "KK"));
     cds.add(new CD("Peace Tunes", "Lata Mangeshkar"));

     // Sorting CDs based on singer name
     Collections.sort(cds);

     // Displaying sorted CDs
     System.out.println("CDs sorted by singer name (ascending):");
     for (CD cd : cds) {
         System.out.println(cd);
     }
 }
}

/*
 * 
 * CDs sorted by singer name (ascending):
Title: Melody Magic, Singer: Arijit Singh
Title: Rock On, Singer: KK
Title: Peace Tunes, Singer: Lata Mangeshkar
Title: Heartbeats, Singer: Shreya Ghoshal

*/
