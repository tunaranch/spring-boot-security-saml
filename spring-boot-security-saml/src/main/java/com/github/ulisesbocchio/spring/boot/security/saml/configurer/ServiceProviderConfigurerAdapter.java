package com.github.ulisesbocchio.spring.boot.security.saml.configurer;

import com.github.ulisesbocchio.spring.boot.security.saml.annotation.EnableSAMLSSO;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;

/**
 * Simple Adapter for {@link ServiceProviderConfigurer} to be used in conjunction with {@link EnableSAMLSSO} and
 * wanting to further customize the SAML Service Provider using the DSL provided by {@link
 * ServiceProviderBuilder}, which exposes most aspects of configuring Spring Security SAML. Users of this
 * interface are encouraged to use {@link ServiceProviderConfigurerAdapter} which is the default implementation with
 * empty methods, so users can choose which method to actually override.
 * <p>
 * The following is a basic example:
 * <pre>
 *    {@literal @}Configuration
 *     public static class MyServiceProviderConfig extends ServiceProviderConfigurerAdapter {
 *        {@literal @}Override
 *         public void configure(ServiceProviderSecurityBuilder serviceProvider) throws Exception {
 *             serviceProvider
 *                 .metadataGenerator()
 *                 .entityId("localhost-demo")
 *             .and()
 *                 .sso()
 *                 .defaultSuccessURL("/home")
 *                 .idpSelectionPageUrl("/idpselection")
 *             .and()
 *                 .logout()
 *                 .defaultTargetUrl("/")
 *             .and()
 *                 .metadataManager()
 *                 .metadataLocations("classpath:/idp-ssocircle.xml")
 *                 .refreshCheckInterval(0)
 *             .and()
 *                 .extendedMetadata()
 *                 .idpDiscoveryEnabled(true)
 *             .and()
 *                 .keyManager()
 *                 .privateKeyDerLocation("classpath:/localhost.key.der")
 *                 .publicKeyPemLocation("classpath:/localhost.cert");
 *         }
 *     }
 * </pre>
 * </p>
 *
 * @author Ulises Bocchio
 * @see ServiceProviderConfigurerAdapter
 * @see ServiceProviderBuilder
 * @see EnableSAMLSSO
 */
public class ServiceProviderConfigurerAdapter implements ServiceProviderConfigurer {

    /**
     * {@inheritDoc}
     */
    @Override
    public void configure(ServiceProviderBuilder serviceProvider) throws Exception {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void configure(WebSecurity web) {
    }
}
