package com.onboard.projectboard.service;

import com.onboard.projectboard.domain.Article;
import com.onboard.projectboard.domain.type.SearchType;
import com.onboard.projectboard.dto.ArticleDto;
import com.onboard.projectboard.dto.ArticleUpdateDto;
import com.onboard.projectboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;


@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks
    private ArticleService sut;

    @Mock
    private ArticleRepository articleRepository;

    @DisplayName("게시글 검색 후 리스트 반환")
    @Test
    void givenSearchParameters_whenSearchingArticles_thenReturnsArticleList() {

        // Given

        // When
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword"); // 제목, 본문, ID, 닉네임, 해시태그

        // Then
        //Assertions.assertThat(articles).isNotNull();
        assertThat(articles).isNotNull();

    }


    @DisplayName("게시글을 조회하면, 게시글을 반환")
    @Test
    void givenArticleId_whenSearchingArticle_thenReturnsArticle() {

        // Given

        // When
        ArticleDto articles = sut.searchArticle(1L);

        // Then
        assertThat(articles).isNotNull();

    }


    @DisplayName("게시글 내용 입력 후 생성")
    @Test
    void givenArticleInfo_whenSavingArticle_thenSavesArticle() {

        // Given
        given(articleRepository.save(any(Article.class))).willReturn(null);

        // When
        sut.saveArticle(ArticleDto.of(LocalDateTime.now(),"writer", "title", "content", "#hashtag"));

        // Then
        then(articleRepository).should().save(any(Article.class));

    }

    @DisplayName("게시글 ID와 내용 수정")
    @Test
    void givenArticleIdAndModifiedInfo_whenUpdatingArticle_thenUpdatesArticle() {

        // Given
        given(articleRepository.save(any(Article.class))).willReturn(null);

        // When
        sut.updateArticle(1L, ArticleUpdateDto.of("title", "content", "hashtag"));

        // Then
        then(articleRepository).should().save(any(Article.class));

    }

    @DisplayName("게시글 ID를 입력하면, 게시글 삭제")
    @Test
    void givenArticleId_whenDeletingArticle_thenDeletesArticle() {

        // Given
        willDoNothing().given(articleRepository).delete(any(Article.class));

        // When
        sut.deleteArticle(1L);

        // Then
        then(articleRepository).should().delete(any(Article.class));

    }

}