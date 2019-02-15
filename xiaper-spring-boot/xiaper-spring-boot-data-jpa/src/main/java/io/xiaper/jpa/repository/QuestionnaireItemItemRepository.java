package io.xiaper.jpa.repository;

import io.xiaper.jpa.model.QuestionnaireItemItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bytedesk.com
 */
@Repository
public interface QuestionnaireItemItemRepository extends JpaRepository<QuestionnaireItemItem, Long> {

}