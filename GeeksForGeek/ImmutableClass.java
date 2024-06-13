package GeeksForGeek;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {

    private final int id;
    private final String name;
    private final List<String> tags;

    public ImmutableClass(int id, String name, List<String> tags) {
        this.id = id;
        this.name = name;   
        this.tags = new ArrayList<>(tags);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getTags() {
        return new ArrayList<>(tags);
    } 


}
