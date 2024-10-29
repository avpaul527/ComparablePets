package pets;

import java.util.Comparator;

public class TypeComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2){
        int typeComp = pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());
        if(typeComp > 0) {
            return 1;
        } else if (typeComp < 0){
            return -1;
        }

        int nameComp = pet1.getName().compareTo(pet2.getName());
        if (nameComp > 0){
            return 1;
        } else if (nameComp < 0){
            return -1;
        }
        return 0;
    }

}
