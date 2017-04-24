/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.migrator.model.v3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.example.migrator.model.v3.tables.Author;
import org.jooq.example.migrator.model.v3.tables.Book;
import org.jooq.example.migrator.model.v3.tables.SchemaVersion;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2",
        "schema version:FLYWAY_TEST_3"
    },
    date = "2017-04-24T22:18:07.033Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FlywayTest extends SchemaImpl {

    private static final long serialVersionUID = -1852682025;

    /**
     * The reference instance of <code>FLYWAY_TEST</code>
     */
    public static final FlywayTest FLYWAY_TEST = new FlywayTest();

    /**
     * The table <code>FLYWAY_TEST.AUTHOR</code>.
     */
    public final Author AUTHOR = org.jooq.example.migrator.model.v3.tables.Author.AUTHOR;

    /**
     * The table <code>FLYWAY_TEST.BOOK</code>.
     */
    public final Book BOOK = org.jooq.example.migrator.model.v3.tables.Book.BOOK;

    /**
     * The table <code>FLYWAY_TEST.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = org.jooq.example.migrator.model.v3.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * No further instances allowed
     */
    private FlywayTest() {
        super("FLYWAY_TEST", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.S_AUTHOR_ID);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR,
            Book.BOOK,
            SchemaVersion.SCHEMA_VERSION);
    }
}
