package hubitat.helper.interfaces

/**
 * https://docs.hubitat.com/index.php?title=MQTT_Interface
 *
 * @since 2.1.2
 */
abstract class Mqtt {

    abstract void connect(String broker, String clientId, String username, String password, Map options = null)

    abstract void disconnect()

    abstract void subscribe(String topicFilter, int qos = 1)

    abstract boolean isConnected()

    abstract void unsubscribe(String topicFilter)

    abstract void publish(String topic, String payload, int qos = 1, boolean retained = false)

    abstract Map parseMessage(String stringToParse)
}
