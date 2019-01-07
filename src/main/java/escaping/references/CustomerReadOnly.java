package escaping.references;


/*
1) Return the object via a read only interface reference
 to discourage clients from updating the returned values
 (provides a helpful API which discourages accidental misuse)
 */
public interface CustomerReadOnly {
    String getName();

    String toString();
}
