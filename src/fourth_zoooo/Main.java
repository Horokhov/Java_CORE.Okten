package fourth_zoooo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        class Club {
            private Map<Person, List<Pet>> map = new LinkedHashMap<>();
            //1) додати учасника в клуб;
            public void newPerson(Person person) {
                map.put(new Person(1,"Max","Dr"), null);
            }
            //2) додати тваринку до учасника клубу.
            public void newPet(Person personId,Pet pet){
                Set<Map.Entry<Person, List<Pet>>> entrySet = map.entrySet();
                Iterator<Map.Entry<Person, List<Pet>>> iterator= entrySet.iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Person, List<Pet>> next =  iterator.next();
                    if (next.getKey().getId() == personId.getId()) {
                        next.setValue((List<Pet>) new Pet(1,"Bob",3));

                    }
                }
            }
//3) видалити тваринку з власника.
        public void removePet(int personId, Pet pet ) {
                Set<Person> people=map.keySet();
            for (Person person : people) {
                if(person.getId()==personId) {
                    List<Pet> pets=map.get(person);
                    pets.remove(pet);
                }
            }
        }

            public void ExactPetRemove(Pet pet) {
                map.get(pet).removeIf(p->p.getName().equals("Bob"));
            }
//4) видалити учасника клубу.
            public void removePerson(Person person) {
                map.get(person).removeIf(p->p.equals(person));
            }
//5) видалити конкретну тваринку з усіх власників.
            public void petDelete(Pet pet) {
                Set<Map.Entry<Person, List<Pet>>> entrySet = map.entrySet();
                entrySet.forEach(personListEntry -> {
                    List<Pet> pets=personListEntry.getValue();
                    pets.removeIf(p->p.equals(pet));
                });
            }
// 6) вивести на екран зооклуб.
        }
    }
}
