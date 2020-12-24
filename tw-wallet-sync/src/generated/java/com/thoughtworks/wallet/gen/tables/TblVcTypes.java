/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen.tables;


import com.thoughtworks.wallet.gen.Keys;
import com.thoughtworks.wallet.gen.Public;
import com.thoughtworks.wallet.gen.tables.records.TblVcTypesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblVcTypes extends TableImpl<TblVcTypesRecord> {

    private static final long serialVersionUID = -335777455;

    /**
     * The reference instance of <code>public.tbl_vc_types</code>
     */
    public static final TblVcTypes TBL_VC_TYPES = new TblVcTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblVcTypesRecord> getRecordType() {
        return TblVcTypesRecord.class;
    }

    /**
     * The column <code>public.tbl_vc_types.id</code>.
     */
    public final TableField<TblVcTypesRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.tbl_vc_types.name</code>.
     */
    public final TableField<TblVcTypesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.tbl_vc_types.issuer</code>.
     */
    public final TableField<TblVcTypesRecord, String> ISSUER = createField(DSL.name("issuer"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.tbl_vc_types.content</code>.
     */
    public final TableField<TblVcTypesRecord, String[]> CONTENT = createField(DSL.name("content"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>public.tbl_vc_types</code> table reference
     */
    public TblVcTypes() {
        this(DSL.name("tbl_vc_types"), null);
    }

    /**
     * Create an aliased <code>public.tbl_vc_types</code> table reference
     */
    public TblVcTypes(String alias) {
        this(DSL.name(alias), TBL_VC_TYPES);
    }

    /**
     * Create an aliased <code>public.tbl_vc_types</code> table reference
     */
    public TblVcTypes(Name alias) {
        this(alias, TBL_VC_TYPES);
    }

    private TblVcTypes(Name alias, Table<TblVcTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblVcTypes(Name alias, Table<TblVcTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TblVcTypes(Table<O> child, ForeignKey<O, TblVcTypesRecord> key) {
        super(child, key, TBL_VC_TYPES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<TblVcTypesRecord> getPrimaryKey() {
        return Keys.TBL_VC_TYPES_PKEY;
    }

    @Override
    public List<UniqueKey<TblVcTypesRecord>> getKeys() {
        return Arrays.<UniqueKey<TblVcTypesRecord>>asList(Keys.TBL_VC_TYPES_PKEY);
    }

    @Override
    public List<ForeignKey<TblVcTypesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TblVcTypesRecord, ?>>asList(Keys.TBL_VC_TYPES__TBL_VC_TYPES_ISSUER_FKEY);
    }

    public TblIssuers tblIssuers() {
        return new TblIssuers(this, Keys.TBL_VC_TYPES__TBL_VC_TYPES_ISSUER_FKEY);
    }

    @Override
    public TblVcTypes as(String alias) {
        return new TblVcTypes(DSL.name(alias), this);
    }

    @Override
    public TblVcTypes as(Name alias) {
        return new TblVcTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TblVcTypes rename(String name) {
        return new TblVcTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TblVcTypes rename(Name name) {
        return new TblVcTypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
