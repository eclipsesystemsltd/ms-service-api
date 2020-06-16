package uk.co.meridenspares.service.api;

import java.util.List;

import uk.co.meridenspares.domain.TopicCategory;

/**
 * This interface declares the specific methods to be provided by the 'TopicCategory' service.
 * @author user
 *
 */
public interface TopicCategoryService extends GenericService<TopicCategory, Long> {

	public List<TopicCategory> findAllParentCategory();
	
	public List<TopicCategory> findAllSubCategory(String parentCategoryId);

}
