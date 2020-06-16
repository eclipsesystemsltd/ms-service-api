package uk.co.meridenspares.service.api;

import java.util.List;

import uk.co.meridenspares.domain.TopicComment;

/**
 * This interface declares the specific methods to be provided by the 'TopicComment' service.
 * @author user
 *
 */
public interface TopicCommentService extends GenericService<TopicComment, Long> {
	
	public void delete(TopicComment comment);

	public List<TopicComment> findByEntryId(Long entryId);
	
	public List<String> findReplyToByEntryId(Long entryId);
}
