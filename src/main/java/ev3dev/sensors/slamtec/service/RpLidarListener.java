package ev3dev.sensors.slamtec.service;

/**
 * Listener for client of {@link RpLidarLowLevelDriver}
 *
 * @author Peter Abeles
 */
public interface RpLidarListener {

	public void handleMeasurement(RpLidarMeasurement measurement);

	public void handleDeviceHealth(RpLidarHeath health);

	public void handleDeviceInfo(RpLidarDeviceInfo info);
}