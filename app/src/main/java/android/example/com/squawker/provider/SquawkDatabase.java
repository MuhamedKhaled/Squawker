package android.example.com.squawker.provider;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;

/**
 * Uses the Schematic (https://github.com/SimonVT/schematic) library to create a database with one
 * table for messages
 */

@Database(version = SquawkDatabase.VERSION)
public class SquawkDatabase {

    public static final int VERSION = 4;

    @Table(SquawkContract.class)
    public static final String SQUAWK_MESSAGES = "squawk_messages";

}
