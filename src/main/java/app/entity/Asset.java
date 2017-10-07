package app.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Mahmut on 10/7/2017.
 */
@Data
@Entity
public class Asset extends BaseEntity{

    @Column
    private long id;
}
