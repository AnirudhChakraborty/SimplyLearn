package tutorials.anirudh.greendaotutorial.database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by anirudh on 25/6/17.

 So we start by creating an entity or class. This entity will work just like a
 table in green dao. To make this entity a table all we need to do is add an annotation.

 **/

// This annotation defines this class as table to  green dao. Next we need to
//    give attributes to this class which will work like columns of the table

@Entity
public class Student {

//    We need to add a Long Id which acts as a unique key for for green dao tables


    //This specifies that the attribute Id is a auto increment unique id
    @org.greenrobot.greendao.annotation.Id (autoincrement = true)
    private Long Id; // For keeping things simple lets just say its an id


    //These are the other attributes for the for the entity.
    private String name;
    private String division;
    private int standard;
    private String fathersName;
    private String mothersName;
    private String contactNumber;

    @Generated(hash = 1476194370)
    public Student(Long Id, String name, String division, int standard, String fathersName,
            String mothersName, String contactNumber) {
        this.Id = Id;
        this.name = name;
        this.division = division;
        this.standard = standard;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.contactNumber = contactNumber;
    }

    @Generated(hash = 1556870573)
    public Student() {
    }
    public Long getId() {
        return this.Id;
    }
    public void setId(Long Id) {
        this.Id = Id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDivision() {
        return this.division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public int getStandard() {
        return this.standard;
    }
    public void setStandard(int standard) {
        this.standard = standard;
    }
    public String getFathersName() {
        return this.fathersName;
    }
    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }
    public String getMothersName() {
        return this.mothersName;
    }
    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     *  As we see this is the entity we created. After making the project
     *  These pieces of code have been genrated by dao itself..
     *
     * */


    /**
     *  Well oops I made changes to the genarated code :P
     *
     *  Live exaple for you to not change anything in the generated cod;
     *
     *  Easiest way to fix this is delete the generated code in this file and remake the
     *  project.
     *
     * */



}
