package io.eventuate.messaging.kafka.quarkus.producer;

import io.eventuate.common.json.mapper.JSonMapper;
import io.quarkus.arc.config.ConfigProperties;

import java.util.Map;

@ConfigProperties(prefix = "eventuate.local.kafka.producer")
public class EventuateKafkaProducerQuarkusConfigurationProperties {
  private String properties = "{}";

  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }

  public Map<String, String> getPropertiesAsMap() {
    return JSonMapper.fromJson(properties, Map.class);
  }
}
