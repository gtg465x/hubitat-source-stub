package hubitat.helper.interfaces

/**
 * https://docs.hubitat.com/index.php?title=EventStream_Interface
 */
abstract class EventStream {

    abstract void connect(String url, Map options = null)

    abstract void close()
}
