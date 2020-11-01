package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class ResultCollectionCommand {
    private Long id;
    private Long userId;
    private LocalDate timeOfCollection;
    private ResultCommand resultCommand;
}
