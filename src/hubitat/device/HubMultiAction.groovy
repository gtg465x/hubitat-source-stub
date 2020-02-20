package hubitat.device

/**
 * https://docs.hubitat.com/index.php?title=HubMultiAction_Object
 */
class HubMultiAction {

    HubMultiAction() {}

    HubMultiAction(List<String> cmds) {}

    HubMultiAction(List<String> cmds, Protocol protocol) {}

    HubMultiAction(List<String> cmds, Protocol protocol, String deviceNetworkId) {}

    void add(String cmd) {}

    void add(HubAction hubAction) {}

    void add(List hubActions) {}

    void add(HubMultiAction hubMultiAction) {}
}
