/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.migrator.model.v1.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.migrator.model.v1.Keys;
import org.jooq.example.migrator.model.v1.tables.records.v1_SchemaVersionRecord;
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
public class v1_SchemaVersion extends TableImpl<v1_SchemaVersionRecord> {

    private static final long serialVersionUID = -245336573;

    /**
     * The reference instance of <code>FLYWAY_TEST.schema_version</code>
     */
    public static final v1_SchemaVersion v1_SCHEMA_VERSION = new v1_SchemaVersion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<v1_SchemaVersionRecord> getRecordType() {
        return v1_SchemaVersionRecord.class;
    }

    /**
     * The column <code>FLYWAY_TEST.schema_version.installed_rank</code>.
     */
    public final TableField<v1_SchemaVersionRecord, Integer> v1_INSTALLED_RANK = createField("installed_rank", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>FLYWAY_TEST.schema_version.version</code>.
     */
    public final TableField<v1_SchemaVersionRecord, String> v1_VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>FLYWAY_TEST.schema_version.description</code>.
     */
    public final TableField<v1_SchemaVersionRecord, String> v1_DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>FLYWAY_TEST.schema_version.type</code>.
     */
    public final TableField<v1_SchemaVersionRecord, String> v1_TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>FLYWAY_TEST.schema_version.script</code>.
     */
    public final TableField<v1_SchemaVersionRecord, String> v1_SCRIPT = createField("script", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false), this, "");

    /**
     * The column <code>FLYWAY_TEST.schema_version.checksum</code>.
     */
    public final TableField<v1_SchemaVersionRecord, Integer> v1_CHECKSUM = createField("checksum", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>FLYWAY_TEST.schema_version.installed_by</code>.
     */
    public final TableField<v1_SchemaVersionRecord, String> v1_INSTALLED_BY = createField("installed_by", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>FLYWAY_TEST.schema_version.installed_on</code>.
     */
    public final TableField<v1_SchemaVersionRecord, Timestamp> v1_INSTALLED_ON = createField("installed_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>FLYWAY_TEST.schema_version.execution_time</code>.
     */
    public final TableField<v1_SchemaVersionRecord, Integer> v1_EXECUTION_TIME = createField("execution_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>FLYWAY_TEST.schema_version.success</code>.
     */
    public final TableField<v1_SchemaVersionRecord, Boolean> v1_SUCCESS = createField("success", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>FLYWAY_TEST.schema_version</code> table reference
     */
    public v1_SchemaVersion() {
        this("schema_version", null);
    }

    /**
     * Create an aliased <code>FLYWAY_TEST.schema_version</code> table reference
     */
    public v1_SchemaVersion(String alias) {
        this(alias, v1_SCHEMA_VERSION);
    }

    private v1_SchemaVersion(String alias, Table<v1_SchemaVersionRecord> aliased) {
        this(alias, aliased, null);
    }

    private v1_SchemaVersion(String alias, Table<v1_SchemaVersionRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<v1_SchemaVersionRecord> getPrimaryKey() {
        return Keys.v1_SCHEMA_VERSION_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<v1_SchemaVersionRecord>> getKeys() {
        return Arrays.<UniqueKey<v1_SchemaVersionRecord>>asList(Keys.v1_SCHEMA_VERSION_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v1_SchemaVersion as(String alias) {
        return new v1_SchemaVersion(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public v1_SchemaVersion rename(String name) {
        return new v1_SchemaVersion(name, null);
    }
}
