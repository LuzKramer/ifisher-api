-- Enable the uuid-ossp extension for UUID generation
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Create the 'users' table
CREATE TABLE users (
    uuid UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    premium BOOLEAN,
    role TEXT NOT NULL DEFAULT 'user',
    img TEXT
);

-- Create the 'fishes' table
CREATE TABLE fishes (
    id SERIAL PRIMARY KEY,
    pop_name TEXT NOT NULL,
    sci_name TEXT NOT NULL,
    img TEXT
);

-- Create the 'marks' table
CREATE TABLE marks (
    id SERIAL PRIMARY KEY,
    description TEXT,
    lat TEXT NOT NULL,
    long TEXT NOT NULL,
    weight REAL,
    type TEXT NOT NULL DEFAULT 'catch',
    datetime TIMESTAMP NOT NULL,
    fish_id INT NOT NULL REFERENCES fishes(id),
    user_id UUID NOT NULL REFERENCES users(uuid)
);

-- Create the 'images' table
CREATE TABLE images (
    uuid UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    path TEXT NOT NULL,
    mark_id INT NOT NULL REFERENCES marks(id)
);
