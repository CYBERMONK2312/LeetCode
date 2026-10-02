-- # Write your MySQL query statement below
-- SELECT Res.student_id, Res.student_name, Res.subject_name, COUNT(student_id)
-- FROM (SELECT *
--         FROM (Students st JOIN Subjects su)
--         ORDER BY st.student_id, su.subject_name) AS Res
--         LEFT JOIN Examinations E 
--         ON Res.student_id = E.student_id AND Res.subject_name = E.subject_name
--         ORDER BY Res.student_id, Res.subject_name, Res.student_name

SELECT 
    s.student_id,
    s.student_name,
    sub.subject_name,
    COUNT(e.subject_name) AS attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT JOIN Examinations e
    ON s.student_id = e.student_id 
    AND sub.subject_name = e.subject_name
GROUP BY s.student_id, s.student_name, sub.subject_name
ORDER BY s.student_id, sub.subject_name;