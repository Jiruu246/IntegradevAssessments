package spellchecker.interfaces;

import spellchecker.models.Database;

public interface ICheckable {
    /**
     * Check the text with given database
     * @param database the database that contain the correct words
     * @return result of the check
     */
    boolean check(IDatabase database);
}
