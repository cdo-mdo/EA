CREATE TABLE student
(
    name         VARCHAR(255) NOT NULL,
    gpa          DOUBLE       NOT NULL,
    course_title VARCHAR(255) NOT NULL,
    CONSTRAINT pk_student PRIMARY KEY (name)
);

ALTER TABLE student
    ADD CONSTRAINT FK_STUDENT_ON_COURSE_TITLE FOREIGN KEY (course_title) REFERENCES course (title);