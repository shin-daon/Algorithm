-- 코드를 입력하세요
SELECT A.BOOK_ID, B.AUTHOR_NAME, TO_CHAR(A.PUBLISHED_DATE, 'YYYY-MM-DD')
FROM BOOK A
    INNER JOIN AUTHOR B ON A.AUTHOR_ID = B.AUTHOR_ID
WHERE A.CATEGORY = '경제'
ORDER BY A.PUBLISHED_DATE ASC;