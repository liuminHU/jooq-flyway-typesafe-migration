/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.migrator.model.v2;


import javax.annotation.Generated;

import org.jooq.example.migrator.model.v2.tables.v2_Author;
import org.jooq.example.migrator.model.v2.tables.v2_Book;
import org.jooq.example.migrator.model.v2.tables.v2_SchemaVersion;


/**
 * Convenience access to all tables in FLYWAY_TEST
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2",
        "schema version:FLYWAY_TEST_2"
    },
    date = "2017-05-14T20:59:56.850Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>FLYWAY_TEST.AUTHOR</code>.
     */
    public static final v2_Author v2_AUTHOR = org.jooq.example.migrator.model.v2.tables.v2_Author.v2_AUTHOR;

    /**
     * The table <code>FLYWAY_TEST.BOOK</code>.
     */
    public static final v2_Book v2_BOOK = org.jooq.example.migrator.model.v2.tables.v2_Book.v2_BOOK;

    /**
     * The table <code>FLYWAY_TEST.schema_version</code>.
     */
    public static final v2_SchemaVersion v2_SCHEMA_VERSION = org.jooq.example.migrator.model.v2.tables.v2_SchemaVersion.v2_SCHEMA_VERSION;
}