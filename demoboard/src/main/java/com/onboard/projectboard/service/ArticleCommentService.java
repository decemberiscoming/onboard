package com.onboard.projectboard.service;

import com.onboard.projectboard.dto.ArticleCommentDto;
import com.onboard.projectboard.dto.ArticleDto;
import com.onboard.projectboard.repository.ArticleCommentRepository;
import com.onboard.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleCommentRepository articleCommentRepository;
    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComment(long articlId) {
        return List.of();
    }

    public void saveArticleComment(ArticleCommentDto dto) {
    }
}
