package tutorials.anirudh.greendaotutorial.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "STUDENT".
*/
public class StudentDao extends AbstractDao<Student, Long> {

    public static final String TABLENAME = "STUDENT";

    /**
     * Properties of entity Student.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "Id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Division = new Property(2, String.class, "division", false, "DIVISION");
        public final static Property Standard = new Property(3, int.class, "standard", false, "STANDARD");
        public final static Property FathersName = new Property(4, String.class, "fathersName", false, "FATHERS_NAME");
        public final static Property MothersName = new Property(5, String.class, "mothersName", false, "MOTHERS_NAME");
        public final static Property ContactNumber = new Property(6, String.class, "contactNumber", false, "CONTACT_NUMBER");
    }


    public StudentDao(DaoConfig config) {
        super(config);
    }
    
    public StudentDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"STUDENT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: Id
                "\"NAME\" TEXT," + // 1: name
                "\"DIVISION\" TEXT," + // 2: division
                "\"STANDARD\" INTEGER NOT NULL ," + // 3: standard
                "\"FATHERS_NAME\" TEXT," + // 4: fathersName
                "\"MOTHERS_NAME\" TEXT," + // 5: mothersName
                "\"CONTACT_NUMBER\" TEXT);"); // 6: contactNumber
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"STUDENT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Student entity) {
        stmt.clearBindings();
 
        Long Id = entity.getId();
        if (Id != null) {
            stmt.bindLong(1, Id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String division = entity.getDivision();
        if (division != null) {
            stmt.bindString(3, division);
        }
        stmt.bindLong(4, entity.getStandard());
 
        String fathersName = entity.getFathersName();
        if (fathersName != null) {
            stmt.bindString(5, fathersName);
        }
 
        String mothersName = entity.getMothersName();
        if (mothersName != null) {
            stmt.bindString(6, mothersName);
        }
 
        String contactNumber = entity.getContactNumber();
        if (contactNumber != null) {
            stmt.bindString(7, contactNumber);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Student entity) {
        stmt.clearBindings();
 
        Long Id = entity.getId();
        if (Id != null) {
            stmt.bindLong(1, Id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String division = entity.getDivision();
        if (division != null) {
            stmt.bindString(3, division);
        }
        stmt.bindLong(4, entity.getStandard());
 
        String fathersName = entity.getFathersName();
        if (fathersName != null) {
            stmt.bindString(5, fathersName);
        }
 
        String mothersName = entity.getMothersName();
        if (mothersName != null) {
            stmt.bindString(6, mothersName);
        }
 
        String contactNumber = entity.getContactNumber();
        if (contactNumber != null) {
            stmt.bindString(7, contactNumber);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Student readEntity(Cursor cursor, int offset) {
        Student entity = new Student( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // Id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // division
            cursor.getInt(offset + 3), // standard
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // fathersName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // mothersName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // contactNumber
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Student entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDivision(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setStandard(cursor.getInt(offset + 3));
        entity.setFathersName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMothersName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setContactNumber(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Student entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Student entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Student entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}