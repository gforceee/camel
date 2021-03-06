
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.Address
 */
@UriParams(apiName = "address")
@Configurer
public final class AddressEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "The city of the new address")
    private String city;
    @UriParam(description = "The name to associate with the new address")
    private String customerName;
    @UriParam(description = "The ISO country code of the new address")
    private String isoCountry;
    @UriParam(description = "The SID of the Account that will be responsible for the new Address resource")
    private String pathAccountSid;
    @UriParam(description = "The unique string that identifies the resource")
    private String pathSid;
    @UriParam(description = "The postal code of the new address")
    private String postalCode;
    @UriParam(description = "The state or region of the new address")
    private String region;
    @UriParam(description = "The number and street address of the new address")
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIsoCountry() {
        return isoCountry;
    }

    public void setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
