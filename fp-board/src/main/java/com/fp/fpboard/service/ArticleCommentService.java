package com.fp.fpboard.service;

import com.fp.fpboard.repository.ArticleCommentRepository;
import com.fp.fpboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class ArticleCommentService {
    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;
}
