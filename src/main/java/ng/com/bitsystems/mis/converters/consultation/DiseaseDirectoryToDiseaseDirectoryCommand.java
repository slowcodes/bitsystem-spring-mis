package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.DiseaseDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DiseaseDirectoryToDiseaseDirectoryCommand implements Converter<DiseaseDirectory, DiseaseDirectoryCommand> {

    @Override
    public DiseaseDirectoryCommand convert(DiseaseDirectory source) {
        if(source==null){
            return null;
        }
        DiseaseDirectoryCommand diseaseDirectoryCommand = new DiseaseDirectoryCommand();

        diseaseDirectoryCommand.setId(source.getId());
        diseaseDirectoryCommand.setApproximate(source.getApproximate());
        diseaseDirectoryCommand.setChoicelist(source.getChoicelist());
        diseaseDirectoryCommand.setCombination(source.getCombination());
        diseaseDirectoryCommand.setDSM_4_Axis(source.getDSM_4_Axis());
        diseaseDirectoryCommand.setDX_CAT(source.getDX_CAT());
        diseaseDirectoryCommand.setEffdt(source.getEffdt());
        diseaseDirectoryCommand.setEnddt(source.getEnddt());
        diseaseDirectoryCommand.setICD_9_Code(source.getICD_9_Code());
        diseaseDirectoryCommand.setICD_9_Code_Dotnotation(source.getICD_9_Code_Dotnotation());
        diseaseDirectoryCommand.setICD_9_Description(source.getICD_9_Description());
        diseaseDirectoryCommand.setICD_10_Code(source.getICD_10_Code());
        diseaseDirectoryCommand.setICD_10_Code_Dotnotation(source.getICD_10_Code_Dotnotation());
        diseaseDirectoryCommand.setICD_10_Description(source.getICD_10_Description());
        diseaseDirectoryCommand.setNomap(source.getNomap());
        diseaseDirectoryCommand.setScenario(source.getScenario());
        diseaseDirectoryCommand.setTermsearch(source.getTermsearch());

        return diseaseDirectoryCommand;
    }
}
