package ng.com.bitsystems.mis.models;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public boolean isNew() {
        return this.id == null;
    }

}
