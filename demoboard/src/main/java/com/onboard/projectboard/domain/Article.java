package com.onboard.projectboard.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@ToString
@Table(indexes = {
        @Index(columnList="title"),
        @Index(columnList="hashtag"),
        @Index(columnList="createdAt"),
        @Index(columnList="createdBy"),
        })//index 잡을 예정, 본문 검색에는 index를 걸지 않는다.


@Entity

public class Article extends AuditingFields {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Setter @Column(nullable = false) private String title; // 제목
    @Setter @Column(nullable = false, length = 10000) private String content; // 본문, Column의 True는 기본 적용이므로 false만 따로 표시


    @Setter private String hashtag; // 해시태그, Null 가능

    @ToString.Exclude//article table data, 실무에서는 양방향 바인딩을 푼다. 편집의 불편함이 따른다. 게시글을 삭제할 때 연관된 댓글도 모두 삭제된다.
    //Exclude를 넣어 오버플로우 사태를 막는다.
    @OrderBy("id")
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private final Set<ArticleComment> articleComments = new LinkedHashSet<>(); //중복허용없이 리스트 콜렉션으로 확인



    protected Article() {}

    private Article(String title, String content, String hashtag) {
        this.title = title;
        this.content = content;
        this.hashtag = hashtag;
    }
    public static Article of(String title, String content, String hashtag) {
        return new Article(title, content, hashtag);
    }

    @Override //동등성 검사
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article article)) return false;
        return id != null && id.equals(article.id);
    }

    @Override //해시진행
    public int hashCode() {
        return Objects.hash(id);
    }
}
