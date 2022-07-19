package libs;

import org.aeonbits.owner.Config;

public interface ConfigProperties extends Config {
	long TIME_FOR_DFFAULT_WAIT();
	long TIME_FOR_EXPLICIT_WAIT_LOW();
	long TIME_FOR_EXPLICIT_WAIT_HIGHT();

	@Key("base_url")
	String base_url();
	String admin_url();
	String prod_url();
	String DATA_FILE();
	String DATA_FILE_PATH();
	String Oracle();
	String MySQL();
	String sqlServer();

	String MySQL_DB();
	String MySQL_DB_USER();
	String MySQL_DB_PASSWORD();
}
