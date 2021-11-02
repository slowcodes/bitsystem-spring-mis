package ng.com.bitsystems.mis.models.laboratories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Results extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "users_id")
    private AppUsers appUsers;
    private String footNote;

    @Column(columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private LocalDate dateTransaction;

    @CreationTimestamp
    private LocalDateTime timeOfTransaction;

    private String resultNote;
    private String commentColor;
    private String signatoryColor;

    @OneToOne
    private Queue queue;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<ExperimentReadings> experimentReadings=new HashSet<>();
}
