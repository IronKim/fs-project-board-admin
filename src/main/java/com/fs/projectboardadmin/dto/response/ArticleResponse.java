package com.fs.projectboardadmin.dto.response;

import com.fs.projectboardadmin.dto.ArticleDto;
import com.fs.projectboardadmin.dto.UserAccountDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL) // null 값은 응답에서 제외
public record ArticleResponse(
        Long id,
        UserAccountDto userAccount,
        String title,
        String content,
        LocalDateTime createdAt
) {

    public static ArticleResponse of(Long id, UserAccountDto userAccount, String title, String content, LocalDateTime createdAt) {
        return new ArticleResponse(id, userAccount, title, content, createdAt);
    }

    public static ArticleResponse withContent(ArticleDto dto) {
        return ArticleResponse.of(dto.id(), dto.userAccount(), dto.title(), dto.content(), dto.createdAt());
    }

    public static ArticleResponse withoutContent(ArticleDto dto) {
        return ArticleResponse.of(dto.id(), dto.userAccount(), dto.title(), null, dto.createdAt());
    }

}
