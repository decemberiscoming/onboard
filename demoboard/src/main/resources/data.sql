INSERT INTO article (created_at, modified_at, created_by, modified_by, content, hashtag, title)
VALUES
    ('2023-04-04 19:03:06', '2023-05-03 09:37:57', 'UserA', 'UserB', 'Sample content 1', '#hashtag1', 'Sample title 1'),
    ('2023-04-05 10:03:06', '2023-05-04 11:37:57', 'UserC', 'UserD', 'Sample content 2', '#hashtag2', 'Sample title 2'),
    ('2023-04-06 11:03:06', '2023-05-05 12:37:57', 'UserE', 'UserF', 'Sample content 3', '#hashtag3', 'Sample title 3'),
    ('2023-04-07 12:03:06', '2023-05-06 13:37:57', 'UserG', 'UserH', 'Sample content 4', '#hashtag4', 'Sample title 4'),
    ('2023-04-08 13:03:06', '2023-05-07 14:37:57', 'UserI', 'UserJ', 'Sample content 5', '#hashtag5', 'Sample title 5'),
    ('2023-04-09 14:03:06', '2023-05-08 15:37:57', 'UserK', 'UserL', 'Sample content 6', '#hashtag6', 'Sample title 6'),
    ('2023-04-10 15:03:06', '2023-05-09 16:37:57', 'UserM', 'UserN', 'Sample content 7', '#hashtag7', 'Sample title 7'),
    ('2023-04-11 16:03:06', '2023-05-10 17:37:57', 'UserO', 'UserP', 'Sample content 8', '#hashtag8', 'Sample title 8'),
    ('2023-04-12 17:03:06', '2023-05-11 18:37:57', 'UserQ', 'UserR', 'Sample content 9', '#hashtag9', 'Sample title 9'),
    ('2023-04-13 18:03:06', '2023-05-12 19:37:57', 'UserS', 'UserT', 'Sample content 10', '#hashtag10', 'Sample title 10');



INSERT INTO article_comment (article_id, created_at, modified_at, created_by, modified_by,  content)
VALUES
    (1, '2023-04-04 19:03:06', '2023-05-03 09:37:57', 'UserA', 'UserB', 'Sample content 1'),
    (2, '2023-04-05 10:03:06', '2023-05-04 11:37:57', 'UserC', 'UserD', 'Sample content 2'),
    (3, '2023-04-06 11:03:06', '2023-05-05 12:37:57', 'UserE', 'UserF', 'Sample content 3'),
    (2, '2023-04-07 12:03:06', '2023-05-06 13:37:57', 'UserG', 'UserH', 'Sample content 4'),
    (2, '2023-04-08 13:03:06', '2023-05-07 14:37:57', 'UserI', 'UserJ', 'Sample content 5'),
    (4, '2023-04-09 14:03:06', '2023-05-08 15:37:57', 'UserK', 'UserL', 'Sample content 6'),
    (5, '2023-04-10 15:03:06', '2023-05-09 16:37:57', 'UserM', 'UserN', 'Sample content 7'),
    (6, '2023-04-07 12:03:06', '2023-05-06 13:37:57', 'UserG', 'UserH', 'Sample content 4'),
    (7, '2023-04-08 13:03:06', '2023-05-07 14:37:57', 'UserI', 'UserJ', 'Sample content 5'),
    (8, '2023-04-09 14:03:06', '2023-05-08 15:37:57', 'UserK', 'UserL', 'Sample content 6'),
    (9, '2023-04-10 15:03:06', '2023-05-09 16:37:57', 'UserM', 'UserN', 'Sample content 7'),
    (3, '2023-04-11 16:03:06', '2023-05-10 17:37:57', 'UserO', 'UserP', 'Sample content 8'),
    (5, '2023-04-12 17:03:06', '2023-05-11 18:37:57', 'UserQ', 'UserR', 'Sample content 9'),
    (5, '2023-04-13 18:03:06', '2023-05-12 19:37:57', 'UserS', 'UserT', 'Sample content 10');
