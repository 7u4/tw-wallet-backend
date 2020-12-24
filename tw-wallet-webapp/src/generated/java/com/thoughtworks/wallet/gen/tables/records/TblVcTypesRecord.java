/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen.tables.records;


import com.thoughtworks.wallet.gen.tables.TblVcTypes;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblVcTypesRecord extends UpdatableRecordImpl<TblVcTypesRecord> implements Record4<String, String, String, String[]> {

    private static final long serialVersionUID = -185961091;

    /**
     * Setter for <code>public.tbl_vc_types.id</code>.
     */
    public TblVcTypesRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_vc_types.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.tbl_vc_types.name</code>.
     */
    public TblVcTypesRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_vc_types.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tbl_vc_types.issuer</code>.
     */
    public TblVcTypesRecord setIssuer(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_vc_types.issuer</code>.
     */
    public String getIssuer() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tbl_vc_types.content</code>.
     */
    public TblVcTypesRecord setContent(String[] value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_vc_types.content</code>.
     */
    public String[] getContent() {
        return (String[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TblVcTypes.TBL_VC_TYPES.ID;
    }

    @Override
    public Field<String> field2() {
        return TblVcTypes.TBL_VC_TYPES.NAME;
    }

    @Override
    public Field<String> field3() {
        return TblVcTypes.TBL_VC_TYPES.ISSUER;
    }

    @Override
    public Field<String[]> field4() {
        return TblVcTypes.TBL_VC_TYPES.CONTENT;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getIssuer();
    }

    @Override
    public String[] component4() {
        return getContent();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getIssuer();
    }

    @Override
    public String[] value4() {
        return getContent();
    }

    @Override
    public TblVcTypesRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public TblVcTypesRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TblVcTypesRecord value3(String value) {
        setIssuer(value);
        return this;
    }

    @Override
    public TblVcTypesRecord value4(String[] value) {
        setContent(value);
        return this;
    }

    @Override
    public TblVcTypesRecord values(String value1, String value2, String value3, String[] value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblVcTypesRecord
     */
    public TblVcTypesRecord() {
        super(TblVcTypes.TBL_VC_TYPES);
    }

    /**
     * Create a detached, initialised TblVcTypesRecord
     */
    public TblVcTypesRecord(String id, String name, String issuer, String[] content) {
        super(TblVcTypes.TBL_VC_TYPES);

        set(0, id);
        set(1, name);
        set(2, issuer);
        set(3, content);
    }
}
