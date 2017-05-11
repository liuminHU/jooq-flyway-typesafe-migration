/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.app.model;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.example.app.model.tables.null_Author;
import org.jooq.example.app.model.tables.null_Book;
import org.jooq.example.app.model.tables.null_SchemaVersion;
import org.jooq.example.app.model.tables.records.null_AuthorRecord;
import org.jooq.example.app.model.tables.records.null_BookRecord;
import org.jooq.example.app.model.tables.records.null_SchemaVersionRecord;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>FLYWAY_TEST</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2",
        "schema version:FLYWAY_TEST_3"
    },
    date = "2017-05-11T21:47:26.351Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<null_AuthorRecord> null_PK_T_AUTHOR = UniqueKeys0.null_PK_T_AUTHOR;
    public static final UniqueKey<null_BookRecord> null_PK_T_BOOK = UniqueKeys0.null_PK_T_BOOK;
    public static final UniqueKey<null_SchemaVersionRecord> null_SCHEMA_VERSION_PK = UniqueKeys0.null_SCHEMA_VERSION_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<null_BookRecord, null_AuthorRecord> null_FK_T_BOOK_AUTHOR_ID = ForeignKeys0.null_FK_T_BOOK_AUTHOR_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<null_AuthorRecord> null_PK_T_AUTHOR = createUniqueKey(null_Author.null_AUTHOR, "PK_T_AUTHOR", null_Author.null_AUTHOR.null_ID);
        public static final UniqueKey<null_BookRecord> null_PK_T_BOOK = createUniqueKey(null_Book.null_BOOK, "PK_T_BOOK", null_Book.null_BOOK.null_ID);
        public static final UniqueKey<null_SchemaVersionRecord> null_SCHEMA_VERSION_PK = createUniqueKey(null_SchemaVersion.null_SCHEMA_VERSION, "schema_version_pk", null_SchemaVersion.null_SCHEMA_VERSION.null_INSTALLED_RANK);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<null_BookRecord, null_AuthorRecord> null_FK_T_BOOK_AUTHOR_ID = createForeignKey(org.jooq.example.app.model.Keys.null_PK_T_AUTHOR, null_Book.null_BOOK, "FK_T_BOOK_AUTHOR_ID", null_Book.null_BOOK.null_AUTHOR_ID);
    }
}
