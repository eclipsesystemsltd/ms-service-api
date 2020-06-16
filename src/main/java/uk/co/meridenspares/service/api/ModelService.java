package uk.co.meridenspares.service.api;

import java.util.List;

import uk.co.meridenspares.domain.Model;
import uk.co.meridenspares.domain.ModelRange;
import uk.co.meridenspares.domain.Section;
import uk.co.meridenspares.service.api.exception.MsServiceException;

/**
 * This interface declares the specific methods to be provided by the 'Model' service.
 * @author user
 *
 */
public interface ModelService extends GenericService<Model, Long> {

	List<ModelRange> getModelRanges() throws MsServiceException;
	
	ModelRange findModelRangeByName(String modelRange) throws MsServiceException;

	Model findModelByName(String model, int year) throws MsServiceException;

	List<Model> getModelsForYear(int year) throws MsServiceException;

	List<Integer> getModelYears() throws MsServiceException;

	List<Integer> getModelYears(ModelRange modelRange) throws MsServiceException;
	
	/**
	 * MAY NOT NEED AS MODEL CONTAINS SECTIONS????????????????????????
	 * @param model
	 * @return
	 * @throws MsServiceException
	 */
	List<Section> getSections(Model model) throws MsServiceException;
}
