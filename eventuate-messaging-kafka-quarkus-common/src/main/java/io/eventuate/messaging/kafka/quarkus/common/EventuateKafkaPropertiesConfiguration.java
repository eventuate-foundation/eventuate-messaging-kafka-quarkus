package io.eventuate.messaging.kafka.quarkus.common;

import io.eventuate.messaging.kafka.common.EventuateKafkaConfigurationProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class EventuateKafkaPropertiesConfiguration {

  @Produces
  public EventuateKafkaConfigurationProperties eventuateKafkaConfigurationProperties(@ConfigProperty(name = "eventuatelocal.kafka.bootstrap.servers")
                                                                                               String bootstrapServers,
                                                                                     @ConfigProperty(name = "eventuatelocal.kafka.connection.validation.timeout", defaultValue = "1000")
                                                                                             long connectionValidationTimeout) {
    return new EventuateKafkaConfigurationProperties(bootstrapServers, connectionValidationTimeout);
  }
}
