/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.migrator.model.v2.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.example.migrator.model.v2.tables.v2_SchemaVersion;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
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
public class v2_SchemaVersionRecord extends UpdatableRecordImpl<v2_SchemaVersionRecord> implements Record10<Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> {

    private static final long serialVersionUID = -488492535;

    /**
     * Setter for <code>FLYWAY_TEST.schema_version.installed_rank</code>.
     */
    public void setInstalledRank(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.schema_version.installed_rank</code>.
     */
    public Integer getInstalledRank() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>FLYWAY_TEST.schema_version.version</code>.
     */
    public void setVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.schema_version.version</code>.
     */
    public String getVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>FLYWAY_TEST.schema_version.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.schema_version.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>FLYWAY_TEST.schema_version.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.schema_version.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>FLYWAY_TEST.schema_version.script</code>.
     */
    public void setScript(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.schema_version.script</code>.
     */
    public String getScript() {
        return (String) get(4);
    }

    /**
     * Setter for <code>FLYWAY_TEST.schema_version.checksum</code>.
     */
    public void setChecksum(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.schema_version.checksum</code>.
     */
    public Integer getChecksum() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>FLYWAY_TEST.schema_version.installed_by</code>.
     */
    public void setInstalledBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.schema_version.installed_by</code>.
     */
    public String getInstalledBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>FLYWAY_TEST.schema_version.installed_on</code>.
     */
    public void setInstalledOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.schema_version.installed_on</code>.
     */
    public Timestamp getInstalledOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>FLYWAY_TEST.schema_version.execution_time</code>.
     */
    public void setExecutionTime(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.schema_version.execution_time</code>.
     */
    public Integer getExecutionTime() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>FLYWAY_TEST.schema_version.success</code>.
     */
    public void setSuccess(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>FLYWAY_TEST.schema_version.success</code>.
     */
    public Boolean getSuccess() {
        return (Boolean) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return v2_SchemaVersion.v2_SCHEMA_VERSION.v2_INSTALLED_RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return v2_SchemaVersion.v2_SCHEMA_VERSION.v2_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return v2_SchemaVersion.v2_SCHEMA_VERSION.v2_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return v2_SchemaVersion.v2_SCHEMA_VERSION.v2_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return v2_SchemaVersion.v2_SCHEMA_VERSION.v2_SCRIPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return v2_SchemaVersion.v2_SCHEMA_VERSION.v2_CHECKSUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return v2_SchemaVersion.v2_SCHEMA_VERSION.v2_INSTALLED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return v2_SchemaVersion.v2_SCHEMA_VERSION.v2_INSTALLED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return v2_SchemaVersion.v2_SCHEMA_VERSION.v2_EXECUTION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return v2_SchemaVersion.v2_SCHEMA_VERSION.v2_SUCCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getInstalledRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getScript();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getChecksum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getInstalledBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getInstalledOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getExecutionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getSuccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord value1(Integer value) {
        setInstalledRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord value2(String value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord value5(String value) {
        setScript(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord value6(Integer value) {
        setChecksum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord value7(String value) {
        setInstalledBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord value8(Timestamp value) {
        setInstalledOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord value9(Integer value) {
        setExecutionTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord value10(Boolean value) {
        setSuccess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public v2_SchemaVersionRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, String value7, Timestamp value8, Integer value9, Boolean value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached v2_SchemaVersionRecord
     */
    public v2_SchemaVersionRecord() {
        super(v2_SchemaVersion.v2_SCHEMA_VERSION);
    }

    /**
     * Create a detached, initialised v2_SchemaVersionRecord
     */
    public v2_SchemaVersionRecord(Integer installedRank, String version, String description, String type, String script, Integer checksum, String installedBy, Timestamp installedOn, Integer executionTime, Boolean success) {
        super(v2_SchemaVersion.v2_SCHEMA_VERSION);

        set(0, installedRank);
        set(1, version);
        set(2, description);
        set(3, type);
        set(4, script);
        set(5, checksum);
        set(6, installedBy);
        set(7, installedOn);
        set(8, executionTime);
        set(9, success);
    }
}
