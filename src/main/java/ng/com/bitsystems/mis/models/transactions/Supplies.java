package ng.com.bitsystems.mis.models.transactions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.pharmacy.Suppliers;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Supplies extends BaseEntity {

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Suppliers supplier;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Transaction transaction;
}
