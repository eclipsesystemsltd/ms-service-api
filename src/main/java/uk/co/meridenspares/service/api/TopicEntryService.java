package uk.co.meridenspares.service.api;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import uk.co.meridenspares.domain.SearchCriteria;
import uk.co.meridenspares.domain.TopicEntry;

/**
 * This interface declares the specific methods to be provided by the 'TopicEntry' service.
 * @author user
 *
 */
public interface TopicEntryService extends GenericService<TopicEntry, Long> {
	
	public List<TopicEntry> findByCategoryId(String categoryId);
	
	public Page<TopicEntry> findAllByPage(Pageable pageable);
	
	public Page<TopicEntry> findEntryByCriteria(SearchCriteria searchCriteria, Pageable pageable);
}
