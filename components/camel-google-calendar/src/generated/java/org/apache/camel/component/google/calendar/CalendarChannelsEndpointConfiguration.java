
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.calendar.Calendar$Channels
 */
@UriParams(apiName = "channels")
@Configurer
public final class CalendarChannelsEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam
    private com.google.api.services.calendar.model.Channel contentChannel;

    public com.google.api.services.calendar.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.calendar.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }
}
