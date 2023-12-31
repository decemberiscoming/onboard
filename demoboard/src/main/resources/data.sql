-- 테스트 계정
-- TODO: 테스트용이지만 비밀번호가 노출된 데이터 세팅. 개선하는 것이 좋을 지 고민해 보자.
insert into user_account (user_id, user_password, nickname, email, memo, created_at, created_by, modified_at, modified_by) values
    ('writer', 'asdf1234', 'writer', 'writer@mail.com', 'I am writer.', now(), 'writer', now(), 'writer')
;
insert into user_account (user_id, user_password, nickname, email, memo, created_at, created_by, modified_at, modified_by) values
    ('writer2', 'asdf1234', 'write2', 'writer2@mail.com', 'I am writer2.', now(), 'writer2', now(), 'writer2')
;

INSERT INTO article (user_account_id, created_at, modified_at, created_by, modified_by, content, hashtag, title)
VALUES
    (1, '2023-04-04 19:03:06', '2023-05-03 09:37:57', 'UserA', 'UserB', 'Sample content 1', '#hashtag1', 'Sample title 1'),
    (2, '2023-04-05 10:03:06', '2023-05-04 11:37:57', 'UserC', 'UserD', 'Sample content 2', '#hashtag2', 'Sample title 2'),
    (1, '2023-04-06 11:03:06', '2023-05-05 12:37:57', 'UserE', 'UserF', 'Sample content 3', '#hashtag3', 'Sample title 3'),
    (1, '2023-04-07 12:03:06', '2023-05-06 13:37:57', 'UserG', 'UserH', 'Sample content 4', '#hashtag4', 'Sample title 4'),
    (1, '2023-04-08 13:03:06', '2023-05-07 14:37:57', 'UserI', 'UserJ', 'Sample content 5', '#hashtag5', 'Sample title 5'),
    (1, '2023-04-09 14:03:06', '2023-05-08 15:37:57', 'UserK', 'UserL', 'Sample content 6', '#hashtag6', 'Sample title 6'),
    (2, '2023-04-10 15:03:06', '2023-05-09 16:37:57', 'UserM', 'UserN', 'Sample content 7', '#hashtag7', 'Sample title 7'),
    (2, '2023-04-11 16:03:06', '2023-05-10 17:37:57', 'UserO', 'UserP', 'Sample content 8', '#hashtag8', 'Sample title 8'),
    (1, '2023-04-12 17:03:06', '2023-05-11 18:37:57', 'UserQ', 'UserR', 'Sample content 9', '#hashtag9', 'Sample title 9'),
    (1, '2023-04-13 18:03:06', '2023-05-12 19:37:57', 'UserS', 'UserT', 'Sample content 10', '#hashtag10', 'Sample title 10');


INSERT INTO article_comment (article_id, user_account_id, content, created_by, modified_by, created_at, modified_at)
VALUES
    (1, 1, 'Random content 1', 'UserX', 'UserY', '2023-05-01 12:04:51', '2023-05-02 14:04:52'),
    (1, 2, 'Random content 2', 'UserZ', 'UserA', '2023-05-02 15:04:53', '2023-05-03 16:04:54'),
    (2, 1, 'Random content 3', 'UserB', 'UserC', '2023-05-03 17:04:55', '2023-05-04 18:04:56'),
    (3, 1, 'Random content 4', 'UserD', 'UserE', '2023-05-04 19:04:57', '2023-05-05 20:04:58'),
    (4, 2, 'Random content 5', 'UserF', 'UserG', '2023-05-05 21:04:59', '2023-05-06 22:05:00'),
    (5, 2, 'Random content 6', 'UserH', 'UserI', '2023-05-06 10:05:01', '2023-05-07 11:05:02'),
    (6, 1, 'Random content 7', 'UserJ', 'UserK', '2023-05-07 12:05:03', '2023-05-08 13:05:04'),
    (7, 1, 'Random content 8', 'UserL', 'UserM', '2023-05-08 14:05:05', '2023-05-09 15:05:06'),
    (8, 2, 'Random content 9', 'UserN', 'UserO', '2023-05-09 16:05:07', '2023-05-10 17:05:08'),
    (2, 1,  'Random content 10', 'UserP', 'UserQ', '2023-05-10 18:05:09', '2023-05-11 19:05:10'),
    (9, 1, 'Random content 11', 'UserR', 'UserS', '2023-05-11 20:05:11', '2023-05-12 21:05:12'),
    (10, 1, 'Random content 12', 'UserT', 'UserU', '2023-05-12 09:05:13', '2023-05-13 10:05:14'),
    (1, 1, 'Random content 13', 'UserV', 'UserW', '2023-05-13 11:05:15', '2023-05-14 12:05:16'),
    (4, 1, 'Random content 14', 'UserX', 'UserY', '2023-05-14 13:05:17', '2023-05-15 14:05:18'),
    (5, 1, 'Random content 15', 'UserZ', 'UserA', '2023-05-15 15:05:19', '2023-05-16 16:05:20'),
    (9, 1, 'Random content 16', 'UserB', 'UserC', '2023-05-16 17:05:21', '2023-05-17 18:05:22'),
    (5, 1,  'Random content 17', 'UserD', 'UserE', '2023-05-17 19:05:23', '2023-05-18 20:05:24'),
    (10, 1, 'Random content 18', 'UserF', 'UserG', '2023-05-18 08:05:25', '2023-05-19 09:05:26'),
    (8, 1, 'Random content 19', 'UserH', 'UserI', '2023-05-19 10:05:27', '2023-05-20 11:05:28'),
    (8, 1, 'Random content 20', 'UserJ', 'UserK', '2023-05-20 12:05:29', '2023-05-21 13:05:30');
