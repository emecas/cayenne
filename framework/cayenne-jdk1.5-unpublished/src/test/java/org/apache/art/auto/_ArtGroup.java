package org.apache.art.auto;

/** Class _ArtGroup was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public abstract class _ArtGroup extends org.apache.cayenne.CayenneDataObject {

    public static final String NAME_PROPERTY = "name";
    public static final String ARTIST_ARRAY_PROPERTY = "artistArray";
    public static final String CHILD_GROUPS_ARRAY_PROPERTY = "childGroupsArray";
    public static final String TO_PARENT_GROUP_PROPERTY = "toParentGroup";

    public static final String GROUP_ID_PK_COLUMN = "GROUP_ID";

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }
    
    
    public void addToArtistArray(org.apache.art.Artist obj) {
        addToManyTarget("artistArray", obj, true);
    }
    public void removeFromArtistArray(org.apache.art.Artist obj) {
        removeToManyTarget("artistArray", obj, true);
    }
    public java.util.List getArtistArray() {
        return (java.util.List)readProperty("artistArray");
    }
    
    
    public void addToChildGroupsArray(org.apache.art.ArtGroup obj) {
        addToManyTarget("childGroupsArray", obj, true);
    }
    public void removeFromChildGroupsArray(org.apache.art.ArtGroup obj) {
        removeToManyTarget("childGroupsArray", obj, true);
    }
    public java.util.List getChildGroupsArray() {
        return (java.util.List)readProperty("childGroupsArray");
    }
    
    
    public void setToParentGroup(org.apache.art.ArtGroup toParentGroup) {
        setToOneTarget("toParentGroup", toParentGroup, true);
    }

    public org.apache.art.ArtGroup getToParentGroup() {
        return (org.apache.art.ArtGroup)readProperty("toParentGroup");
    } 
    
    
}