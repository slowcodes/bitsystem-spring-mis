package ng.com.bitsystems.mis.models.laboratories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;
import java.util.Date;
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
    private Users users;
    private String footNote;
    private Date logTime;
    private String resultNote;
    private String commentColor;
    private String signatoryColor;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "result")
    private Set<ExperimentReadings> experimentReadings=new HashSet<>();

}
