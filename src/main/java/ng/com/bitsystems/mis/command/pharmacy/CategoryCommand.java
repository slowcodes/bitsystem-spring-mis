package ng.com.bitsystems.mis.command.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
    private Long id;
    private String categoryName;
    private String categoryDesc;
    private LocalDate entryDate;
}
