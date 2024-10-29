package pets;

public class Pet implements Comparable<Pet>{

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "This is the sound the pet makes";

    }

    @Override
    public int compareTo(Pet o) {
        int nameComp = this.name.compareTo(o.name);
        if (nameComp > 0) {
            return 1;
        } else if (nameComp < 0) {
            return -1;
        }

        int typeComp = this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
            if (typeComp > 0) {
                return 1;
            } else if (typeComp < 0) {
                return -1;
            }
        return 0;

    }



}