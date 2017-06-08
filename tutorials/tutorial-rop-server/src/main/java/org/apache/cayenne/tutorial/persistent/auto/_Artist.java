package org.apache.cayenne.tutorial.persistent.auto;

import java.time.LocalDate;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.tutorial.persistent.Painting;

/**
 * Class _Artist was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Artist extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<LocalDate> DATE_OF_BIRTH = Property.create("dateOfBirth", LocalDate.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<Painting>> PAINTINGS = Property.create("paintings", List.class);

    public void setDateOfBirth(LocalDate dateOfBirth) {
        writeProperty("dateOfBirth", dateOfBirth);
    }
    public LocalDate getDateOfBirth() {
        return (LocalDate)readProperty("dateOfBirth");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToPaintings(Painting obj) {
        addToManyTarget("paintings", obj, true);
    }
    public void removeFromPaintings(Painting obj) {
        removeToManyTarget("paintings", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Painting> getPaintings() {
        return (List<Painting>)readProperty("paintings");
    }


}
