package hubitat

// https://docs.hubitat.com/index.php?title=App_Object
// https://docs.smartthings.com/en/latest/ref-docs/smartapp-ref.html
abstract class App extends CommonMethods, Script {

    // From https://docs.smartthings.com/en/latest/smartapp-developers-guide/state.html
    Object atomicState

    // From https://docs.smartthings.com/en/latest/ref-docs/smartapp-ref.html#settings
    Map settings

    // User defined methods

    abstract void installed()

    abstract void updated()

    abstract void uninstalled()

    // Hubitat Provided Methods

    abstract String getApiServerUrl()

    abstract void subscribe(InstalledAppWrapper app, handlerMethod)

    abstract void subscribe(Location location, handlerMethod)

    abstract void subscribe(DeviceWrapper device, String attributeName, handlerMethod, Map options = null)

    abstract void subscribe(List<DeviceWrapper> devices, String attributeName, handlerMethod, Map options = null)

    abstract void subscribe(Location location, String attributeName, handlerMethod, Map options = null)

    abstract void unsubscribe()

    abstract void unsubscribe(DeviceWrapper device)

    abstract void unsubscribe(List<DeviceWrapper> deviceList)

    abstract void unsubscribe(DeviceWrapper device, String attributeName)

    abstract void unsubscribe(List<DeviceWrapper> deviceList, String attributeName)

    abstract void unsubscribe(DeviceWrapper device, String attributeName, String handlerMethod)

    abstract void unsubscribe(List<DeviceWrapper> deviceList, String attributeName, String handlerMethod)

    abstract void unsubscribe(InstalledAppWrapper installedApp)

    abstract void unsubscribe(Location location)

    abstract void unsubscribe(Location location, String attributeName)

    abstract void unsubscribe(String handlerMethod)

    abstract ChildDeviceWrapper addChildDevice(String namespace, String typeName, String deviceNetworkId)

    abstract ChildDeviceWrapper addChildDevice(String namespace, String typeName, String deviceNetworkId, Map properties)

    abstract List<ChildDeviceWrapper> getChildDevices()

    abstract List<ChildDeviceWrapper> getAllChildDevices()

    abstract ChildDeviceWrapper getChildDevice(String deviceNetworkId)

    abstract void deleteChildDevice(String deviceNetworkId)

    abstract Map getState()

    abstract String getHubUID()

    abstract String getFullApiServerUrl()

    abstract String apiServerUrl(String url)

    abstract String getLocalApiServerUrl()

    abstract String getFullLocalApiServerUrl()

    abstract String localApiServerUrl(String url)

    abstract String fullLocalApiServerUrl(String url)

    abstract void setLocationMode(String mode)

    abstract String createAccessToken()

    abstract void pause(Long millisecs)

    abstract InstalledAppWrapper getParent()

    abstract InstalledAppWrapper addChildApp(String namespace, String name, String label, Map properties = null)

    abstract void deleteChildApp(Long childAppId)

    abstract DeviceWrapper getSubscribedDeviceById(Long deviceId)

    abstract void sendEvent(Map properties)

    abstract void sendEvent(DeviceWrapper device, Map properties)

    abstract void sendEvent(String dni, Map properties)

    abstract List<Event> getLocationEventsSince(String attributeName, Date startDate, Map options = null)

    abstract void subscribe(Object thing, String attributeName, handlerMethod, Map options = null)

    abstract List<InstalledApp> getAllChildApps()

    abstract List<InstalledApp> getChildApps()

    abstract InstalledAppWrapper getChildAppById(Long childAppId)

    abstract InstalledAppWrapper getChildAppByLabel(String childAppLabel)
}
