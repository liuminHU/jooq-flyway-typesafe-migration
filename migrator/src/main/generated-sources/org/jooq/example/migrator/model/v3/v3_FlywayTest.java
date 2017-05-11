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
import org.jooq.example.migrator.model.v3.tables.v3_Author;
import org.jooq.example.migrator.model.v3.tables.v3_Book;
import org.jooq.example.migrator.model.v3.tables.v3_SchemaVersion;
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
    date = "2017-05-11T21:47:25.660Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class v3_FlywayTest extends SchemaImpl {

    private static final long serialVersionUID = 2115571633;

    /**
     * The reference instance of <code>FLYWAY_TEST</code>
     */
    public static final v3_FlywayTest v3_FLYWAY_TEST = new v3_FlywayTest();

    /**
     * The table <code>FLYWAY_TEST.AUTHOR</code>.
     */
    public final v3_Author v3_AUTHOR = org.jooq.example.migrator.model.v3.tables.v3_Author.v3_AUTHOR;

    /**
     * The table <code>FLYWAY_TEST.BOOK</code>.
     */
    public final v3_Book v3_BOOK = org.jooq.example.migrator.model.v3.tables.v3_Book.v3_BOOK;

    /**
     * The table <code>FLYWAY_TEST.schema_version</code>.
     */
    public final v3_SchemaVersion v3_SCHEMA_VERSION = org.jooq.example.migrator.model.v3.tables.v3_SchemaVersion.v3_SCHEMA_VERSION;

    /**
     * No further instances allowed
     */
    private v3_FlywayTest() {
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
            Sequences.v3_S_AUTHOR_ID);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            v3_Author.v3_AUTHOR,
            v3_Book.v3_BOOK,
            v3_SchemaVersion.v3_SCHEMA_VERSION);
    }
}