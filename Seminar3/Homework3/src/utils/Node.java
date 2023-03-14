/**
 * Node interface
 */
package utils;

public interface Node {
    String getName();

    int getImportance();

    boolean hasRelation(String name);
}
