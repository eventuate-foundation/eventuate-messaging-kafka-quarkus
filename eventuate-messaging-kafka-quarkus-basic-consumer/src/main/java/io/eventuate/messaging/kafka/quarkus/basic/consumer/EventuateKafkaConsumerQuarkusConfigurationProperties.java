package io.eventuate.messaging.kafka.quarkus.basic.consumer;

import io.eventuate.messaging.kafka.basic.consumer.BackPressureConfig;
import io.quarkus.arc.config.ConfigProperties;

import java.util.Map;

import static io.eventuate.common.json.mapper.JSonMapper.fromJson;

@ConfigProperties(prefix = "eventuate.local.kafka.consumer")
public class EventuateKafkaConsumerQuarkusConfigurationProperties {

  private BackPressureProperties backPressure = new BackPressureProperties();
  private long pollTimeout = 100;
  private String properties = "{}";

  public BackPressureProperties getBackPressure() {
    return backPressure;
  }

  public void setBackPressure(BackPressureProperties backPressure) {
    this.backPressure = backPressure;
  }

  public long getPollTimeout() {
    return pollTimeout;
  }

  public void setPollTimeout(long pollTimeout) {
    this.pollTimeout = pollTimeout;
  }

  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }

  public Map<String, String> getPropertiesAsMap() {
    return fromJson(properties, Map.class);
  }

  public static class BackPressureProperties {
    private int low = 0;
    private int high = Integer.MAX_VALUE;

    public int getLow() {
      return low;
    }

    public void setLow(int low) {
      this.low = low;
    }

    public int getHigh() {
      return high;
    }

    public void setHigh(int high) {
      this.high = high;
    }

    public BackPressureConfig toBackPressureConfig() {
      return new BackPressureConfig(low, high);
    }
  }
}
