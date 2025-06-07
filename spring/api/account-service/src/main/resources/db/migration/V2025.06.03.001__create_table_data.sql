CREATE TABLE data (
  id BIGSERIAL PRIMARY KEY,
  registro_id BIGINT NOT NULL,
  sensor TEXT NOT NULL,
  data TIMESTAMP NOT NULL,
  id_sensor SMALLINT NOT NULL,
  delta INTEGER NOT NULL,
  bateria SMALLINT NOT NULL,
  ocupado SMALLINT,          
  h2s REAL,                             
  umidade REAL,                          
  nh3 REAL,                           
  temperatura REAL                      
);


CREATE INDEX idx_data_data_id_sensor ON data (data, id_sensor);
CREATE INDEX idx_data_id_sensor ON data (id_sensor);
