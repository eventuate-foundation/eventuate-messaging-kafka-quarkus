package io.eventuate.messaging.kafka.quarkus.producer;

import io.eventuate.messaging.kafka.producer.EventuateKafkaProducerConfigurationProperties;

import javax.inject.Singleton;

@Singleton
public class EventuateKafkaProducerConfigurationPropertiesConfiguration {
  @Singleton
  public EventuateKafkaProducerConfigurationProperties eventuateKafkaProducerConfigurationProperties(EventuateKafkaProducerQuarkusConfigurationProperties eventuateKafkaProducerQuarkusConfigurationProperties) {
    return new EventuateKafkaProducerConfigurationProperties(eventuateKafkaProducerQuarkusConfigurationProperties.getPropertiesAsMap());
  }
}
