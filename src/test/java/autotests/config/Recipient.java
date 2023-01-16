package autotests.config;

import org.aeonbits.owner.ConfigFactory;

public class Recipient {
    public static RecipientConfig config = ConfigFactory.create(RecipientConfig.class, System.getProperties());
}
