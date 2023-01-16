package autotests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/recipient.properties"
})
public interface RecipientConfig extends Config {
    String address();
    String theme();
    String body();
}
