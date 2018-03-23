package findev.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "eventtypes")
@Getter
@Setter
public class EventType extends BaseIdAndNameEntity {
    @Column(name = "coeft")
    private String coefficient;
}
