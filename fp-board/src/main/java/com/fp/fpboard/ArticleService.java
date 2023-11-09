package com.fp.fpboard;

import com.fp.fpboard.domain.type.SearchType;
import com.fp.fpboard.dto.ArticleDto;
import com.fp.fpboard.dto.ArticleUpdateDto;
import com.fp.fpboard.repository.ArticleRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    @Transactional(readOnly = true)
    public List<ArticleDto> searchArticles(SearchType title, String search_keyword){
        return List.of();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l){
        return null;
    }

    public void saveArticle(ArticleDto dto){

    }

    public void updateArticle(long articleId, ArticleUpdateDto dto){

    }
}