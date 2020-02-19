package hubitat

// https://docs.hubitat.com/index.php?title=EventStream_Interface
abstract class EventStreamInterface {

    abstract void connect(String url, Map options = null)

    abstract void close()
}
