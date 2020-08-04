package ng.com.bitsystems.mis.models.laboratories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

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

    @OneToOne
    private VerifiedResults verifiedResults;

    @OneToOne
    private ResultCollectionLog resultCollectionLog;
}
