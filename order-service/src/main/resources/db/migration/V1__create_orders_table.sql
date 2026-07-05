CREATE TABLE orders (
    id UUID PRIMARY KEY,
    customer_id BIGINT NOT NULL,
    restaurant_id BIGINT NOT NULL,
    status VARCHAR(32) NOT NULL,
    created_at TIMESTAMPTZ NOT NULL,
    updated_at TIMESTAMPTZ NOT NULL,
    CONSTRAINT chk_orders_status CHECK (
        status IN ('CREATED', 'ASSIGNED', 'IN_TRANSIT', 'DELIVERED', 'CANCELLED')
    )
);

CREATE INDEX idx_orders_customer_id ON orders (customer_id);
CREATE INDEX idx_orders_restaurant_id ON orders (restaurant_id);
CREATE INDEX idx_orders_status ON orders (status);
