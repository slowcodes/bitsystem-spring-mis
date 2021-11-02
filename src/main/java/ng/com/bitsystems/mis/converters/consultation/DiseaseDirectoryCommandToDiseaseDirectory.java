package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.DiseaseDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DiseaseDirectoryCommandToDiseaseDirectory implements Converter<DiseaseDirectoryCommand, DiseaseDirectory> {

    @Override
    public DiseaseDirectory convert(DiseaseDirectoryCommand source) {
        if(source==null){
            return null;
        }

        DiseaseDirectory diseaseDirectory = new DiseaseDirectory();
        diseaseDirectory.setId(source.getId());
        diseaseDirectory.setApproximate(source.getApproximate());
        diseaseDirectory.setChoicelist(source.getChoicelist());
        diseaseDirectory.setCombination(source.getCombination());
        diseaseDirectory.setDSM_4_Axis(source.getDSM_4_Axis());
        diseaseDirectory.setDX_CAT(source.getDX_CAT());
        diseaseDirectory.setEffdt(source.getEffdt());
        diseaseDirectory.setEnddt(source.getEnddt());
        diseaseDirectory.setICD_9_Code(source.getICD_9_Code());
        diseaseDirectory.setICD_9_Code_Dotnotation(source.getICD_9_Code_Dotnotation());
        diseaseDirectory.setICD_9_Description(source.getICD_9_Description());
        diseaseDirectory.setICD_10_Code(source.getICD_10_Code());
        diseaseDirectory.setICD_10_Code_Dotnotation(source.getICD_10_Code_Dotnotation());
        diseaseDirectory.setICD_10_Description(source.getICD_10_Description());
        diseaseDirectory.setNomap(source.getNomap());
        diseaseDirectory.setScenario(source.getScenario());
        diseaseDirectory.setTermsearch(source.getTermsearch());

        return diseaseDirectory;
    }
}
