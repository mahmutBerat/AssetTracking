package app.entity;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Mahmut on 10/7/2017.
 */
@Data
@Entity
//@AttributeOverrides(
//        @AttributeOverride(name = "id", column = @Column(name = "id"))
//)
public class User extends BaseEntity{

    @Column
    private long id;

}
