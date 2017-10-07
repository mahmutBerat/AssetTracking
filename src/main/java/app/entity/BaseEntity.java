package app.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Mahmut on 10/7/2017.
 */
@Data
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    protected long id;

}
