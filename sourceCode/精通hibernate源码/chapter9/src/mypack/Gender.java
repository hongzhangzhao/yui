package mypack;

import java.util.*;
import java.io.Serializable;


public class Gender implements Serializable {
    private final Character sex;
    private final transient String description;

    public Character getSex() {
        return sex;
    }
    public String getDescription() {
        return description;
    }

    private static final Map instancesBySex = new HashMap();

    /**
     * Constructor is private to prevent instantiation except during class
     * loading.
     */
    private Gender(Character sex, String description) {
        this.sex = sex;
        this.description = description;
        instancesBySex.put(sex, this);
    }

    public static final Gender FEMALE =
        new Gender(new Character('F'), "Female");

    public static final Gender MALE =
        new Gender(new Character('M'), "Male");

    public static Collection getAllValues() {
        return Collections.unmodifiableCollection(instancesBySex.values());
    }

    /**
     * Look up an instance by sex.
     */
    public static Gender getInstanceBySex(Character sex) {
        Gender result = (Gender)instancesBySex.get(sex);
        if (result == null) {
            throw new NoSuchElementException(sex.toString());
        }
        return result;
    }

    /**
     * Return a string representation of this object.
     */
        public String toString() {
        return description;
    }

    /**
     * Insure that deserialization preserves the signleton property.
     */
    private Object readResolve() {
        return getInstanceBySex(sex);
    }
}
