package spellchecker.interfaces;

import spellchecker.models.Database;

public interface ICheckable {
    boolean check(IDatabase database);
}
