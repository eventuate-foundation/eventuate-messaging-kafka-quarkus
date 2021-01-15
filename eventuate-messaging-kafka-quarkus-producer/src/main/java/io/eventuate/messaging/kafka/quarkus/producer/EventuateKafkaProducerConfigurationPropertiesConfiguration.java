package io.eventuate.messaging.kafka.quarkus.producer;

import io.eventuate.messaging.kafka.producer.EventuateKafkaProducerConfigurationProperties;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class EventuateKafkaProducerConfigurationPropertiesConfiguration {
  @Produces
  public EventuateKafkaProducerConfigurationProperties eventuateKafkaProducerConfigurationProperties(EventuateKafkaProducerQuarkusConfigurationProperties eventuateKafkaProducerQuarkusConfigurationProperties) {
    return new EventuateKafkaProducerConfigurationProperties(eventuateKafkaProducerQuarkusConfigurationProperties.getPropertiesAsMap());
  }
}
