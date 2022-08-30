CREATE TABLE IF NOT EXISTS rates
(
    id SERIAL PRIMARY KEY,
    provider text NOT NULL,
    min_weight integer NOT NULL,
    max_weight integer NOT NULL,
    country text NOT NULL,
    price integer NOT NULL
)