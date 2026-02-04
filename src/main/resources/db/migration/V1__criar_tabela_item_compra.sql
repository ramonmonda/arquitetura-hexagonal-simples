CREATE TABLE item_compra (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    comprado BOOLEAN NOT NULL
);
