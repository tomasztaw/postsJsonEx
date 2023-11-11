DROP TABLE IF EXISTS Post;

CREATE TABLE Post (
    id VARCHAR NOT NULL,
    title VARCHAR(255) NOT NULL,
    slug VARCHAR(255) NOT NULL,
    "date" DATE NOT NULL,
    time_to_read INT NOT NULL,
    tags VARCHAR(255) NOT NULL,
    version INT,
    PRIMARY KEY (id)
);