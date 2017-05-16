/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.migrator.model.v1.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.migrator.model.v1.Keys;
import org.jooq.example.migrator.model.v1.tables.records.v1_BookRecord;
import org.jooq.example.migrator.model.v1.v1_FlywayTest;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2",
        "schema version:null"
    },
    date = "2017-05-16T21:33:40.187Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class v1_Book extends TableImpl<v1_BookRecord> {

    private static final long serialVersionUID = -1201273459;

    /**
     * The reference instance of <code>FLYWAY_TEST.BOOK</code>
     */
    public static final v1_Book v1_BOOK = new v1_Book();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<v1_BookRecord> getRecordType() {
        return v1_BookRecord.class;
    }

    /**
     * The column <code>FLYWAY_TEST.BOOK.ID</code>.
     */
    public final TableField<v1_BookRecord, Integer> v1_ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>FLYWAY_TEST.BOOK.AUTHOR_ID</code>.
     */
    public final TableField<v1_BookRecord, Integer> v1_AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>FLYWAY_TEST.BOOK.TITLE</code>.
     */
    public final TableField<v1_BookRecord, String> v1_TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

    /**
     * Create a <code>FLYWAY_TEST.BOOK</code> table reference
     */
    public v1_Book() {
        this("BOOK", null);
    }

    /**
     * Create an aliased <code>FLYWAY_TEST.BOOK</code> table reference
     */
    public v1_Book(String alias) {
        this(alias, v1_BOOK);
    }

    private v1_Book(String alias, Table<v1_BookRecord> aliased) {
        this(alias, aliased, null);
    }

    private v1_Book(String alias, Table<v1_BookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return v1_FlywayTest.v1_FLYWAY_TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<v1_BookRecord> getPrimaryKey() {
        return Keys.v1_PK_T_BOOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<v1_BookRecord>> getKeys() {
        return Arrays.<UniqueKey<v1_BookRecord>>asList(Keys.v1_PK_T_BOOK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<v1_BookRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<v1_BookRecord, ?>>asList(Keys.v1_FK_T_BOOK_AUTHOR_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v1_Book as(String alias) {
        return new v1_Book(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public v1_Book rename(String name) {
        return new v1_Book(name, null);
    }
}
