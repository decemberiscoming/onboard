package com.onboard.projectboard.service;

import com.onboard.projectboard.domain.Article;
import com.onboard.projectboard.domain.ArticleComment;
import com.onboard.projectboard.dto.ArticleCommentDto;
import com.onboard.projectboard.dto.ArticleDto;
import com.onboard.projectboard.repository.ArticleCommentRepository;
import com.onboard.projectboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@DisplayName("비즈니스 로직 - 댓글")
@ExtendWith(MockitoExtension.class)
class ArticleCommentServiceTest {

    @InjectMocks private ArticleCommentService sut;
    @Mock private ArticleCommentRepository articleCommentRepository;
    @Mock private ArticleRepository articleRepository;

    @DisplayName("댓글 ID로 조회하면, 해당하는 댓글 리스트를 반환")
    @Test
    void givenArticledId_whenSearchingArticleComments_ThenReturnsArticleComments() {

        // Given
        Long articleId = 1L;
        given(articleRepository.findById(articleId)).willReturn(Optional.of(Article.of("title", "content", "#hashtag"))
        );

        // When
        List<ArticleCommentDto> articleComments = sut.searchArticleComment(1L);

        // Then
        assertThat(articleComments).isNotNull();
        then(articleRepository).should().findById(articleId);

    }

    @DisplayName("댓글 정보를 입력하면, 댓글을 저장한다. ")
    @Test
    void givenArticleCommentInfo_whenSavingArticleComment_thenSavesArticleComment() {

        // Given
        given(articleCommentRepository.save(any(ArticleComment.class))).willReturn(null);

        // When
        sut.saveArticleComment(ArticleCommentDto.of(LocalDateTime.now(),"writer", LocalDateTime.now(), "writer", "comment"));

        // Then
        then(articleCommentRepository).should().save(any(ArticleComment.class));

    }

}