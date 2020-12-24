/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen.tables;


import com.thoughtworks.wallet.gen.Keys;
import com.thoughtworks.wallet.gen.Public;
import com.thoughtworks.wallet.gen.tables.records.TblIssuersRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class TblIssuers extends TableImpl<TblIssuersRecord> {

    private static final long serialVersionUID = -1669104030;

    /**
     * The reference instance of <code>public.tbl_issuers</code>
     */
    public static final TblIssuers TBL_ISSUERS = new TblIssuers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblIssuersRecord> getRecordType() {
        return TblIssuersRecord.class;
    }

    /**
     * The column <code>public.tbl_issuers.id</code>.
     */
    public final TableField<TblIssuersRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.tbl_issuers.name</code>.
     */
    public final TableField<TblIssuersRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * Create a <code>public.tbl_issuers</code> table reference
     */
    public TblIssuers() {
        this(DSL.name("tbl_issuers"), null);
    }

    /**
     * Create an aliased <code>public.tbl_issuers</code> table reference
     */
    public TblIssuers(String alias) {
        this(DSL.name(alias), TBL_ISSUERS);
    }

    /**
     * Create an aliased <code>public.tbl_issuers</code> table reference
     */
    public TblIssuers(Name alias) {
        this(alias, TBL_ISSUERS);
    }

    private TblIssuers(Name alias, Table<TblIssuersRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblIssuers(Name alias, Table<TblIssuersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TblIssuers(Table<O> child, ForeignKey<O, TblIssuersRecord> key) {
        super(child, key, TBL_ISSUERS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<TblIssuersRecord> getPrimaryKey() {
        return Keys.TBL_ISSUERS_PKEY;
    }

    @Override
    public List<UniqueKey<TblIssuersRecord>> getKeys() {
        return Arrays.<UniqueKey<TblIssuersRecord>>asList(Keys.TBL_ISSUERS_PKEY);
    }

    @Override
    public TblIssuers as(String alias) {
        return new TblIssuers(DSL.name(alias), this);
    }

    @Override
    public TblIssuers as(Name alias) {
        return new TblIssuers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TblIssuers rename(String name) {
        return new TblIssuers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TblIssuers rename(Name name) {
        return new TblIssuers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
