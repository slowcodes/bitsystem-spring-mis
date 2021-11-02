package ng.com.bitsystems.mis.command.consultation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class DiseaseDirectoryCommand {
    private Long id;
    private String ICD_10_Code;
    private String ICD_10_Code_Dotnotation;
    private String ICD_10_Description;
    private String ICD_9_Code;
    private String ICD_9_Code_Dotnotation;
    private String ICD_9_Description;
    private String DSM_4_Axis;
    private String Approximate;
    private String Nomap;
    private String Combination;
    private String Scenario;
    private String Choicelist;
    private String DX_CAT;
    private String Termsearch;
    private LocalDateTime Effdt;
    private LocalDateTime Enddt;
}
