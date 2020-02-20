package hubitat.device

/**
 * https://docs.hubitat.com/index.php?title=HubAction_Object
 * https://docs.smartthings.com/en/latest/ref-docs/hubaction-ref.html
 */
class HubAction {

    HubAction() {}

    HubAction(String request) {}

    HubAction(String request, Protocol protocol, String dni, Map options = null) {}

    HubAction(String request, Protocol protocol, Map options = null) {}

    HubAction(Map params) {}

    HubAction(Map params, String dni, Map options = null) {}

    String getAction() { '' }

    String getCallbackMethod() { '' }

    URI getURI() { URI.create('') }
}
