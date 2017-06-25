package tutorials.anirudh.greendaotutorial.database;

/**
 * Created by anirudh on 25/6/17.
 **/

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 *  Lets create anonther entity to help you understand better
 *
 *  first we add the annotation for dao to understand that this is an entity
 * */


/**
 *
 *  And viola its done. See how all the code was generated in this class
 *
 *
 *  What actually happend is  :
 *   Whenever you define a class as an entity, Dao considers it as a table and the
 *   attributes that you have defined in the class are considered as columns in that table
 *
 *  So here the table name is  :
 *                       School
    ------------------------------------------------------

 And the colums would be
    Name        Address       Rank


 Cool! Lets move ahead !
 *
 * */

@Entity
public class School {

    //Next we add a Long unique Id
//  Then we specify that it has to auto increment

    @org.greenrobot.greendao.annotation.Id (autoincrement = true)
    private Long Id;

    //Next we give it attributes

    private String name;
    private String address;
    private int rank;

    @Generated(hash = 1688231197)
    public School(Long Id, String name, String address, int rank) {
        this.Id = Id;
        this.name = name;
        this.address = address;
        this.rank = rank;
    }
    @Generated(hash = 1579966795)
    public School() {
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
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getRank() {
        return this.rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
}
