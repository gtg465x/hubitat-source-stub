package com.hubitat.hub.executor

import com.hubitat.app.*
import com.hubitat.hub.domain.*

/**
 * https://docs.hubitat.com/index.php?title=App_Object
 * https://docs.smartthings.com/en/latest/ref-docs/smartapp-ref.html
 */
abstract class AppExecutor extends BaseExecutor {

    // https://docs.smartthings.com/en/latest/ref-docs/installed-smart-app-wrapper-ref.html
    public final InstalledApp app

    // https://docs.smartthings.com/en/latest/smartapp-developers-guide/preferences-and-settings.html#private-settings
    public final Map<String, String> appSettings

    // https://docs.smartthings.com/en/latest/smartapp-developers-guide/state.html#state-and-atomic-state-overview
    public final Object atomicState

    // App definition methods
    // https://docs.smartthings.com/en/latest/smartapp-developers-guide/anatomy-and-life-cycle-of-a-smartapp.html#definition

    abstract void definition(Map definitionData, Closure closure = null)

    // https://docs.smartthings.com/en/latest/smartapp-developers-guide/preferences-and-settings.html#private-settings
    abstract void appSetting(String name)

    // App preferences methods
    // https://docs.smartthings.com/en/latest/smartapp-developers-guide/preferences-and-settings.html

    abstract void preferences(Closure closure)

    abstract void page(String name, String title, Closure closure = null)

    abstract void page(options = null, Closure closure = null)

    abstract void dynamicPage(String name, String title, Closure closure = null)

    abstract void dynamicPage(options = null, Closure closure = null)

    abstract void section(Closure closure = null)

    abstract void section(String sectionTitle, Closure closure = null)

    abstract void section(options, String sectionTitle = null, Closure closure = null)

    abstract void paragraph(options = null, String text)

    abstract void icon(options)

    abstract void href(options)

    abstract void mode(options)

    abstract void label(options)

    // https://docs.smartthings.com/en/latest/smartapp-developers-guide/parent-child-smartapps.html
    abstract void app(options)

    abstract void input(options = null, String name, String type)

    abstract void input(options)

    abstract void remove(String buttonText, String confirmationText = null, String detailText = null)

    // End of app preferences methods

    abstract String getApiServerUrl()

    abstract void subscribe(InstalledAppWrapper app, handlerMethod)

    abstract void subscribe(Location location, handlerMethod)

    abstract void subscribe(DeviceWrapper device, String attributeName, handlerMethod, Map options = null)

    abstract void subscribe(List<DeviceWrapper> devices, String attributeName, handlerMethod, Map options = null)

    abstract void subscribe(Location location, String attributeName, handlerMethod, Map options = null)

    abstract void unsubscribe()

    abstract void unsubscribe(DeviceWrapper device)

    abstract void unsubscribe(List<DeviceWrapper> deviceList)

    /**
     * @since 2.0.7
     */
    abstract void unsubscribe(DeviceWrapper device, String attributeName)

    /**
     * @since 2.1.0
     */
    abstract void unsubscribe(List<DeviceWrapper> deviceList, String attributeName)

    /**
     * @since 2.1.0
     */
    abstract void unsubscribe(DeviceWrapper device, String attributeName, String handlerMethod)

    /**
     * @since 2.1.0
     */
    abstract void unsubscribe(List<DeviceWrapper> deviceList, String attributeName, String handlerMethod)

    /**
     * @since 2.1.2
     */
    abstract void unsubscribe(InstalledAppWrapper installedApp)

    /**
     * @since 2.1.2
     */
    abstract void unsubscribe(Location location)

    /**
     * @since 2.1.2
     */
    abstract void unsubscribe(Location location, String attributeName)

    /**
     * @since 2.1.2
     */
    abstract void unsubscribe(String handlerMethod)

    /**
     * @since 2.1.9
     */
    abstract ChildDeviceWrapper addChildDevice(String namespace, String typeName, String deviceNetworkId)

    /**
     * @since 2.1.9
     */
    abstract ChildDeviceWrapper addChildDevice(String namespace, String typeName, String deviceNetworkId, Map properties)

    @Deprecated
    abstract ChildDeviceWrapper addChildDevice(String namespace, String typeName, String deviceNetworkId, Long hubId)

    @Deprecated
    abstract ChildDeviceWrapper addChildDevice(String namespace, String typeName, String deviceNetworkId, Long hubId, Map properties)

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

    abstract List<InstalledApp> getAllChildApps()

    abstract List<InstalledApp> getChildApps()

    abstract InstalledAppWrapper getChildAppById(Long childAppId)

    abstract InstalledAppWrapper getChildAppByLabel(String childAppLabel)
}
