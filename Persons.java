import java.util.ArrayList;

public class Persons {
    private ArrayList <Person> arrylist;

    public Persons(){
        arrylist = new ArrayList<Person>();
    }

    public ArrayList<Person> getInternalList() {
        return arrylist;
    }

    public void add(Person personCreated) {
        arrylist.add(personCreated);
    }

    public void delete(int i) {
        arrylist.remove(i);
    }

    public int getSize() {
        return arrylist.size();
    }
    
    public Persons search(String name) {
        Persons personsWhoMatch = new Persons();
        for (Person p: arrylist){
            if (p.getName().compareToIgnoreCase(name) == 0) {
                personsWhoMatch.add(p);
            }
        } 
        return personsWhoMatch;
    }
}


// public static void main(String[] args){
//     Person p1 = new Person("s", "Amherst", "000-000-0000");
//     Person p2 = new Person("s", "Providence", "111-111-1111");
//     Persons pp = new Persons();
//     ArrayList<Person> arraylist1 = pp.getArrayList();
//     arraylist1.add(p1);
//     arraylist1.add(p2);
//     pp.delete(1);
//     Persons match_arry = pp.search("s");
//     ArrayList<Person> arraylist2 = match_arry.getArrayList();
//     for (int i = 0; i < match_arry.getSize(); i += 1) { 
//         System.out.println(arraylist2.get(i).toString());	
//         } 
    // for (int i = 0; i < pp.getSize(); i += 1) { 
    //     System.out.println(pp.getArrayList().get(i).toString());	
    // }

//     for (int n = 0; n < pp.getSize(); n += 1) { 
//         System.out.println(pp.getArrayList().get(n).toString());		
//     }
//     }
// }