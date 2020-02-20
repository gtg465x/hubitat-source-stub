package hubitat.zigbee

/**
 * https://docs.hubitat.com/index.php?title=Zigbee_Object
 * https://docs.smartthings.com/en/latest/ref-docs/zigbee-ref.html
 */
abstract class Zigbee {

    // Undocumented value
    private int STANDARD_DELAY_INT

    abstract ZigbeeCluster clusterLookup(int value)

    abstract ZigbeeCluster clusterLookup(String value)

    abstract List on()

    abstract List on(int delay)

    abstract List off()

    abstract List off(int delay)

    abstract List groupOn(Integer groupID)

    abstract List groupOn(Integer groupID, int delay)

    abstract List groupOff(Integer groupID)

    abstract List groupOff(Integer groupID, int delay)

    abstract Map parseDescriptionAsMap(String description)

    abstract List onOffConfig()

    abstract List onOffConfig(Integer minRefreshInterval, Integer maxRefreshInterval)

    abstract List levelRefresh()

    abstract List levelRefresh(int delay)

    abstract List levelConfig()

    abstract List colorTemperatureRefresh()

    abstract List colorTemperatureRefresh(int delay)

    abstract List colorTemperatureConfig()

    abstract List batteryConfig()

    abstract List refreshData(String attr1, String attr2)

    abstract List electricMeasurementPowerRefresh(int delay = STANDARD_DELAY_INT)

    abstract List setColorTemperature(BigDecimal value, int delay = STANDARD_DELAY_INT)

    abstract List setColorTemperature(String value, int delay = STANDARD_DELAY_INT)

    abstract List setColorTemperature(Integer value, int delay = STANDARD_DELAY_INT)

    abstract List setGroupColorTemperature(Integer groupID, BigDecimal value, int delay = STANDARD_DELAY_INT)

    abstract List setGroupColorTemperature(Integer groupID, String value, int delay = STANDARD_DELAY_INT)

    abstract List setGroupColorTemperature(Integer groupID, Integer value, int delay = STANDARD_DELAY_INT)

    abstract List setSaturation(Integer value, int delay = STANDARD_DELAY_INT)

    abstract List setHue(Integer value, int delay = STANDARD_DELAY_INT)

    abstract List setColor(Map value, int delay = STANDARD_DELAY_INT)

    abstract List setLevel(BigDecimal level)

    abstract List setLevel(Integer level, Integer rate = 0xFFFF)

    abstract List setGroupLevel(Integer groupID, BigDecimal level)

    abstract List setGroupLevel(Integer groupID, Integer level)

    abstract List setGroupLevel(Integer groupID, BigDecimal level, BigDecimal rate)

    abstract List setGroupLevel(Integer groupID, Integer level, Integer rate)

    abstract List temperatureConfig()

    abstract List temperatureConfig(Integer minRefreshInterval, Integer maxRefreshInterval)

    abstract List configureReporting(Integer clusterId, Integer attributeId, Integer dataType, Integer minReportTime, Integer maxReportTime, Integer reportableChange = null, Map additionalParams = [:], int delay = STANDARD_DELAY_INT)

    abstract List enrollResponse()

    abstract List command(Integer cluster, Integer command, Map additionalParams, int delay = STANDARD_DELAY_INT, String... payload)

    abstract List command(Integer cluster, Integer command, String... payload)

    abstract List readAttribute(Integer cluster, Integer attributeId, Map additionalParams = [:], int delay = STANDARD_DELAY_INT)

    abstract List readAttribute(Integer cluster, List<Integer> attributeIds, Map additionalParams = [:], int delay = STANDARD_DELAY_INT)

    abstract List writeAttribute(Integer cluster, Integer attributeId, Integer dataType, Integer value, Map additionalParams = [:], int delay = STANDARD_DELAY_INT)

    abstract Map getEvent(String description)

    abstract Map getKnownDescription(String description)

    abstract ZoneStatus parseZoneStatus(String description)

    abstract SmartShield parse(String description)

    abstract String convertToHexString(Integer value, Integer width)

    abstract Integer convertHexToInt(String value)

    abstract String hex2String(String arg)

    abstract String swapOctets(String bytes)
}
