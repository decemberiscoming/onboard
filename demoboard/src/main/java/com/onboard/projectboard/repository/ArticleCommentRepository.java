package com.onboard.projectboard.repository;

import com.onboard.projectboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
